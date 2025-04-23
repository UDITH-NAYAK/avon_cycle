package utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.google.common.io.Files;

/**
 * This class handles reporting with ExtentReports and captures screenshots.
 */
public class Reporter {
	ExtentReports report;
	ExtentSparkReporter spark;
	public TakesScreenshot ts;
	LoggerHandler loggerHandler = new LoggerHandler();

	/**
	 * Generates an ExtentReport with system information.
	 * 
	 * @param reportName The name of the report.
	 */
	public void generateReport(String reportName) {
		try {
			String path = System.getProperty("user.dir") + "/reports/" + reportName + ".html";

			spark = new ExtentSparkReporter(path);
			report = new ExtentReports();
			report.attachReporter(spark);

			report.setSystemInfo("OS Name:", System.getProperty("os.name"));
			report.setSystemInfo("OS Version:", System.getProperty("os.version"));
			report.setSystemInfo("Java Version:", System.getProperty("java.runtime.version"));
			report.setSystemInfo("User Directory:", System.getProperty("user.dir"));
			loggerHandler.info("Report is created and started " + reportName);
		} catch (Exception e) {
			loggerHandler.error("Failed to generate report: " + reportName + " : " + e.getMessage());
		}
	}

	/**
	 * Creates a new test in the ExtentReports instance.
	 * 
	 * @param testName The name of the test to create.
	 * @return An ExtentTest instance representing the new test.
	 */
	public ExtentTest createTest(String testName) {
		try {
			if (report == null) {
				throw new IllegalStateException("Report has not been generated. Call generateReport() first.");
			}
			loggerHandler.info("In report a new test is created with name " + testName);
			return report.createTest(testName);

		} catch (Exception e) {
			loggerHandler.error("Failed to create test: " + testName + " : " + e.getMessage());
			return null;
		}
	}

	/**
	 * Captures a screenshot and saves it to the reports directory.
	 * 
	 * @param filename The base name of the screenshot file.
	 * @return The path of the saved screenshot.
	 */
	public String captureScreenShot(String filename) {
		try {
			String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
			String name = filename + timestamp + ".png";
			ts = (TakesScreenshot) Base.driver;
			File file = ts.getScreenshotAs(OutputType.FILE);
			String path = System.getProperty("user.dir") + "/reports/" + name;
			File target = new File(System.getProperty("user.dir") + "/reports", name);
			Files.copy(file, target);
			return path;
		} catch (IOException e) {
			loggerHandler.error("Failed to capture screenshot: " + filename + " : " + e.getMessage());
			return null;
		}
	}

	/**
	 * Captures a screenshot and returns it as a Base64 encoded string.
	 * 
	 * @param filename The base name of the screenshot file.
	 * @return The Base64 encoded screenshot.
	 */
	public File captureScreenShotAsBase64(String filename) {
		try {
			ts = (TakesScreenshot) Base.driver;
			return ts.getScreenshotAs(OutputType.FILE);
		} catch (Exception e) {
			loggerHandler.error("Failed to capture screenshot as Base64: " + filename + " : " + e.getMessage());
			return null;
		}
	}

	/**
	 * Adds a screenshot to the ExtentTest report.
	 * 
	 * @param name The name of the screenshot.
	 * @param test The ExtentTest instance.
	 */
	public void addScreenshottoReportAsBase64(String name, ExtentTest test) {
		try {
			// test.log(Status.INFO,
			// 		MediaEntityBuilder.createScreenCaptureFromBase64String(captureScreenShotAsBase64(name)).build());
			loggerHandler.info("In report a Screenshots with name " + name);
		} catch (Exception e) {
			loggerHandler.error("Failed to add screenshot to report: " + name + " : " + e.getMessage());
		}
	}

	/**
	 * Adds a screenshot to the ExtentTest report.
	 * 
	 * @param name The name of the screenshot.
	 * @param test The ExtentTest instance.
	 */
	public void addScreenshottoReport(String name, ExtentTest test) {
		try {
			File screenshotFile = captureScreenShotAsBase64(name);
			if (screenshotFile != null) {
				String screenshotPath = captureScreenShot(name);
				test.log(Status.INFO, "Screenshot taken: " + name,
						MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
				loggerHandler.info("In report a screenshot with name " + name);
			} else {
				loggerHandler.error("Screenshot file is null for " + name);
			}
		} catch (Exception e) {
			loggerHandler.error("Failed to add screenshot to report: " + name + " : " + e.getMessage());
		}
	}

	/**
	 * Adds an info-level log message in a report.
	 * 
	 * @param message The message to log.
	 */
	public void addLogInfo(String message, ExtentTest test) {
		try {
			if (report == null) {
				throw new IllegalStateException("Report has not been generated. Call generateReport() first.");
			}
			test.log(Status.INFO, message);
			loggerHandler.info(message);
		} catch (Exception e) {
			loggerHandler.error("Failed to add info log: " + message + " : " + e.getMessage());
		}
	}

	/**
	 * Logs and reports an fail message.
	 * 
	 * @param message the error message to be logged and reported.
	 * @param test    the ExtentTest instance for reporting.
	 */
	public void addLogFail(String message, ExtentTest test) {
		try {
			if (report == null) {
				throw new IllegalStateException("Report has not been generated. Call generateReport() first.");
			}
			test.log(Status.FAIL, message);
			loggerHandler.error(message);
			addScreenshottoReport(message + " Screenshot", test);
		} catch (Exception e) {
			loggerHandler.error("Failed to add fail log: " + message + " : " + e.getMessage());
		}
	}

	/**
	 * Flushes the ExtentReports
	 */
	public void flushing() {
		try {
			report.flush();
			loggerHandler.info("Report is saved ");
		} catch (Exception e) {
			loggerHandler.error("Failed to flush the ExtentReports instance." + " : " + e.getMessage());

		}
	}
}
