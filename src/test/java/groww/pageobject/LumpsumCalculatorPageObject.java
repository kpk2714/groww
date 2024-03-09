package groww.pageobject;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import groww.uistore.LumpsumCalculatorPage;
import groww.utilities.ExcelReader;
import groww.utilities.LoggerHandler;
import groww.utilities.WebDriverHelper;

public class LumpsumCalculatorPageObject {

	LumpsumCalculatorPage lumpsumcalculatorpage = new LumpsumCalculatorPage();
	
	String path = System.getProperty("user.dir")+"/TestData/testdata.xlsx";
	
	ExcelReader reader = new ExcelReader();
	
	public void enterTotalInvestment(WebDriver driver , ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			String data = reader.readDataFromExcel(path,"Groww",1,3);

			String amount = "";
			for(int i=0;i<data.length()-2;i++) {
				amount = amount + data.charAt(i);
			}
			
			helper.WaitForElement(lumpsumcalculatorpage.totalInvestment,20);
			helper.ClickOnElement(lumpsumcalculatorpage.totalInvestment);
			helper.ClearInput(lumpsumcalculatorpage.totalInvestment);
			helper.SendKeys(lumpsumcalculatorpage.totalInvestment,amount);
			
			
			test.pass("Enter Total Investment Amount " + amount +" Successed .");
			LoggerHandler.logInfo("Enter Total Investment Amount " + amount +" Successed .");
		}
		catch(Exception e) {
			test.fail("Enter Total Investment Amount Failed .");
			LoggerHandler.logError("Enter Total Investment Amount Failed .");
			e.getMessage();
		}
	}
	
	public void enterReturnRate(WebDriver driver , ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			String data = reader.readDataFromExcel(path,"Groww",2,3);

			String rate = "";
			for(int i=0;i<data.length()-2;i++) {
				rate = rate + data.charAt(i);
			}
			
			helper.WaitForElement(lumpsumcalculatorpage.returnRate,20);
			helper.ClickOnElement(lumpsumcalculatorpage.returnRate);
			helper.ClearInput(lumpsumcalculatorpage.returnRate);
			helper.SendKeys(lumpsumcalculatorpage.returnRate,rate);
			
			test.pass("Enter Expected Return Rate " + rate + " Successed .");
			LoggerHandler.logInfo("Enter Expected Return Rate " + rate + " Successed .");
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
			
			String data = reader.readDataFromExcel(path,"Groww",3,3);
			
			String period = "";
			for(int i=0;i<data.length()-2;i++) {
				period = period + data.charAt(i);
			}
			
			helper.WaitForElement(lumpsumcalculatorpage.timePeriod,20);
			helper.ClickOnElement(lumpsumcalculatorpage.timePeriod);
			helper.ClearInput(lumpsumcalculatorpage.timePeriod);
			helper.SendKeys(lumpsumcalculatorpage.timePeriod,period);
			
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
			helper.ElemenetToBeLocated(lumpsumcalculatorpage.investedAmount,20);
			String amount = helper.GetText(lumpsumcalculatorpage.investedAmount);
			
			test.pass("Invested Amount is "+amount);
			LoggerHandler.logInfo("Invested Amount is "+amount);
		}
		catch(Exception e) {
			test.fail("Display Invested Amount Failed .");
			LoggerHandler.logError("Display Invested Amount Failed .");
			e.getMessage();
		}
		
	}
	
	public void displayReturnAmount(WebDriver driver , ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			helper.ElemenetToBeLocated(lumpsumcalculatorpage.returnAmount,20);
			String amount = helper.GetText(lumpsumcalculatorpage.returnAmount);
			
			test.pass("Expected Return Amount is "+amount);
			LoggerHandler.logInfo("Expected Return Amount is "+amount);
		}
		catch(Exception e) {
			test.fail("Display Return Amount Failed .");
			LoggerHandler.logError("Display Return Amount Failed .");
			e.getMessage();
		}
		
	}
	
	public void displayTotalAmount(WebDriver driver , ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			helper.ElemenetToBeLocated(lumpsumcalculatorpage.totalAmount,20);
			String amount = helper.GetText(lumpsumcalculatorpage.totalAmount);
			
			test.pass("Total Amount is "+amount);
			LoggerHandler.logInfo("Total Amount is "+amount);
		}
		catch(Exception e) {
			test.fail("Display Total Amount Failed .");
			LoggerHandler.logError("Display Total Amount Failed .");
			e.getMessage();
		}
		
	}
}
