package Utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	static String projectPath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	static String cellDataString;
	static double cellDataNum;

	public ExcelUtils(String excelPath, String sheetName) {

		// projectPath = System.getProperty("user.dir");
		try {
			workbook = new XSSFWorkbook(excelPath);
			sheet = workbook.getSheet(sheetName);

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public static void getRowCount() {

		int rowCount = sheet.getPhysicalNumberOfRows();
		System.out.println(rowCount);

	}

	public static String getCellDataString(int rowNum, int colNum) {

		cellDataString = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		System.out.println(cellDataString);

		return cellDataString;

	}

	public static double getCellDataNumber(int rowNum, int colNum) {

		cellDataNum = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
		System.out.println(cellDataNum);

		return cellDataNum;
	}

}