package groww.pageobject;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import groww.uistore.SWPCalculatorPage;
import groww.utilities.ExcelReader;
import groww.utilities.LoggerHandler;
import groww.utilities.WebDriverHelper;

public class SWPCalculatorPageObject {

	SWPCalculatorPage swpcalculatorpage = new SWPCalculatorPage();
	
	String path = System.getProperty("user.dir")+"/TestData/testdata.xlsx";
	
	ExcelReader reader = new ExcelReader();
	
	public void enterTotalInvestment(WebDriver driver,ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			String data = reader.readDataFromExcel(path,"Groww",1,4);
			
			String amount = "";
			for(int i=0;i<data.length()-2;i++) {
				amount = amount + data.charAt(i);
			}
			
			helper.WaitForElement(swpcalculatorpage.totalInvestment,20);
			helper.ClickOnElement(swpcalculatorpage.totalInvestment);
			helper.ClearInput(swpcalculatorpage.totalInvestment);
			helper.SendKeys(swpcalculatorpage.totalInvestment,amount);
			
			test.pass("Enter Total Investment " + amount +" Successed .");
			LoggerHandler.logInfo("Enter Total Investment " + amount +" Successed .");
		}
		catch(Exception e) {
			test.fail("Enter Total Investment Failed .");
			LoggerHandler.logError("Enter Total Investment Failed .");
			e.getMessage();
		}
	}
	
	public void enterWithdrawlPerMonth(WebDriver driver , ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			String data = reader.readDataFromExcel(path,"Groww",2,4);
			
			String amount = "";
			for(int i=0;i<data.length()-2;i++) {
				amount = amount + data.charAt(i);
			}
			
			helper.WaitForElement(swpcalculatorpage.withdrawlPerMonth,20);
			helper.ClickOnElement(swpcalculatorpage.withdrawlPerMonth);
			helper.ClearInput(swpcalculatorpage.withdrawlPerMonth);
			helper.SendKeys(swpcalculatorpage.withdrawlPerMonth,amount);
			
			test.pass("Enter Withdrawl "+ amount +" Per Month Successed .");
			LoggerHandler.logInfo("Enter Withdrawl "+ amount +" Per Month Successed .");
		}
		catch(Exception e) {
			test.fail("Enter Withdrawl Per Month Failed .");
			LoggerHandler.logError("Enter Withdrawl Per Month Failed .");
			e.getMessage();
		}
	}
	
	public void enterReturnRate(WebDriver driver , ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			String data = reader.readDataFromExcel(path,"Groww",3,4);
			
			String rate = "";
			for(int i=0;i<data.length()-2;i++) {
				rate = rate + data.charAt(i);
			}
			
			helper.WaitForElement(swpcalculatorpage.returnRate,20);
			helper.ClickOnElement(swpcalculatorpage.returnRate);
			helper.ClearInput(swpcalculatorpage.returnRate);
			helper.SendKeys(swpcalculatorpage.returnRate,rate);
			
			test.pass("Enter Return Rate " + rate + " Successed .");
			LoggerHandler.logInfo("Enter Return Rate " + rate + " Successed .");
		}
		catch(Exception e) {
			test.fail("Enter Expected Return Rate Failed .");
			LoggerHandler.logError("Enter Expected Return Rate Failed .");
			e.getMessage();
		}
	}
	
	public void enterTimePeriod(WebDriver driver , ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			String data = reader.readDataFromExcel(path,"Groww",4,4);
			
			String period = "";
			for(int i=0;i<data.length()-2;i++) {
				period = period + data.charAt(i);
			}
			
			helper.WaitForElement(swpcalculatorpage.timePeriod,20);
			helper.ClickOnElement(swpcalculatorpage.timePeriod);
			helper.ClearInput(swpcalculatorpage.timePeriod);
			helper.SendKeys(swpcalculatorpage.timePeriod,period);
			
			test.pass("Enter Time Period " + period +" Successed .");
			LoggerHandler.logInfo("Enter Time Period " + period +" Successed .");
		}
		catch(Exception e) {
			test.pass("Enter Time Period Failed .");
			LoggerHandler.logInfo("Enter Time Period Failed .");
			e.getMessage();
		}
	}
	
	public void displayTotalInvestment(WebDriver driver,ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			helper.ScrollByThreeHundred();
			Thread.sleep(1000);
			
			String data = helper.GetText(swpcalculatorpage.showTotalInvestment);
			test.pass("Total Investment is "+data);
			LoggerHandler.logInfo("Total Investment is "+data);
		}
		catch(Exception e) {
			test.fail("Display Total Investment Failed .");
			LoggerHandler.logError("Display Total Investment Failed .");
			e.getMessage();
		}
	}
	
	public void displayTotalWithdrawl(WebDriver driver,ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			String data = helper.GetText(swpcalculatorpage.showTotalWithdrawl);
			test.pass("Total Withdrawl is "+data);
			LoggerHandler.logInfo("Total Withdrawl is "+data);
		}
		catch(Exception e) {
			test.fail("Display Total Withdrawl Failed .");
			LoggerHandler.logError("Display Total Withdrawl Failed .");
			e.getMessage();
		}
	}
	
	public void displayFinalValue(WebDriver driver,ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			String data = helper.GetText(swpcalculatorpage.showFinalValue);
			test.pass("Final Value is "+data);
			LoggerHandler.logInfo("Final Value is "+data);
		}
		catch(Exception e) {
			test.fail("Display Final Value Failed .");
			LoggerHandler.logError("Display Final Value Failed .");
			e.getMessage();
		}
	}
}
