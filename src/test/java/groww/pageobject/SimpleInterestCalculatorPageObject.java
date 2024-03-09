package groww.pageobject;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import groww.uistore.SimpleInterestCalculatorPage;
import groww.utilities.ExcelReader;
import groww.utilities.LoggerHandler;
import groww.utilities.WebDriverHelper;

public class SimpleInterestCalculatorPageObject {

	SimpleInterestCalculatorPage simpleInterestCalculatorPage = new SimpleInterestCalculatorPage();
	
	String path = System.getProperty("user.dir")+"/TestData/testdata.xlsx";
	
	ExcelReader reader = new ExcelReader();
	
	public void enterPrincipleAmount(WebDriver driver , ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			String data = reader.readDataFromExcel(path,"Groww",1,16);
			String amount = "";
			for(int i=0;i<data.length()-2;i++) {
				amount = amount + data.charAt(i);
			}
			
			helper.ElementToBeClickable(simpleInterestCalculatorPage.principleAmount,20);
			helper.ClickOnElement(simpleInterestCalculatorPage.principleAmount);
			helper.ClearInput(simpleInterestCalculatorPage.principleAmount);
			helper.SendKeys(simpleInterestCalculatorPage.principleAmount,amount);
			
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
			
			String rate = reader.readDataFromExcel(path,"Groww",2,16);

			helper.ElementToBeClickable(simpleInterestCalculatorPage.interestRate,20);
			helper.ClickOnElement(simpleInterestCalculatorPage.interestRate);
			helper.ClearInput(simpleInterestCalculatorPage.interestRate);
			helper.SendKeys(simpleInterestCalculatorPage.interestRate,rate);
			
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
			
			String data = reader.readDataFromExcel(path,"Groww",3,16);
			String timePeriod = data.charAt(0)+"";
			
			helper.ElementToBeClickable(simpleInterestCalculatorPage.timePeriod,20);
			helper.ClickOnElement(simpleInterestCalculatorPage.timePeriod);
			helper.ClearInput(simpleInterestCalculatorPage.timePeriod);
			helper.SendKeys(simpleInterestCalculatorPage.timePeriod,timePeriod);
			
			test.pass("Enter Time Period " + timePeriod + " Successed .");
			LoggerHandler.logInfo("Enter Time Period " + timePeriod + "Successed .");
		}
		catch(Exception e) {
			test.fail("Enter Time Period Failed .");
			LoggerHandler.logError("Enter Time Period Failed .");
			e.getMessage();
		}
	}
	
	public void displayPrincipleAmount(WebDriver driver , ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			helper.ScrollByThreeHundred();
			Thread.sleep(1000);
			helper.ElemenetToBeLocated(simpleInterestCalculatorPage.showPrincipleAmount,20);
			String amount = helper.GetText(simpleInterestCalculatorPage.showPrincipleAmount);
			
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
			
			helper.ElemenetToBeLocated(simpleInterestCalculatorPage.interestAmount,20);
			String amount = helper.GetText(simpleInterestCalculatorPage.interestAmount);
			
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
			
			helper.ElemenetToBeLocated(simpleInterestCalculatorPage.totalAmount,20);
			String amount = helper.GetText(simpleInterestCalculatorPage.totalAmount);
			
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
