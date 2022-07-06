package org.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demoBaseClass {
	public static WebDriver driver;
	public static Select select;

	public static void chromeBrowserObj() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	public static void maximize() {
		driver.manage().window().maximize();
	}
	public static void implicitWait() {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	public static void enterUrl(String url) {
		driver.get(url);
	}
	public static void sendText(WebElement element, String text) {
		element.sendKeys(text);
	}
	public static void click(WebElement element) {
		element.click();
	}
	public static void selectObj(WebElement element) {
		select = new Select(element);
	}
	public static void selectDropDown(String text) {
		select.selectByVisibleText(text);
	}
	public static String getExcelSheet(String sheetname,int rowIndex,int cellnum) throws IOException {
		File  fi = new File("C:\\Users\\Prithiv\\eclipse-workspace\\Cucumber\\ExcelSheet\\register.xlsx");
		FileInputStream file = new FileInputStream(fi);
		Workbook book = new XSSFWorkbook(file);
		org.apache.poi.ss.usermodel.Sheet sheet = book.getSheet(sheetname);
		Row row = sheet.getRow(rowIndex);
		org.apache.poi.ss.usermodel.Cell cell= row.getCell(cellnum);
		int type = cell.getCellType();
		String name ="";
		if (type==1) {
			name = ((org.apache.poi.ss.usermodel.Cell) cell).getStringCellValue();

		}
		else if (DateUtil.isCellDateFormatted(cell)) {
			java.util.Date date = cell.getDateCellValue();
			SimpleDateFormat f= new SimpleDateFormat("dd,MMMM,yyyy");
			name = f.format(f);
		}
		else {
			double numeric= cell.getNumericCellValue();
			long l = (long)numeric;
			name=String.valueOf(l);
		}
		return name;

	}
}
