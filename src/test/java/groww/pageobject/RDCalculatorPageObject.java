package groww.pageobject;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import groww.uistore.RDCalculatorPage;
import groww.utilities.ExcelReader;
import groww.utilities.LoggerHandler;
import groww.utilities.WebDriverHelper;

public class RDCalculatorPageObject {

	RDCalculatorPage rdcalculatorpage = new RDCalculatorPage();
	
	String path = System.getProperty("user.dir")+"/TestData/testdata.xlsx";
	
	ExcelReader reader = new ExcelReader();
	
	public void enterMonthlyInvestment(WebDriver driver,ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			String data = reader.readDataFromExcel(path,"Groww", 1, 10);
			
			String amount = "";
			for(int i=0;i<data.length()-2;i++) {
				amount = amount + data.charAt(i);
			}
			
			helper.ElementToBeClickable(rdcalculatorpage.monthly_Investment, 20);
			helper.ClickOnElement(rdcalculatorpage.monthly_Investment);
			helper.ClearInput(rdcalculatorpage.monthly_Investment);
			helper.SendKeys(rdcalculatorpage.monthly_Investment,amount);
			
			test.pass("Enter Monthly Investment " + amount +" Successed .");
			LoggerHandler.logInfo("Enter Monthly Investment " + amount +" Successed .");
		}
		catch(Exception e) {
			test.fail("Enter Monthly Investment Failed .");
			LoggerHandler.logError("Enter Monthly Investment Failed .");
			e.getMessage();
		}
	}
	
	public void enterInterestRate(WebDriver driver,ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			String rate = reader.readDataFromExcel(path,"Groww", 2, 10);
			
			helper.ElementToBeClickable(rdcalculatorpage.interestRate, 20);
			helper.ClickOnElement(rdcalculatorpage.interestRate);
			helper.ClearInput(rdcalculatorpage.interestRate);
			helper.SendKeys(rdcalculatorpage.interestRate,rate);
			
			test.pass("Enter Interest Rate " + rate +" Successed .");
			LoggerHandler.logInfo("Enter Interest Rate " + rate +" Successed .");
		}
		catch(Exception e) {
			test.fail("Enter Interest Rate Failed .");
			LoggerHandler.logError("Enter Interest Rate Failed .");
			e.getMessage();
		}
	}
	
	public void enterTimePeriod(WebDriver driver,ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			String data = reader.readDataFromExcel(path,"Groww", 3, 10);
			
			String time = data.charAt(0)+"";

			
			helper.ElementToBeClickable(rdcalculatorpage.timePeriod, 20);
			helper.ClickOnElement(rdcalculatorpage.timePeriod);
			helper.ClearInput(rdcalculatorpage.timePeriod);
			helper.SendKeys(rdcalculatorpage.timePeriod,time);
			
			test.pass("Enter Time Period " + time +" Successed .");
			LoggerHandler.logInfo("Enter Time Period " + time +" Successed .");
		}
		catch(Exception e) {
			test.fail("Enter Time Period Failed .");
			LoggerHandler.logError("Enter Time Period Failed .");
			e.getMessage();
		}
	}
	
	public void displayInvestedAmount(WebDriver driver,ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			helper.ScrollByThreeHundred();
			Thread.sleep(1000);
			helper.ElemenetToBeLocated(rdcalculatorpage.investedAmount, 20);
			String amount = helper.GetText(rdcalculatorpage.investedAmount);
			
			test.pass("Invested Amount is "+amount);
			LoggerHandler.logInfo("Invested Amount is "+amount);
		}
		catch(Exception e) {
			test.fail("Display Invested Amount Failed .");
			LoggerHandler.logError("Display Invested Amount Failed .");
			e.getMessage();
		}
	}
	
	public void displayReturnAmount(WebDriver driver,ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			helper.ElemenetToBeLocated(rdcalculatorpage.returnAmount, 20);
			String amount = helper.GetText(rdcalculatorpage.returnAmount);
			
			test.pass("Return Amount is "+amount);
			LoggerHandler.logInfo("Return Amount is "+amount);
		}
		catch(Exception e) {
			test.fail("Display Return Amount Failed .");
			LoggerHandler.logError("Display Return Amount Failed .");
			e.getMessage();
		}
	}
	
	public void displayTotalValue(WebDriver driver,ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			helper.ElemenetToBeLocated(rdcalculatorpage.totalValue, 20);
			String amount = helper.GetText(rdcalculatorpage.totalValue);
			
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
