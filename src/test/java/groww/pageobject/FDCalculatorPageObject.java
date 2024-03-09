package groww.pageobject;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import groww.uistore.FDCalculatorPage;
import groww.utilities.ExcelReader;
import groww.utilities.LoggerHandler;
import groww.utilities.WebDriverHelper;

public class FDCalculatorPageObject {

	FDCalculatorPage fdcalculatorpage = new FDCalculatorPage();
	
	String path = System.getProperty("user.dir")+"/TestData/testdata.xlsx";
	
	ExcelReader reader = new ExcelReader();
	
	public void enterTotalInvestment(WebDriver driver , ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			String data = reader.readDataFromExcel(path,"Groww",1,9);
			String amount = "";
			for(int i=0;i<data.length()-2;i++) {
				amount = amount + data.charAt(i);
			}
			
			helper.ElementToBeClickable(fdcalculatorpage.totalInvestment,20);
			helper.ClickOnElement(fdcalculatorpage.totalInvestment);
			helper.ClearInput(fdcalculatorpage.totalInvestment);
			helper.SendKeys(fdcalculatorpage.totalInvestment,amount);
			
			test.pass("Enter Total Investment " + amount +" Successed .");
			LoggerHandler.logInfo("Enter Total Investment " + amount +" Successed .");
		}
		catch(Exception e) {
			test.fail("Enter Total Investment Failed .");
			LoggerHandler.logError("Enter Total Investment Failed .");
			e.getMessage();
		}
	}
	
	public void enterInterestRate(WebDriver driver , ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			String rate = reader.readDataFromExcel(path,"Groww",2,9);

			helper.ElementToBeClickable(fdcalculatorpage.interestRate,20);
			helper.ClickOnElement(fdcalculatorpage.interestRate);
			helper.ClearInput(fdcalculatorpage.interestRate);
			helper.SendKeys(fdcalculatorpage.interestRate,rate);
			
			test.pass("Enter Interest Rate " + rate + " Successed .");
			LoggerHandler.logInfo("Enter Interest Rate " + rate + " Successed .");
		}
		catch(Exception e) {
			test.fail("Enter Interest Rate Failed .");
			LoggerHandler.logError("Enter Interest Rate Failed .");
			e.getMessage();
		}
	}
	
	public void enterTimePeriod(WebDriver driver , ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			String data = reader.readDataFromExcel(path,"Groww",3,9);
			String timePeriod = data.charAt(0)+"";
			
			helper.ElementToBeClickable(fdcalculatorpage.timePeriod,20);
			helper.ClickOnElement(fdcalculatorpage.timePeriod);
			helper.ClearInput(fdcalculatorpage.timePeriod);
			helper.SendKeys(fdcalculatorpage.timePeriod,timePeriod);
			
			test.pass("Enter Time Period " + timePeriod +" Successed .");
			LoggerHandler.logInfo("Enter Time Period " + timePeriod +" Successed .");
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
			helper.ElemenetToBeLocated(fdcalculatorpage.investedAmount,20);
			String amount = helper.GetText(fdcalculatorpage.investedAmount);
			
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
			
			helper.ElemenetToBeLocated(fdcalculatorpage.returnAmount,20);
			String amount = helper.GetText(fdcalculatorpage.returnAmount);
			
			test.pass("Return Amount is "+amount);
			LoggerHandler.logInfo("Return Amount is "+amount);
		}
		catch(Exception e) {
			test.fail("Display Return Amount Failed .");
			LoggerHandler.logError("Display Return Amount Failed .");
			e.getMessage();
		}
	}
	
	public void displayTotalValue(WebDriver driver , ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			helper.ElemenetToBeLocated(fdcalculatorpage.totalValue,20);
			String amount = helper.GetText(fdcalculatorpage.totalValue);
			
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
