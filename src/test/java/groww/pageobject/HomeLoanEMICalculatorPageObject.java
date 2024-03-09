package groww.pageobject;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import groww.uistore.HomeLoanEMICalculatorPage;
import groww.utilities.ExcelReader;
import groww.utilities.LoggerHandler;
import groww.utilities.WebDriverHelper;

public class HomeLoanEMICalculatorPageObject {
	
	String path = System.getProperty("user.dir") + "/TestData/testdata.xlsx";
	
	HomeLoanEMICalculatorPage homeLoanEMICalculatorPage = new HomeLoanEMICalculatorPage();
	
	ExcelReader reader = new ExcelReader();
	
	public void enterLoanAmount(WebDriver driver , ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			String amount = reader.readDataFromExcel(path,"Groww",1,1);
			
			String data = "";
			for(int i=0;i<amount.length()-1;i++) {
				data = data + amount.charAt(i);
			}
			
			helper.ElementToBeClickable(homeLoanEMICalculatorPage.loanAmount,20);
			helper.ClickOnElement(homeLoanEMICalculatorPage.loanAmount);
			helper.ClearInput(homeLoanEMICalculatorPage.loanAmount);
			helper.ElementToBeClickable(homeLoanEMICalculatorPage.loanAmount,20);
			helper.SendKeys(homeLoanEMICalculatorPage.loanAmount,data);
			
			test.pass("Enter Loan Amount "+data+" Successed .");
			LoggerHandler.logInfo("Enter Loan Amount "+data+" Successed .");
		}
		catch(Exception e) {
			test.fail("Enter Loan Amount Failed .");
			LoggerHandler.logError("Enter Loan Amount Failed .");
			e.getMessage();
		}
	}
	
	public void enterInterestRate(WebDriver driver,ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			String data = reader.readDataFromExcel(path,"Groww",2,1);
			
			helper.ElementToBeClickable(homeLoanEMICalculatorPage.interestRate,20);
			helper.ClickOnElement(homeLoanEMICalculatorPage.interestRate);
			helper.ClearInput(homeLoanEMICalculatorPage.interestRate);
			helper.SendKeys(homeLoanEMICalculatorPage.interestRate,data);
			
			test.pass("Enter Interest Rate "+data+" Successed .");
			LoggerHandler.logInfo("Enter Interest Rate "+data+" Successed .");
		}
		catch(Exception e) {
			test.fail("Enter Interest Rate Failed .");
			LoggerHandler.logError("Enter Interest Rate Failed .");
			e.getMessage();
		}
	}
	
	public void enterLoanYear(WebDriver driver,ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			String data = reader.readDataFromExcel(path,"Groww",3,1);
			String year = "";
			year = year + data.charAt(0);
			
			helper.ElementToBeClickable(homeLoanEMICalculatorPage.loanYear,20);
			helper.ClickOnElement(homeLoanEMICalculatorPage.loanYear);
			helper.ClearInput(homeLoanEMICalculatorPage.loanYear);
			helper.SendKeys(homeLoanEMICalculatorPage.loanYear,year);
			
			test.pass("Enter Loan Tenure "+year+" Successed .");
			LoggerHandler.logInfo("Enter Loan Tenure "+year+" Successed .");
		}
		catch(Exception e) {
			test.fail("Enter Loan Tenure Failed .");
			LoggerHandler.logError("Enter Loan Tenure Failed .");
			e.getMessage();
		}
	}
	
	public void displayMonthlyEMI(WebDriver driver,ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			helper.ScrollByThreeHundred();
			Thread.sleep(1000);
			helper.ElemenetToBeLocated(homeLoanEMICalculatorPage.monthlyEMI,20);
			
			String data = helper.GetText(homeLoanEMICalculatorPage.monthlyEMI);
			String monthlyEMI = "";
			for(int i=1;i<data.length();i++) {
				monthlyEMI = monthlyEMI + data.charAt(i);
			}
			
			test.pass("Monthly EMI is "+monthlyEMI);
			LoggerHandler.logInfo("Monthly EMI is "+monthlyEMI);
		}
		catch(Exception e) {
			test.fail("Display Monthly EMI Failed .");
			LoggerHandler.logError("Display Monthly EMI Failed .");
			e.getMessage();
		}
	}
	
	public void displayPrincipalAmount(WebDriver driver,ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			helper.ElemenetToBeLocated(homeLoanEMICalculatorPage.principalAmount,20);
			
			String data = helper.GetText(homeLoanEMICalculatorPage.principalAmount);
			String principalAmount = "";
			for(int i=1;i<data.length();i++) {
				principalAmount = principalAmount + data.charAt(i);
			}
			
			test.pass("Principal Amount is "+principalAmount);
			LoggerHandler.logInfo("Principal Amount is "+principalAmount);
		}
		catch(Exception e) {
			test.fail("Display Principal Amount Failed .");
			LoggerHandler.logError("Display Principal Amount Failed .");
			e.getMessage();
		}
	}
	
	public void displayTotalInterest(WebDriver driver,ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			helper.ElemenetToBeLocated(homeLoanEMICalculatorPage.totalInterest,20);
			
			String data = helper.GetText(homeLoanEMICalculatorPage.totalInterest);
			String totalInterest = "";
			for(int i=1;i<data.length();i++) {
				totalInterest = totalInterest + data.charAt(i);
			}
			
			test.pass("Total Interest is "+totalInterest);
			LoggerHandler.logInfo("Total Interest is "+totalInterest);
		}
		catch(Exception e) {
			test.fail("Display Total Interest Failed .");
			LoggerHandler.logError("Display Total Interest Failed .");
			e.getMessage();
		}
	}
	
	public void displayTotalAmount(WebDriver driver,ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			helper.ElemenetToBeLocated(homeLoanEMICalculatorPage.totalAmount,20);
			
			String data = helper.GetText(homeLoanEMICalculatorPage.totalAmount);
			String totalAmount = "";
			for(int i=1;i<data.length();i++) {
				totalAmount = totalAmount + data.charAt(i);
			}
			
			test.pass("Total Amount is "+totalAmount);
			LoggerHandler.logInfo("Total Amount is "+totalAmount);
		}
		catch(Exception e) {
			test.fail("Display Total Amount Failed .");
			LoggerHandler.logError("Display Total Amount Failed .");
			e.getMessage();
		}
	}
}
