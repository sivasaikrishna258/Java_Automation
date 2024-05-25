package com.CRM.qa.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.CRM.qa.BaseClass.TestBase;

public class UtilClass extends TestBase {

	//static Actions act=new Actions(driver);
	public static void takeScreenshotAtEndOfTest() throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(scrFile, new File(currentDir + "/failedscreenshots/" + System.currentTimeMillis() + ".png"));
		
	}
	
	public static void clickOn(WebDriver driver1, WebElement element, int timeout){
		
			//act.moveToElement(element).perform();;
			new WebDriverWait(driver1,   
			Duration.ofSeconds(timeout)).until(ExpectedConditions.elementToBeClickable(element));  
		
			element.click();  			
}
	
	public static  Object[][] getTestData(String sheetName) throws IOException {
		
		FileInputStream file =new FileInputStream("C:\\Users\\Sai Prathap\\Mycode\\HybridFramewok\\Testdata\\Testdata.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file); //creating object of workbook
		XSSFSheet sheet=workbook.getSheet(sheetName);		//getting yhe sheet from workbook object
		
		int numberofrows=sheet.getPhysicalNumberOfRows();//gives total number of rows
	
		int coloumns=sheet.getRow(0).getLastCellNum();//
		int a=sheet.getLastRowNum();
		Object data[][]=new Object[a][coloumns];
		for(int i=0;i<a;i++) {
			for(int k=0;k<coloumns;k++) {
			
				
				data[i][k]=sheet.getRow(i+1).getCell(k).getStringCellValue();   //data[0][0]=r[1]c[0]
				//data[i][1]=sheet.getRow(i+1).getCell(1).getStringCellValue();    //data[0][1]=r[1]c[1]
			}	
			
		}
		return data;
		
		
		
		
	}

	
}