package seleniumOperations;

//📖 Reading from .xlsx (Apache POI)

/**
 * | Task                    | Method / Approach                                                             |
 * | ----------------------- | ----------------------------------------------------------------------------- |
 * | Load existing workbook  | `XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream("file.xlsx"));` |
 * | Get sheet by name/index | `XSSFSheet sheet = workbook.getSheet("Sheet1");`<or>`workbook.getSheetAt(0);` |
 * | Get row                 | `XSSFRow row = sheet.getRow(rowNum);`                                         |
 * | Get cell                | `XSSFCell cell = row.getCell(colNum);`                                        |
 * | Read string from cell   | `cell.getStringCellValue();`                                                  |
 * | Read number from cell   | `cell.getNumericCellValue();`                                                 |
 * | Read boolean from cell  | `cell.getBooleanCellValue();`                                                 |
 * | Detect cell type        | `cell.getCellType();`                                                         |
 * | Count rows              | `sheet.getLastRowNum();`                                                      |
 * | Count columns in a row  | `row.getLastCellNum();`                                                       |
 */

//✍️ Writing to .xlsx (Apache POI)

/**
 * | Task                        | Method / Approach                                                                             |
 * | --------------------------- | --------------------------------------------------------------------------------------------- |
 * | Create new workbook         | `XSSFWorkbook workbook = new XSSFWorkbook();`                                                 |
 * | Create new sheet            | `XSSFSheet sheet = workbook.createSheet("Sheet1");`                                           |
 * | Create row                  | `XSSFRow row = sheet.createRow(rowNum);`                                                      |
 * | Create cell                 | `XSSFCell cell = row.createCell(colNum);`                                                     |
 * | Write string to cell        | `cell.setCellValue("Text");`                                                                  |
 * | Write numeric value to cell | `cell.setCellValue(123.45);`                                                                  |
 * | Write boolean to cell       | `cell.setCellValue(true);`                                                                    |
 * | Auto-size column            | `sheet.autoSizeColumn(colIndex);`                                                             |
 * | Remove row                  | `sheet.removeRow(row);`                                                                       |
 * | Remove cell                 | `row.removeCell(cell);`                                                                       |
 * | Create cell style           | `XSSFCellStyle style = workbook.createCellStyle();`                                           |
 * | Set cell style to cell      | `cell.setCellStyle(style);`                                                                   |
 * | Set font (bold/color etc.)  | `XSSFFont font = workbook.createFont(); style.setFont(font);`                                 |
 * | Save workbook to file       | `FileOutputStream out = new FileOutputStream("file.xlsx"); workbook.write(out); out.close();` |
 * | Close workbook              | `workbook.close();`                                                                           |
 */
public class HandlingExcelFies {
    public static void main(String[] args) {


    }
}
