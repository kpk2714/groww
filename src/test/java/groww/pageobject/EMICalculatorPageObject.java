package groww.pageobject;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import groww.uistore.EMICalculatorPage;
import groww.utilities.ExcelReader;
import groww.utilities.LoggerHandler;
import groww.utilities.WebDriverHelper;

public class EMICalculatorPageObject {

	EMICalculatorPage emicalculatorpage = new EMICalculatorPage();
	
	String path = System.getProperty("user.dir")+"/TestData/testdata.xlsx";
	
	ExcelReader reader = new ExcelReader();
	
	public void enterLoanAmount(WebDriver driver , ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			String data = reader.readDataFromExcel(path,"Groww",1,14);
			String amount = "";
			for(int i=0;i<data.length()-2;i++) {
				amount = amount + data.charAt(i);
			}
			
			helper.ElementToBeClickable(emicalculatorpage.loanAmount,20);
			helper.ClickOnElement(emicalculatorpage.loanAmount);
			helper.ClearInput(emicalculatorpage.loanAmount);
			helper.SendKeys(emicalculatorpage.loanAmount,amount);
			
			test.pass("Enter Loan Amount " + amount +" Successed .");
			LoggerHandler.logInfo("Enter Loan Amount " + amount +" Successed .");
		}
		catch(Exception e) {
			test.fail("Enter Loan Amount Failed .");
			LoggerHandler.logError("Enter Loan Amount Failed .");
			e.getMessage();
		}
	}
	
	public void enterInterestRate(WebDriver driver , ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			String rate = reader.readDataFromExcel(path,"Groww",2,14);

			helper.ElementToBeClickable(emicalculatorpage.interestRate,20);
			helper.ClickOnElement(emicalculatorpage.interestRate);
			helper.ClearInput(emicalculatorpage.interestRate);
			helper.SendKeys(emicalculatorpage.interestRate,rate);
			
			test.pass("Enter Rate of Interest " + rate +" Successed .");
			LoggerHandler.logInfo("Enter Rate of Interest " + rate +" Successed .");
		}
		catch(Exception e) {
			test.fail("Enter Rate of Interest Failed .");
			LoggerHandler.logError("Enter Rate of Interest Failed .");
			e.getMessage();
		}
	}
	
	public void enterLoanTenure(WebDriver driver , ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			String data = reader.readDataFromExcel(path,"Groww",3,14);
			String timePeriod = data.charAt(0)+"";
			
			helper.ElementToBeClickable(emicalculatorpage.loanTenture,20);
			helper.ClickOnElement(emicalculatorpage.loanTenture);
			helper.ClearInput(emicalculatorpage.loanTenture);
			helper.SendKeys(emicalculatorpage.loanTenture,timePeriod);
			
			test.pass("Enter Loan Tenure " + timePeriod +" Successed .");
			LoggerHandler.logInfo("Enter Loan Tenure " + timePeriod +" Successed .");
		}
		catch(Exception e) {
			test.fail("Enter Loan Tenure Failed .");
			LoggerHandler.logError("Enter Loan Tenure Failed .");
			e.getMessage();
		}
	}
	
	public void displayMonthlyEMI(WebDriver driver , ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			helper.ScrollByThreeHundred();
			Thread.sleep(1000);
			helper.ElemenetToBeLocated(emicalculatorpage.monthlyEMI,20);
			String amount = helper.GetText(emicalculatorpage.monthlyEMI);
			
			test.pass("Monthly EMI is "+amount);
			LoggerHandler.logInfo("Monthly EMI is "+amount);
		}
		catch(Exception e) {
			test.fail("Display Monthly EMI Failed .");
			LoggerHandler.logError("Display Monthly EMI Failed .");
			e.getMessage();
		}
	}
	
	public void displayPrincipalAmount(WebDriver driver , ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			helper.ElemenetToBeLocated(emicalculatorpage.principalAmount,20);
			String amount = helper.GetText(emicalculatorpage.principalAmount);
			
			test.pass("Principal Amount is "+amount);
			LoggerHandler.logInfo("Principal Amount is "+amount);
		}
		catch(Exception e) {
			test.fail("Display Principal Amount Failed .");
			LoggerHandler.logError("Display Principal Amount Failed .");
			e.getMessage();
		}
	}
	
	public void displayTotalInterest(WebDriver driver , ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			helper.ElemenetToBeLocated(emicalculatorpage.totalInterest,20);
			String amount = helper.GetText(emicalculatorpage.totalInterest);
			
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
			
			helper.ElemenetToBeLocated(emicalculatorpage.totalAmount,20);
			String amount = helper.GetText(emicalculatorpage.totalAmount);
			
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
