package groww.pageobject;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import groww.uistore.MFCalculatorPage;
import groww.utilities.ExcelReader;
import groww.utilities.LoggerHandler;
import groww.utilities.WebDriverHelper;

public class MFCalculatorPageObject {

	MFCalculatorPage mfcalculatorpage = new MFCalculatorPage();
	
	String path = System.getProperty("user.dir")+"/TestData/testdata.xlsx";
	
	ExcelReader reader = new ExcelReader();
	
	public void enterTotalInvestment(WebDriver driver,ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			String data = reader.readDataFromExcel(path,"Groww",1,5);
			String amount = "";
			for(int i=0;i<data.length()-2;i++) {
				amount = amount + data.charAt(i);
			}
			
			helper.ElementToBeClickable(mfcalculatorpage.totalInvestment,20);
			helper.ClickOnElement(mfcalculatorpage.totalInvestment);
			helper.ClearInput(mfcalculatorpage.totalInvestment);
			helper.SendKeys(mfcalculatorpage.totalInvestment,amount);
			
			test.pass("Enter Invested Amount " + amount +" Successed .");
			LoggerHandler.logInfo("Enter Invested Amount " + amount +" Successed .");
		}
		catch(Exception e) {
			test.fail("Enter Invested Amount Failed .");
			LoggerHandler.logError("Enter Invested Amount Failed .");
			e.getMessage();
		}
	}
	
	public void enterReturnRate(WebDriver driver , ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			String data = reader.readDataFromExcel(path,"Groww",2,5);
			String rate = "";
			for(int i=0;i<data.length()-2;i++) {
				rate = rate + data.charAt(i);
			}
			
			helper.ElementToBeClickable(mfcalculatorpage.returnRate,20);
			helper.ClickOnElement(mfcalculatorpage.returnRate);
			helper.ClearInput(mfcalculatorpage.returnRate);
			helper.SendKeys(mfcalculatorpage.returnRate,rate);
			
			test.pass("Enter Return Rate " + rate + " Successed .");
			LoggerHandler.logInfo("Enter Return Rate " + rate + " Successed .");
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
			
			String data = reader.readDataFromExcel(path,"Groww",3,5);
			String period = "";
			for(int i=0;i<data.length()-2;i++) {
				period = period + data.charAt(i);
			}
			
			helper.ElementToBeClickable(mfcalculatorpage.timePeriod,20);
			helper.ClickOnElement(mfcalculatorpage.timePeriod);
			helper.ClearInput(mfcalculatorpage.timePeriod);
			helper.SendKeys(mfcalculatorpage.timePeriod,period);
			
			test.pass("Enter Time Period " + period +" Successed .");
			LoggerHandler.logInfo("Enter Time Period " + period +" Successed .");
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
			helper.WaitForElement(mfcalculatorpage.showInvestedAmount,20);
			String data = helper.GetText(mfcalculatorpage.showInvestedAmount);
			
			test.pass("Invested Amount is "+data);
			LoggerHandler.logInfo("Invested Amount is "+data);
		}
		catch(Exception e) {
			test.fail("Display Invested Amount Failed . ");
			LoggerHandler.logError("Display Invested Amount Failed . ");
			e.getMessage();
		}
	}
	
	public void displayEstimateReturn(WebDriver driver , ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			helper.WaitForElement(mfcalculatorpage.showEstimateReturn,20);
			String data = helper.GetText(mfcalculatorpage.showEstimateReturn);
			
			test.pass("Estimate Return Rate is "+data);
			LoggerHandler.logInfo("Estimate Return Rate is "+data);
		}
		catch(Exception e) {
			test.fail("Display Estimate Return Rate Failed .");
			LoggerHandler.logError("Display Estimate Return Rate Failed .");
			e.getMessage();
		}
	}
	
	public void displayTotalValue(WebDriver driver , ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			helper.WaitForElement(mfcalculatorpage.showTotalValue,20);
			String data = helper.GetText(mfcalculatorpage.showTotalValue);
			
			test.pass("Total Value is "+data);
			LoggerHandler.logInfo("Total Value is "+data);
		}
		catch(Exception e) {
			test.fail("Display Total Value Failed .");
			LoggerHandler.logError("Display Total Value Failed .");
			e.getMessage();
		}
	}
}
