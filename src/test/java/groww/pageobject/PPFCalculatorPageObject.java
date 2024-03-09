package groww.pageobject;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import groww.uistore.PPFCalculatorPage;
import groww.utilities.ExcelReader;
import groww.utilities.LoggerHandler;
import groww.utilities.WebDriverHelper;

public class PPFCalculatorPageObject {

	PPFCalculatorPage ppfcalculatorpage = new PPFCalculatorPage();
	
	String path = System.getProperty("user.dir")+"/TestData/testdata.xlsx";
	
	ExcelReader reader = new ExcelReader();
	
	public void enterYearlyInvestment(WebDriver driver , ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			String data = reader.readDataFromExcel(path,"Groww",1,7);
			String amount = "";
			for(int i=0;i<data.length()-2;i++) {
				amount = amount + data.charAt(i);
			}
			
			helper.ElementToBeClickable(ppfcalculatorpage.yearlyInvestment,20);
			helper.ClickOnElement(ppfcalculatorpage.yearlyInvestment);
			helper.ClearInput(ppfcalculatorpage.yearlyInvestment);
			helper.SendKeys(ppfcalculatorpage.yearlyInvestment,amount);
			
			test.pass("Enter Yearly Investment " + amount +" Successed .");
			LoggerHandler.logInfo("Enter Yearly Investment " + amount +" Successed .");
		}
		catch(Exception e) {
			test.fail("Enter Yearly Investment Failed .");
			LoggerHandler.logError("Enter Yearly Investment Failed .");
			e.getMessage();
		}
	}
	
	public void enterTimePeriod(WebDriver driver , ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			String data = reader.readDataFromExcel(path,"Groww",2,7);
			String year = "";
			for(int i=0;i<data.length()-2;i++) {
				year = year + data.charAt(i);
			}
			
			helper.ElementToBeClickable(ppfcalculatorpage.timePeriod,20);
			helper.ClickOnElement(ppfcalculatorpage.timePeriod);
			helper.ClearInput(ppfcalculatorpage.timePeriod);
			helper.SendKeys(ppfcalculatorpage.timePeriod,year);
			
			test.pass("Enter Time Period " + year +" Successed .");
			LoggerHandler.logInfo("Enter Time Period " + year +" Successed .");
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
			helper.ElementToBeClickable(ppfcalculatorpage.investedAmount,20);
			String amount = helper.GetText(ppfcalculatorpage.investedAmount);
			
			test.pass("Invested Amount is "+amount);
			LoggerHandler.logInfo("Invested Amount is "+amount);
		}
		catch(Exception e) {
			test.fail("Display Invested Amount Failed .");
			LoggerHandler.logError("Display Invested Amount Failed .");
			e.getMessage();
		}
	}
	
	public void displayTotalInterest(WebDriver driver , ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			helper.ElementToBeClickable(ppfcalculatorpage.totalInterest,20);
			String interest = helper.GetText(ppfcalculatorpage.totalInterest);
			
			test.pass("Total Interest is "+interest);
			LoggerHandler.logInfo("Total Interest is "+interest);
		}
		catch(Exception e) {
			test.fail("Display Total Interest Failed .");
			LoggerHandler.logError("Display Total Interest Failed .");
			e.getMessage();
		}
	}
	
	public void displayMaturityValue(WebDriver driver , ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			helper.ElementToBeClickable(ppfcalculatorpage.maturityvalue,20);
			String maturityValue = helper.GetText(ppfcalculatorpage.maturityvalue);
			
			test.pass("Maturity Value is "+maturityValue);
			LoggerHandler.logInfo("Maturity Value is "+maturityValue);
		}
		catch(Exception e) {
			test.fail("Display Maturity Value Failed .");
			LoggerHandler.logError("Display Maturity Value Failed .");
			e.getMessage();
		}
	}
}
