package groww.pageobject;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import groww.uistore.CalculatorPage;
import groww.utilities.LoggerHandler;
import groww.utilities.WebDriverHelper;

public class CalculatorPageObject {

	CalculatorPage calculatorpage = new CalculatorPage();
	
	public void clickOnHomeLoanEMI(WebDriver driver,ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			helper.ElementToBeClickable(calculatorpage.homeLoanEMI,20);
			helper.ClickOnElement(calculatorpage.homeLoanEMI);
			
			test.pass("Click on Home Loan EMI Successed .");
			LoggerHandler.logInfo("Click on Home Loan EMI Successed .");
		}
		catch(Exception e) {
			test.fail("Click on Home Loan EMI Failed .");
			LoggerHandler.logError("Click on Home Loan EMI Failed .");
		}
	}
	
	public void clickOnSIP(WebDriver driver , ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			helper.ElementToBeClickable(calculatorpage.SIP,20);
			helper.ClickOnElement(calculatorpage.SIP);
			
			test.pass("Click on SIP on Calculator Page Successed .");
			LoggerHandler.logInfo("Click on SIP on Calculator Page Successed .");
		}
		catch(Exception e) {
			test.fail("Click on SIP on Calculator Page Failed .");
			LoggerHandler.logError("Click on SIP on Calculator Page Failed .");
		}
	}
	
	public void clickOnLumpsum(WebDriver driver , ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			helper.ElementToBeClickable(calculatorpage.Lumpsum,20);
			helper.ClickOnElement(calculatorpage.Lumpsum);
			
			test.pass("Click on Lumpsum on Calculator Page Successed .");
			LoggerHandler.logInfo("Click on Lumpsum on Calculator Page Successed .");
		}
		catch(Exception e) {
			test.fail("Click on Lumpsum on Calculator Page Failed .");
			LoggerHandler.logError("Click on Lumpsum on Calculator Page Failed .");
		}
	}
	
	public void clickOnSWP(WebDriver driver , ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			helper.ElementToBeClickable(calculatorpage.SWP,20);
			helper.ClickOnElement(calculatorpage.SWP);
			
			test.pass("Click on SWP on Calculator Page Successed .");
			LoggerHandler.logInfo("Click on SWP on Calculator Page Successed .");
		}
		catch(Exception e) {
			test.fail("Click on SWP on Calculator Page Failed .");
			LoggerHandler.logError("Click on SWP on Calculator Page Failed .");
		}
	}
	
	public void clickOnMF(WebDriver driver , ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			helper.ElementToBeClickable(calculatorpage.MF,20);
			helper.ClickOnElement(calculatorpage.MF);
			
			test.pass("Click on MF on Calculator Page Successed .");
			LoggerHandler.logInfo("Click on MF on Calculator Page Successed .");
		}
		catch(Exception e) {
			test.fail("Click on MF on Calculator Page Failed .");
			LoggerHandler.logError("Click on MF on Calculator Page Failed .");
		}
	}
	
	public void clickOnSSY(WebDriver driver , ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			helper.ElementToBeClickable(calculatorpage.SSY,20);
			helper.ClickOnElement(calculatorpage.SSY);
			
			test.pass("Click on SSY on Calculator Page Successed .");
			LoggerHandler.logInfo("Click on SSY on Calculator Page Successed .");
		}
		catch(Exception e) {
			test.fail("Click on SSY on Calculator Page Failed .");
			LoggerHandler.logError("Click on SSY on Calculator Page Failed .");
		}
	}
	
	public void clickOnPPF(WebDriver driver , ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			helper.ElementToBeClickable(calculatorpage.PPF,20);
			helper.ClickOnElement(calculatorpage.PPF);
			
			test.pass("Click on PPF on Calculator Page Successed .");
			LoggerHandler.logInfo("Click on PPF on Calculator Page Successed .");
		}
		catch(Exception e) {
			test.fail("Click on PPF on Calculator Page Failed .");
			LoggerHandler.logError("Click on PPF on Calculator Page Failed .");
		}
	}
	
	public void clickOnEPF(WebDriver driver , ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			helper.ElementToBeClickable(calculatorpage.EPF,20);
			helper.ClickOnElement(calculatorpage.EPF);
			
			test.pass("Click on EPF on Calculator Page Successed .");
			LoggerHandler.logInfo("Click on EPF on Calculator Page Successed .");
		}
		catch(Exception e) {
			test.fail("Click on EPF on Calculator Page Failed .");
			LoggerHandler.logError("Click on EPF on Calculator Page Failed .");
		}
	}
	
	public void clickOnFD(WebDriver driver , ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			helper.ElementToBeClickable(calculatorpage.FD,20);
			helper.ClickOnElement(calculatorpage.FD);
			
			test.pass("Click on FD on Calculator Page Successed .");
			LoggerHandler.logInfo("Click on FD on Calculator Page Successed .");
		}
		catch(Exception e) {
			test.fail("Click on FD on Calculator Page Failed .");
			LoggerHandler.logError("Click on FD on Calculator Page Failed .");
		}
	}
	
	public void clickOnRD(WebDriver driver , ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			helper.ElementToBeClickable(calculatorpage.RD,20);
			helper.ClickOnElement(calculatorpage.RD);
			
			test.pass("Click on RD on Calculator Page Successed .");
			LoggerHandler.logInfo("Click on RD on Calculator Page Successed .");
		}
		catch(Exception e) {
			test.fail("Click on RD on Calculator Page Failed .");
			LoggerHandler.logError("Click on RD on Calculator Page Failed .");
		}
	}
	
	public void clickOnNPS(WebDriver driver , ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			helper.ElementToBeClickable(calculatorpage.NPS,20);
			helper.ClickOnElement(calculatorpage.NPS);
			
			test.pass("Click on NPS on Calculator Page Successed .");
			LoggerHandler.logInfo("Click on NPS on Calculator Page Successed .");
		}
		catch(Exception e) {
			test.fail("Click on NPS on Calculator Page Failed .");
			LoggerHandler.logError("Click on NPS on Calculator Page Failed .");
		}
	}
	
	public void clickOnHRA(WebDriver driver , ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			helper.ElementToBeClickable(calculatorpage.HRA,20);
			helper.ClickOnElement(calculatorpage.HRA);
			
			test.pass("Click on HRA on Calculator Page Successed .");
			LoggerHandler.logInfo("Click on HRA on Calculator Page Successed .");
		}
		catch(Exception e) {
			test.fail("Click on HRA on Calculator Page Failed .");
			LoggerHandler.logError("Click on HRA on Calculator Page Failed .");
		}
	}
	
	public void clickOnEMI(WebDriver driver , ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			helper.ElementToBeClickable(calculatorpage.EMI,20);
			helper.ClickOnElement(calculatorpage.EMI);
			
			test.pass("Click on EMI on Calculator Page Successed .");
			LoggerHandler.logInfo("Click on EMI on Calculator Page Successed .");
		}
		catch(Exception e) {
			test.fail("Click on EMI on Calculator Page Failed .");
			LoggerHandler.logError("Click on EMI on Calculator Page Failed .");
		}
	}
	
	public void clickOnCarLoanEMI(WebDriver driver , ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			helper.ElementToBeClickable(calculatorpage.carLoanEMI,20);
			helper.ClickOnElement(calculatorpage.carLoanEMI);
			
			test.pass("Click on Car Loan EMI on Calculator Page Successed .");
			LoggerHandler.logInfo("Click on Car Loan EMI on Calculator Page Successed .");
		}
		catch(Exception e) {
			test.fail("Click on Car Loan EMI on Calculator Page Failed .");
			LoggerHandler.logError("Click on Car Loan EMI on Calculator Page Failed .");
		}
	}
	
	public void clickOnSimpleInterest(WebDriver driver , ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			helper.ElementToBeClickable(calculatorpage.simpleInterest,20);
			helper.ClickOnElement(calculatorpage.simpleInterest);
			
			test.pass("Click on Simple Interest on Calculator Page Successed .");
			LoggerHandler.logInfo("Click on Simple Interest on Calculator Page Successed .");
		}
		catch(Exception e) {
			test.fail("Click on Simple Interest on Calculator Page Failed .");
			LoggerHandler.logError("Click on Simple Interest on Calculator Page Failed .");
		}
	}
	
	public void clickOnCompoundInterest(WebDriver driver , ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			helper.ElementToBeClickable(calculatorpage.compoundInterest,20);
			helper.ClickOnElement(calculatorpage.compoundInterest);
			
			test.pass("Click on Compound Interest on Calculator Page Successed .");
			LoggerHandler.logInfo("Click on Compound Interest on Calculator Page Successed .");
		}
		catch(Exception e) {
			test.fail("Click on Compound Interest on Calculator Page Failed .");
			LoggerHandler.logError("Click on Compound Interest on Calculator Page Failed .");
		}
	}
	
	public void clickOnNSC(WebDriver driver , ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			helper.ElementToBeClickable(calculatorpage.NSC,20);
			helper.ClickOnElement(calculatorpage.NSC);
			
			test.pass("Click on NSC on Calculator Page Successed .");
			LoggerHandler.logInfo("Click on NSC on Calculator Page Successed .");
		}
		catch(Exception e) {
			test.fail("Click on NSC on Calculator Page Failed .");
			LoggerHandler.logError("Click on NSC on Calculator Page Failed .");
		}
	}
	
	public void clickOnSetUpSIP(WebDriver driver , ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			helper.ElementToBeClickable(calculatorpage.setUpSIP,20);
			helper.ClickOnElement(calculatorpage.setUpSIP);
			
			test.pass("Click on Set Up SIP on Calculator Page Successed .");
			LoggerHandler.logInfo("Click on Set Up SIP on Calculator Page Successed .");
		}
		catch(Exception e) {
			test.fail("Click on Set Up SIP on Calculator Page Failed .");
			LoggerHandler.logError("Click on Set Up SIP on Calculator Page Failed .");
		}
	}
	
	public void clickOnGratuity(WebDriver driver , ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			helper.ElementToBeClickable(calculatorpage.gratuity,20);
			helper.ClickOnElement(calculatorpage.gratuity);
			
			test.pass("Click on Gratuity on Calculator Page Successed .");
			LoggerHandler.logInfo("Click on Gratuity on Calculator Page Successed .");
		}
		catch(Exception e) {
			test.fail("Click on Gratuity on Calculator Page Failed .");
			LoggerHandler.logError("Click on Gratuity on Calculator Page Failed .");
		}
	}
	
	public void clickOnAPY(WebDriver driver , ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			helper.ElementToBeClickable(calculatorpage.APY,20);
			helper.ClickOnElement(calculatorpage.APY);
			
			test.pass("Click on APY on Calculator Page Successed .");
			LoggerHandler.logInfo("Click on APY on Calculator Page Successed .");
		}
		catch(Exception e) {
			test.fail("Click on APY on Calculator Page Failed .");
			LoggerHandler.logError("Click on APY on Calculator Page Failed .");
		}
	}
	
	public void clickOnGST(WebDriver driver , ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			helper.ElementToBeClickable(calculatorpage.GST,20);
			helper.ClickOnElement(calculatorpage.GST);
			
			test.pass("Click on GST on Calculator Page Successed .");
			LoggerHandler.logInfo("Click on GST on Calculator Page Successed .");
		}
		catch(Exception e) {
			test.fail("Click on GST on Calculator Page Failed .");
			LoggerHandler.logError("Click on GST on Calculator Page Failed .");
		}
	}
}
