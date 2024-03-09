package groww.pageobject;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import groww.uistore.CompoundInterestCalculatorPage;
import groww.utilities.ExcelReader;
import groww.utilities.LoggerHandler;
import groww.utilities.WebDriverHelper;

public class CompoundInterestCalculatorPageObject {

	CompoundInterestCalculatorPage compoundInterestCalculatorPage = new CompoundInterestCalculatorPage();
	
	String path = System.getProperty("user.dir")+"/TestData/testdata.xlsx";
	
	ExcelReader reader = new ExcelReader();
	
	public void enterPrincipleAmount(WebDriver driver , ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			String data = reader.readDataFromExcel(path,"Groww",1,17);
			String amount = "";
			for(int i=0;i<data.length()-2;i++) {
				amount = amount + data.charAt(i);
			}
			
			helper.ElementToBeClickable(compoundInterestCalculatorPage.principleAmount,20);
			helper.ClickOnElement(compoundInterestCalculatorPage.principleAmount);
			helper.ClearInput(compoundInterestCalculatorPage.principleAmount);
			helper.SendKeys(compoundInterestCalculatorPage.principleAmount,amount);
			
			test.pass("Enter Principle Amount "+amount+" Successed .");
			LoggerHandler.logInfo("Enter Principle Amount "+amount+" Successed .");
		}
		catch(Exception e) {
			test.fail("Enter Principle Amount Failed .");
			LoggerHandler.logError("Enter Principle Amount Failed .");
			e.getMessage();
		}
	}
	
	public void enterInterestRate(WebDriver driver , ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			String rate = reader.readDataFromExcel(path,"Groww",2,17);

			helper.ElementToBeClickable(compoundInterestCalculatorPage.interestRate,20);
			helper.ClickOnElement(compoundInterestCalculatorPage.interestRate);
			helper.ClearInput(compoundInterestCalculatorPage.interestRate);
			helper.SendKeys(compoundInterestCalculatorPage.interestRate,rate);
			
			test.pass("Enter Rate of Interest "+rate+" Successed .");
			LoggerHandler.logInfo("Enter Rate of Interest "+rate+" Successed .");
		}
		catch(Exception e) {
			test.fail("Enter Rate of Interest Failed .");
			LoggerHandler.logError("Enter Rate of Interest Failed .");
			e.getMessage();
		}
	}
	
	public void enterTimePeriod(WebDriver driver , ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			String data = reader.readDataFromExcel(path,"Groww",3,17);
			String timePeriod = data.charAt(0)+"";
			
			helper.ElementToBeClickable(compoundInterestCalculatorPage.timePeriod,20);
			helper.ClickOnElement(compoundInterestCalculatorPage.timePeriod);
			helper.ClearInput(compoundInterestCalculatorPage.timePeriod);
			helper.SendKeys(compoundInterestCalculatorPage.timePeriod,timePeriod);
			
			test.pass("Enter Time Period " + timePeriod + " Successed .");
			LoggerHandler.logInfo("Enter Time Period " + timePeriod + "Successed .");
		}
		catch(Exception e) {
			test.fail("Enter Time Period Failed .");
			LoggerHandler.logError("Enter Time Period Failed .");
			e.getMessage();
		}
	}
	
	public void chooseFrequency(WebDriver driver , ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			helper.ElementToBeClickable(compoundInterestCalculatorPage.frequency, 20);
			helper.ClickOnElement(compoundInterestCalculatorPage.frequency);
			helper.ClickOnElement(compoundInterestCalculatorPage.frequency);
			
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
			helper.ElemenetToBeLocated(compoundInterestCalculatorPage.showPrincipleAmount,20);
			String amount = helper.GetText(compoundInterestCalculatorPage.showPrincipleAmount);
			
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
			
			helper.ElemenetToBeLocated(compoundInterestCalculatorPage.interestAmount,20);
			String amount = helper.GetText(compoundInterestCalculatorPage.interestAmount);
			
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
			
			helper.ElemenetToBeLocated(compoundInterestCalculatorPage.totalAmount,20);
			String amount = helper.GetText(compoundInterestCalculatorPage.totalAmount);
			
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
