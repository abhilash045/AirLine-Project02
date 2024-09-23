package UtilityPackage;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class DataDrivenTesting {

	public static String un;

	public static String pswd;

	@Test
	public void DDT_01() throws EncryptedDocumentException, IOException {

		FileInputStream Input = new FileInputStream(
				"C:\\Users\\USER\\eclipse-workspace\\AirLine\\DDT\\Project02.xlsx");

		Workbook w1 = WorkbookFactory.create(Input);

		un = w1.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();

		pswd = w1.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();

	}

	// ---INVALID Credentials-------------------------------------------------------------------------------//

	public static String un1;

	public static String pswd2;

	public void DDT_02() throws EncryptedDocumentException, IOException {

		FileInputStream Input1 = new FileInputStream(
				"C:\\Users\\USER\\eclipse-workspace\\AirLine _Project02\\DDT\\Project02.xlsx");

		Workbook w2 = WorkbookFactory.create(Input1);

		un1 = w2.getSheet("Sheet2").getRow(0).getCell(0).getStringCellValue();

		pswd2 = w2.getSheet("Sheet2").getRow(0).getCell(1).getStringCellValue();

	}

}
