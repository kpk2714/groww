package groww.pageobject;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import groww.uistore.SSYCalculatorPage;
import groww.utilities.ExcelReader;
import groww.utilities.LoggerHandler;
import groww.utilities.WebDriverHelper;

public class SSYCalculatorPageObject {

	SSYCalculatorPage ssycalculatorpage = new SSYCalculatorPage();
	
	String path = System.getProperty("user.dir")+"/TestData/testdata.xlsx";
	
	ExcelReader reader = new ExcelReader();
	
	public void enterYearlyInvestment(WebDriver driver , ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			String data = reader.readDataFromExcel(path,"Groww", 1, 6);
			String yearlyInvestment = "";
			for(int i=0;i<data.length()-2;i++) {
				yearlyInvestment = yearlyInvestment + data.charAt(i);
			}
			
			helper.ElementToBeClickable(ssycalculatorpage.yearlyInvestment,20);
			helper.ClickOnElement(ssycalculatorpage.yearlyInvestment);
			helper.ClearInput(ssycalculatorpage.yearlyInvestment);
			helper.SendKeys(ssycalculatorpage.yearlyInvestment,yearlyInvestment);
			
			test.pass("Enter Yearly Investment " + yearlyInvestment +" Successed .");
			LoggerHandler.logInfo("Enter Yearly Investment " + yearlyInvestment +" Successed .");
		}
		catch(Exception e) {
			test.fail("Enter Yearly Investment Failed .");
			LoggerHandler.logError("Enter Yearly Investment Failed .");
			e.getMessage();
		}
	}
	
	public void enterGirlAge(WebDriver driver , ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			String age = (reader.readDataFromExcel(path,"Groww", 2, 6)).charAt(0)+"";
			
			helper.ElementToBeClickable(ssycalculatorpage.girlAge,20);
			helper.ClickOnElement(ssycalculatorpage.girlAge);
			helper.ClearInput(ssycalculatorpage.girlAge);
			helper.SendKeys(ssycalculatorpage.girlAge,age);
			
			test.pass("Enter Girl's Age " + age + " Successed .");
			LoggerHandler.logInfo("Enter Girl's Age " + age + " Successed .");
		}
		catch(Exception e) {
			test.fail("Enter Girl's Age Failed .");
			LoggerHandler.logError("Enter Girl's Age Failed .");
			e.getMessage();
		}
	}
	
	public void enterStartPeriod(WebDriver driver , ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			String data = reader.readDataFromExcel(path,"Groww", 3, 6);
			String startPeriod = "";
			for(int i=0;i<data.length()-2;i++) {
				startPeriod = startPeriod + data.charAt(i);
			}
			
			helper.ElementToBeClickable(ssycalculatorpage.startYear,20);
			helper.ClickOnElement(ssycalculatorpage.startYear);
			helper.ClearInput(ssycalculatorpage.startYear);
			helper.SendKeys(ssycalculatorpage.startYear,startPeriod);
			
			test.pass("Enter Start Period " + startPeriod +" Successed .");
			LoggerHandler.logInfo("Enter Start Period " + startPeriod +" Successed .");
		}
		catch(Exception e) {
			test.fail("Enter Start Period Failed .");
			LoggerHandler.logError("Enter Start Period Failed .");
			e.getMessage();
		}
	}
	
	public void displayTotalInvestment(WebDriver driver , ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			helper.ScrollByThreeHundred();
			helper.ElemenetToBeLocated(ssycalculatorpage.totalInvestment,20);
			String amount = helper.GetText(ssycalculatorpage.totalInvestment);
			
			test.pass("Total Investment is "+amount);
			LoggerHandler.logInfo("Total Investment is "+amount);
		}
		catch(Exception e) {
			test.fail("Display Total Investment Failed .");
			LoggerHandler.logError("Display Total Investment Failed .");
			e.getMessage();
		}
	}
	
	public void displayTotalInterest(WebDriver driver , ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			helper.ElemenetToBeLocated(ssycalculatorpage.totalInterest,20);
			String interest = helper.GetText(ssycalculatorpage.totalInterest);
			
			test.pass("Total Interest is "+interest);
			LoggerHandler.logInfo("Total Interest is "+interest);
		}
		catch(Exception e) {
			test.fail("Display Total Interest Failed .");
			LoggerHandler.logError("Display Total Interest Failed .");
			e.getMessage();
		}
	}
	
	public void displayMaturityYear(WebDriver driver , ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			helper.ElemenetToBeLocated(ssycalculatorpage.maturityYear,20);
			String year = helper.GetText(ssycalculatorpage.maturityYear);
			
			test.pass("Maturity Year is "+year);
			LoggerHandler.logInfo("Maturity Year is "+year);
		}
		catch(Exception e) {
			test.fail("Display Maturity Year Failed .");
			LoggerHandler.logError("Display Maturity Year Failed .");
			e.getMessage();
		}
	}
	
	public void displayMaturityValue(WebDriver driver , ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			helper.ElemenetToBeLocated(ssycalculatorpage.maturityValue,20);
			String value = helper.GetText(ssycalculatorpage.maturityValue);
			
			test.pass("Maturity Value is "+value);
			LoggerHandler.logInfo("Maturity Value is "+value);
		}
		catch(Exception e) {
			test.fail("Display Maturity Value Failed .");
			LoggerHandler.logError("Display Maturity Value Failed .");
			e.getMessage();
		}
	}
}
