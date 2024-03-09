package groww.pageobject;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import groww.uistore.CarLoanEMICalculatorPage;
import groww.utilities.ExcelReader;
import groww.utilities.LoggerHandler;
import groww.utilities.WebDriverHelper;

public class CarLoanEMICalculatorPageObject {
	
	CarLoanEMICalculatorPage carloanemicalculatorpage = new CarLoanEMICalculatorPage();

	String path = System.getProperty("user.dir")+"/TestData/testdata.xlsx";
	
	ExcelReader reader = new ExcelReader();
	
	public void enterLoanAmount(WebDriver driver , ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			String data = reader.readDataFromExcel(path,"Groww",1,15);
			String amount = "";
			for(int i=0;i<data.length()-2;i++) {
				amount = amount + data.charAt(i);
			}
			
			helper.ElementToBeClickable(carloanemicalculatorpage.loanAmount,20);
			helper.ClickOnElement(carloanemicalculatorpage.loanAmount);
			helper.ClearInput(carloanemicalculatorpage.loanAmount);
			helper.SendKeys(carloanemicalculatorpage.loanAmount,amount);
			
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
			
			String rate = reader.readDataFromExcel(path,"Groww",2,15);

			helper.ElementToBeClickable(carloanemicalculatorpage.interestRate,20);
			helper.ClickOnElement(carloanemicalculatorpage.interestRate);
			helper.ClearInput(carloanemicalculatorpage.interestRate);
			helper.SendKeys(carloanemicalculatorpage.interestRate,rate);
			
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
			
			String data = reader.readDataFromExcel(path,"Groww",3,15);
			String timePeriod = data.charAt(0)+"";
			
			helper.ElementToBeClickable(carloanemicalculatorpage.loanTenture,20);
			helper.ClickOnElement(carloanemicalculatorpage.loanTenture);
			helper.ClearInput(carloanemicalculatorpage.loanTenture);
			helper.SendKeys(carloanemicalculatorpage.loanTenture,timePeriod);
			
			test.pass("Enter Loan Tenure " + data +" Successed .");
			LoggerHandler.logInfo("Enter Loan Tenure " + data +" Successed .");
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
			helper.ElemenetToBeLocated(carloanemicalculatorpage.monthlyEMI,20);
			String amount = helper.GetText(carloanemicalculatorpage.monthlyEMI);
			
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
			
			helper.ElemenetToBeLocated(carloanemicalculatorpage.principalAmount,20);
			String amount = helper.GetText(carloanemicalculatorpage.principalAmount);
			
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
			
			helper.ElemenetToBeLocated(carloanemicalculatorpage.totalInterest,20);
			String amount = helper.GetText(carloanemicalculatorpage.totalInterest);
			
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
			
			helper.ElemenetToBeLocated(carloanemicalculatorpage.totalAmount,20);
			String amount = helper.GetText(carloanemicalculatorpage.totalAmount);
			
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
