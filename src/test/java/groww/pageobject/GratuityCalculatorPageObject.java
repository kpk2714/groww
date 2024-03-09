package groww.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.aventstack.extentreports.ExtentTest;

import groww.uistore.GratuityCalculatorPage;
import groww.utilities.ExcelReader;
import groww.utilities.LoggerHandler;
import groww.utilities.WebDriverHelper;

public class GratuityCalculatorPageObject {

	GratuityCalculatorPage gratuityCalculatorPage = new GratuityCalculatorPage();
	
	String path = System.getProperty("user.dir")+"/TestData/testdata.xlsx";
	ExcelReader reader = new ExcelReader();
	
	public void enterMonthlySalary(WebDriver driver,ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			String data = reader.readDataFromExcel(path,"Groww", 1, 20);
			String amount = "";
			for(int i=0;i<data.length()-2;i++) {
				amount = amount + data.charAt(i);
			}
			
			helper.ElementToBeClickable(gratuityCalculatorPage.monthlySalary,20);
			helper.ClickOnElement(gratuityCalculatorPage.monthlySalary);
			helper.ClearInput(gratuityCalculatorPage.monthlySalary);
			helper.SendKeys(gratuityCalculatorPage.monthlySalary,amount);
			
			test.pass("Enter Monthly Salary "+amount+" Successed .");
			LoggerHandler.logInfo("Enter Monthly Salary "+amount+" Successed .");
		}
		catch(Exception e) {
			test.fail("Enter Monthly Salary Failed .");
			LoggerHandler.logError("Enter Monthly Salary Failed .");
			e.getMessage();
		}
	}
	
	public void enterYearofService(WebDriver driver,ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			String data = reader.readDataFromExcel(path,"Groww", 2, 20);
			String year = "";
			for(int i=0;i<data.length()-2;i++) {
				year = year + data.charAt(i);
			}
			
			helper.ElemenetToBeLocated(gratuityCalculatorPage.dragYear, 20);
			Actions action = new Actions(driver);
			WebElement element = helper.FindElement(gratuityCalculatorPage.dragYear);
			action.dragAndDropBy(element,227,0).perform();
			
			test.pass("Enter Year of Service " + year +" Successed .");
			LoggerHandler.logInfo("Enter Year of Service " + year +" Successed .");
		}
		catch(Exception e) {
			test.fail("Enter Year of Service Failed .");
			LoggerHandler.logError("Enter Year of Service Failed .");
			e.getMessage();
		}
	}
	
	public void displayGratuityAmount(WebDriver driver,ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			Thread.sleep(1000);
			helper.ElemenetToBeLocated(gratuityCalculatorPage.gratuityAmount,20);
			String amount = helper.GetText(gratuityCalculatorPage.gratuityAmount);
			
			test.pass("Enter Year of Service is "+amount);
			LoggerHandler.logInfo("Enter Year of Service is "+amount);
		}
		catch(Exception e) {
			test.fail("Enter Year of Service Failed .");
			LoggerHandler.logError("Enter Year of Service Failed .");
			e.getMessage();
		}
	}
}
