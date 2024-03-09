package groww.pageobject;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import groww.uistore.HomePage;
import groww.utilities.ExcelReader;
import groww.utilities.LoggerHandler;
import groww.utilities.WebDriverHelper;

public class HomePageObject {
	
	String path = "G:/FreeLenserProject/GrowwHybrid/TestData/testdata.xlsx";
	
	HomePage homepage = new HomePage();
	
	ExcelReader reader = new ExcelReader();
	
	public void clickOnSearchBox(WebDriver driver,ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			helper.ElementToBeClickable(homepage.searchbox,20);
			helper.ClickOnElement(homepage.searchbox);
			
			test.pass("Click on Search Box Successed .");
			LoggerHandler.logInfo("Click on Search Box Successed .");
		}
		catch(Exception e) {
			test.fail("Click on Search Box Failed .");
			LoggerHandler.logError("Click on Search Box Failed .");
			e.getMessage();
		}
	}
	
	public void enterDataOnSearchBox(WebDriver driver,ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			String data = reader.readDataFromExcel(path,"Groww",1,0);
			helper.ElementToBeClickable(homepage.searchbox,20);
			helper.SendKeys(homepage.searchbox,data);
			
			test.pass("Enter Data " + data + " on Search Box Successed .");
			LoggerHandler.logInfo("Enter Data " + data + " on Search Box Successed .");
		}
		catch(Exception e) {
			test.fail("Enter Data on Search Box Failed .");
			LoggerHandler.logError("Enter Data on Search Box Failed .");
			e.getMessage();
		}
	}
	
	public void clickOnSearchItem(WebDriver driver,ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			helper.ElementToBeClickable(homepage.searchbox,20);
			
			helper.EnterKeys(homepage.searchbox);
			
			test.pass("Click on Search Item Successed .");
			LoggerHandler.logInfo("Click on Search Item Successed .");
		}
		catch(Exception e) {
			test.fail("Click on Search Item Failed .");
			LoggerHandler.logError("Click on Search Item Failed .");
			e.getMessage();
		}
	}
	
	public void clickOnCalculators(WebDriver driver,ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			helper.ElementToBeClickable(homepage.calculators,20);
			helper.ClickOnElement(homepage.calculators);
			
			test.pass("Click on Calculators Successed .");
			LoggerHandler.logInfo("Click on Calculators Successed .");
		}
		catch(Exception e) {
			test.fail("Click on Calculators Failed .");
			LoggerHandler.logError("Click on Calculators Failed .");
			e.getMessage();
		}
	}
	
	public void clickOnAmcMutualFund(WebDriver driver,ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			helper.ElementToBeClickable(homepage.amcMutualFund,20);
			helper.ClickOnElement(homepage.amcMutualFund);
			
			test.pass("Click on AMC Mutual Fund Successed .");
			LoggerHandler.logInfo("Click on AMC Mutual Fund Successed .");
		}
		catch(Exception e) {
			test.fail("Click on AMC Mutual Fund Failed .");
			LoggerHandler.logError("Click on AMC Mutual Fund Failed .");
			e.getMessage();
		}
	}
}
