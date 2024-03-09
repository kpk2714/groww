package groww.pageobject;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import groww.uistore.AMCMutualFundPage;
import groww.utilities.LoggerHandler;
import groww.utilities.WebDriverHelper;

public class AMCMutualFundPageObject {

	AMCMutualFundPage amcMutualFundPage = new AMCMutualFundPage();
	
	public void clickOnBajajFinance(WebDriver driver,ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			helper.ElementToBeClickable(amcMutualFundPage.bajajFinance, 20);
			helper.ClickOnElement(amcMutualFundPage.bajajFinance);
			
			test.pass("Click on Bajaj Finserv Mutual Fund Successed .");
			LoggerHandler.logInfo("Click on Bajaj Finserv Mutual Fund Successed .");
		}
		catch(Exception e) {
			test.fail("Click on Bajaj Finserv Mutual Fund Failed .");
			LoggerHandler.logError("Click on Bajaj Finserv Mutual Fund Failed .");
			e.getMessage();
		}
	}
	
	public void clickOnWhiteOak(WebDriver driver,ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			helper.ElementToBeClickable(amcMutualFundPage.whiteOak, 20);
			helper.ClickOnElement(amcMutualFundPage.whiteOak);
			
			test.pass("Click on WhiteOak Capital Mutual Fund Successed .");
			LoggerHandler.logInfo("Click on WhiteOak Capital Mutual Fund Successed .");
		}
		catch(Exception e) {
			test.fail("Click on WhiteOak Capital Mutual Fund Failed .");
			LoggerHandler.logError("Click on WhiteOak Capital Mutual Fund Failed .");
			e.getMessage();
		}
	}
	
	public void clickOnItiMutualFund(WebDriver driver,ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			helper.ElementToBeClickable(amcMutualFundPage.itiMutualFund, 20);
			helper.ClickOnElement(amcMutualFundPage.itiMutualFund);
			
			test.pass("Click on ITI Mutual Fund Successed .");
			LoggerHandler.logInfo("Click on ITI Mutual Fund Successed .");
		}
		catch(Exception e) {
			test.fail("Click on ITI Mutual Fund Failed .");
			LoggerHandler.logError("Click on ITI Mutual Fund Failed .");
			e.getMessage();
		}
	}
	
	public void clickOnTrustMutualFund(WebDriver driver,ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			helper.ElementToBeClickable(amcMutualFundPage.trustMutualFund, 20);
			helper.ClickOnElement(amcMutualFundPage.trustMutualFund);
			
			test.pass("Click on Trust Mutual Fund Successed .");
			LoggerHandler.logInfo("Click on Trust Mutual Fund Successed .");
		}
		catch(Exception e) {
			test.fail("Click on ITI Trust Fund Failed .");
			LoggerHandler.logError("Click on ITI Trust Fund Failed .");
			e.getMessage();
		}
	}
	
	public void clickOnNJMutualFund(WebDriver driver,ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			helper.ElementToBeClickable(amcMutualFundPage.njMutualFund, 20);
			helper.ClickOnElement(amcMutualFundPage.njMutualFund);
			
			test.pass("Click on NJ Mutual Fund Successed .");
			LoggerHandler.logInfo("Click on NJ Mutual Fund Successed .");
		}
		catch(Exception e) {
			test.fail("Click on NJ Trust Fund Failed .");
			LoggerHandler.logError("Click on NJ Trust Fund Failed .");
			e.getMessage();
		}
	}
	
	public void clickOnSamcoMutualFund(WebDriver driver,ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			helper.ElementToBeClickable(amcMutualFundPage.samcoMutualFund, 20);
			helper.ClickOnElement(amcMutualFundPage.samcoMutualFund);
			
			test.pass("Click on Samco Mutual Fund Successed .");
			LoggerHandler.logInfo("Click on Samco Mutual Fund Successed .");
		}
		catch(Exception e) {
			test.fail("Click on Samco Trust Fund Failed .");
			LoggerHandler.logError("Click on Samco Trust Fund Failed .");
			e.getMessage();
		}
	}
	
	public void clickOnMahindraMutualFund(WebDriver driver,ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			helper.ElementToBeClickable(amcMutualFundPage.mahindraMutualFund, 20);
			helper.ClickOnElement(amcMutualFundPage.mahindraMutualFund);
			
			test.pass("Click on Mahindra Manulife Mutual Fund Successed .");
			LoggerHandler.logInfo("Click on Mahindra Manulife Mutual Fund Successed .");
		}
		catch(Exception e) {
			test.fail("Click on Mahindra Manulife Mutual Fund Failed .");
			LoggerHandler.logError("Click on Mahindra Manulife Mutual Fund Failed .");
			e.getMessage();
		}
	}
	
	public void clickOnCanaraRebecoMutualFund(WebDriver driver,ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			helper.ElementToBeClickable(amcMutualFundPage.canaraMutualFund, 20);
			helper.ClickOnElement(amcMutualFundPage.canaraMutualFund);
			
			test.pass("Click on Canara Rebeco Mutual Fund Successed .");
			LoggerHandler.logInfo("Click on Canara Rebeco Mutual Fund Successed .");
		}
		catch(Exception e) {
			test.fail("Click on Canara Rebeco Mutual Fund Failed .");
			LoggerHandler.logError("Click on Canara Rebeco Mutual Fund Failed .");
			e.getMessage();
		}
	}
}
