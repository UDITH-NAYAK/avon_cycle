// ExcelReader.java
// Author: Udith
// Date: 27/1/2025
// Description: Utility class for reading data from Excel files using Apache POI library

package utils;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
    static XSSFWorkbook workbook;
    static XSSFSheet sheet;
    static FileInputStream fInput;

    /**
     * Reads data from the specified row and cell in the Excel sheet.
     * @param row the row number (0-based index)
     * @param cell the cell number (0-based index)
     * @return the data as a String from the specified cell
     */
    public static String readData(int row, int cell) {
        try {
            fInput = new FileInputStream(PropertiesReader.getPropertyValue("EXCEL_TEST_DATA_PATH"));
            workbook = new XSSFWorkbook(fInput);
            sheet = workbook.getSheet("Sheet1");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return sheet.getRow(row).getCell(cell).toString();
    }

    /**
     * Gets the value associated with the specified key from the Excel sheet.
     * Assumes the key is in the first column and the value is in the second column.
     * @param key the key to search for in the first column
     * @return the value associated with the specified key as a String, or null if the key is not found
     */
    public static String getValueByKey(String key) {
        String value = null;
        try {
            fInput = new FileInputStream(PropertiesReader.getPropertyValue("EXCEL_TEST_DATA_PATH"));
            workbook = new XSSFWorkbook(fInput);
            sheet = workbook.getSheet("Sheet1");

            for (Row row : sheet) {
                if (row.getCell(0).toString().equalsIgnoreCase(key)) {
                    value = row.getCell(1).toString(); 
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (workbook != null) workbook.close();
                if (fInput != null) fInput.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return value;
    }
}
