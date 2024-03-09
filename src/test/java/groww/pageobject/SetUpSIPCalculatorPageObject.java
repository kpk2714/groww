package groww.pageobject;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import groww.uistore.SetUpSIPCalculatorPage;
import groww.utilities.ExcelReader;
import groww.utilities.LoggerHandler;
import groww.utilities.WebDriverHelper;

public class SetUpSIPCalculatorPageObject {

	SetUpSIPCalculatorPage setUpSIPCalculatorPage = new SetUpSIPCalculatorPage();
	
	String path = System.getProperty("user.dir")+"/TestData/testdata.xlsx";
	
	ExcelReader reader = new ExcelReader();
	
	public void enterMonthlyInvestment(WebDriver driver , ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			String data = reader.readDataFromExcel(path,"Groww",1,19);
			String amount = "";
			for(int i=0;i<data.length()-2;i++) {
				amount = amount + data.charAt(i);
			}
			
			helper.ElementToBeClickable(setUpSIPCalculatorPage.monthlyInvestment,20);
			helper.ClickOnElement(setUpSIPCalculatorPage.monthlyInvestment);
			helper.ClearInput(setUpSIPCalculatorPage.monthlyInvestment);
			helper.SendKeys(setUpSIPCalculatorPage.monthlyInvestment,amount);
			
			test.pass("Enter Monthly Investment "+amount+" Successed .");
			LoggerHandler.logInfo("Enter Monthly Investment "+amount+" Successed .");
		}
		catch(Exception e) {
			test.fail("Enter Monthly Investment Failed .");
			LoggerHandler.logError("Enter Monthly Investment Failed .");
			e.getMessage();
		}
	}
	
	public void enterAnnualSetUpRate(WebDriver driver , ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			String data = reader.readDataFromExcel(path,"Groww",2,19);
			String setUpRate = "";
			for(int i=0;i<data.length()-2;i++) {
				setUpRate = setUpRate + data.charAt(i);
			}

			helper.ElementToBeClickable(setUpSIPCalculatorPage.annualSetUp,20);
			helper.ClickOnElement(setUpSIPCalculatorPage.annualSetUp);
			helper.ClearInput(setUpSIPCalculatorPage.annualSetUp);
			helper.SendKeys(setUpSIPCalculatorPage.annualSetUp,"5");
			
			test.pass("Enter Annual Set Up "+setUpRate+" Successed .");
			LoggerHandler.logInfo("Enter Annual Set Up "+setUpRate+" Successed .");
		}
		catch(Exception e) {
			test.fail("Enter Annual Set Up Failed .");
			LoggerHandler.logError("Enter Annual Set Up Failed .");
			e.getMessage();
		}
	}
	
	
	public void enterReturnRate(WebDriver driver , ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			String returnRate = reader.readDataFromExcel(path,"Groww",3,19);

			helper.ElementToBeClickable(setUpSIPCalculatorPage.returnRate,20);
			helper.ClickOnElement(setUpSIPCalculatorPage.returnRate);
			helper.ClearInput(setUpSIPCalculatorPage.returnRate);
			helper.SendKeys(setUpSIPCalculatorPage.returnRate,returnRate);
			
			test.pass("Enter Return Rate "+returnRate+" Successed .");
			LoggerHandler.logInfo("Enter Return Rate "+returnRate+" Successed .");
		}
		catch(Exception e) {
			test.fail("Enter Return Rate Failed .");
			LoggerHandler.logError("Enter Return Rate Failed .");
			e.getMessage();
		}
	}
	
	public void enterTimePeriod(WebDriver driver , ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			String data = reader.readDataFromExcel(path,"Groww",4,19);
			String timePeriod = "";
			for(int i=0;i<data.length()-2;i++) {
				timePeriod = timePeriod + data.charAt(i);
			}

			helper.ElementToBeClickable(setUpSIPCalculatorPage.timePeriod,20);
			helper.ClickOnElement(setUpSIPCalculatorPage.timePeriod);
			helper.ClearInput(setUpSIPCalculatorPage.timePeriod);
			helper.SendKeys(setUpSIPCalculatorPage.timePeriod,timePeriod);
			
			test.pass("Enter Time Period "+timePeriod+" Successed .");
			LoggerHandler.logInfo("Enter Time Period "+timePeriod+" Successed .");
		}
		catch(Exception e) {
			test.fail("Enter Time Period Failed .");
			LoggerHandler.logError("Enter Time Period Failed .");
			e.getMessage();
		}
	}
	
	public void displayInvestedAmount(WebDriver driver , ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			helper.ScrollByThreeHundred();
			Thread.sleep(1000);
			helper.ElemenetToBeLocated(setUpSIPCalculatorPage.investedAmount,20);
			String amount = helper.GetText(setUpSIPCalculatorPage.investedAmount);
			
			test.pass("Invested Amount is "+amount);
			LoggerHandler.logInfo("Invested Amount is "+amount);
		}
		catch(Exception e) {
			test.fail("Display Invested Amount Failed .");
			LoggerHandler.logError("Display Invested Amount Failed .");
			e.getMessage();
		}
	}
	
	public void displayEstimateReturn(WebDriver driver , ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			helper.ElemenetToBeLocated(setUpSIPCalculatorPage.returnAmount,20);
			String amount = helper.GetText(setUpSIPCalculatorPage.returnAmount);
			
			test.pass("Est. Returns is "+amount);
			LoggerHandler.logInfo("Est. Returns is "+amount);
		}
		catch(Exception e) {
			test.fail("Display Est. Returns Failed .");
			LoggerHandler.logError("Display Est. Returns Failed .");
			e.getMessage();
		}
	}
	
	public void displayTotalValue(WebDriver driver , ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			helper.ElemenetToBeLocated(setUpSIPCalculatorPage.totalValue,20);
			String amount = helper.GetText(setUpSIPCalculatorPage.totalValue);
			
			test.pass("Total Value is "+amount);
			LoggerHandler.logInfo("Total Value is "+amount);
		}
		catch(Exception e) {
			test.fail("Display Total Value Failed .");
			LoggerHandler.logError("Display Total Value Failed .");
			e.getMessage();
		}
	}
}
