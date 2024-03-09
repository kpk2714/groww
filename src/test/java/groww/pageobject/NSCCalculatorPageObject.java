package groww.pageobject;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import groww.uistore.NSCCalculatorPage;
import groww.utilities.ExcelReader;
import groww.utilities.LoggerHandler;
import groww.utilities.WebDriverHelper;

public class NSCCalculatorPageObject {

	NSCCalculatorPage nscCalculatorPage = new NSCCalculatorPage();
	
	String path = System.getProperty("user.dir")+"/TestData/testdata.xlsx";
	
	ExcelReader reader = new ExcelReader();
	
	public void enterInvestedAmount(WebDriver driver , ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			String data = reader.readDataFromExcel(path,"Groww",1,18);
			String amount = "";
			for(int i=0;i<data.length()-2;i++) {
				amount = amount + data.charAt(i);
			}
			
			helper.ElementToBeClickable(nscCalculatorPage.investedAmount,20);
			helper.ClickOnElement(nscCalculatorPage.investedAmount);
			helper.ClearInput(nscCalculatorPage.investedAmount);
			helper.SendKeys(nscCalculatorPage.investedAmount,amount);
			
			test.pass("Enter Invested Amount "+amount+" Successed .");
			LoggerHandler.logInfo("Enter Invested Amount "+amount+" Successed .");
		}
		catch(Exception e) {
			test.fail("Enter Invested Amount Failed .");
			LoggerHandler.logError("Enter Invested Amount Failed .");
			e.getMessage();
		}
	}
	
	public void enterInterestRate(WebDriver driver , ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			String rate = reader.readDataFromExcel(path,"Groww",2,18);

			helper.ElementToBeClickable(nscCalculatorPage.interestRate,20);
			helper.ClickOnElement(nscCalculatorPage.interestRate);
			helper.ClearInput(nscCalculatorPage.interestRate);
			helper.SendKeys(nscCalculatorPage.interestRate,rate);
			
			test.pass("Enter Rate of Interest "+rate+" Successed .");
			LoggerHandler.logInfo("Enter Rate of Interest "+rate+" Successed .");
		}
		catch(Exception e) {
			test.fail("Enter Rate of Interest Failed .");
			LoggerHandler.logError("Enter Rate of Interest Failed .");
			e.getMessage();
		}
	}
	
	
	public void chooseFrequency(WebDriver driver , ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			helper.ElementToBeClickable(nscCalculatorPage.frequency, 20);
			helper.ClickOnElement(nscCalculatorPage.frequency);
			
			test.pass("Choose Compounding Frequency Successed .");
			LoggerHandler.logInfo("Choose Compounding Frequency Successed .");
		}
		catch(Exception e) {
			test.pass("Choose Compounding Frequency Failed .");
			LoggerHandler.logInfo("Choose Compounding Frequency Failed .");
			e.getMessage();
		}
	}
	
	public void displayPrincipleAmount(WebDriver driver , ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			helper.ScrollByThreeHundred();
			Thread.sleep(1000);
			helper.ElemenetToBeLocated(nscCalculatorPage.showPrincipleAmount,20);
			String amount = helper.GetText(nscCalculatorPage.showPrincipleAmount);
			
			test.pass("Principle Amount is "+amount);
			LoggerHandler.logInfo("Principle Amount is "+amount);
		}
		catch(Exception e) {
			test.fail("Display Principle Amount Failed .");
			LoggerHandler.logError("Display Principle Amount Failed .");
			e.getMessage();
		}
	}
	
	public void displayTotalInterest(WebDriver driver , ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			helper.ElemenetToBeLocated(nscCalculatorPage.interestAmount,20);
			String amount = helper.GetText(nscCalculatorPage.interestAmount);
			
			test.pass("Total Interest is "+amount);
			LoggerHandler.logInfo("Total Interest is "+amount);
		}
		catch(Exception e) {
			test.fail("Display Total Interest Failed .");
			LoggerHandler.logError("Display Total Interest Failed .");
			e.getMessage();
		}
	}
	
	public void displayTotalAmount(WebDriver driver , ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			helper.ElemenetToBeLocated(nscCalculatorPage.totalAmount,20);
			String amount = helper.GetText(nscCalculatorPage.totalAmount);
			
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
