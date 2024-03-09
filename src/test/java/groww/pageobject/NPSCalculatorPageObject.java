package groww.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.aventstack.extentreports.ExtentTest;

import groww.uistore.NPSCalculatorPage;
import groww.utilities.ExcelReader;
import groww.utilities.LoggerHandler;
import groww.utilities.WebDriverHelper;

public class NPSCalculatorPageObject {

	NPSCalculatorPage npscalculatorpage = new NPSCalculatorPage();
	
	String path = System.getProperty("user.dir")+"/TestData/testdata.xlsx";
	
	ExcelReader reader = new ExcelReader();
	
	public void enterMonthlyInvestment(WebDriver driver , ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			String data = reader.readDataFromExcel(path,"Groww",1,11);
			String amount = "";
			for(int i=0;i<data.length()-2;i++) {
				amount = amount + data.charAt(i);
			}
			
			helper.ElementToBeClickable(npscalculatorpage.monthlyInvestment,20);
			helper.ClickOnElement(npscalculatorpage.monthlyInvestment);
			helper.ClearInput(npscalculatorpage.monthlyInvestment);
			helper.SendKeys(npscalculatorpage.monthlyInvestment,amount);
			
			test.pass("Enter Monthly Investment " + amount +" Successed .");
			LoggerHandler.logInfo("Enter Monthly Investment " + amount +" Successed .");
		}
		catch(Exception e) {
			test.fail("Enter Investment Per Month Failed .");
			LoggerHandler.logError("Enter Investment Per Month Failed .");
			e.getMessage();
		}
	}
	
	public void enterInterestRate(WebDriver driver , ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			String rate = reader.readDataFromExcel(path,"Groww",2,11);

			helper.ElementToBeClickable(npscalculatorpage.interestRate,20);
			helper.ClickOnElement(npscalculatorpage.interestRate);
			helper.ClearInput(npscalculatorpage.interestRate);
			helper.SendKeys(npscalculatorpage.interestRate,rate);
			
			test.pass("Enter Expected Return Rate " + rate +" Successed .");
			LoggerHandler.logInfo("Enter Expected Return Rate " + rate +" Successed .");
		}
		catch(Exception e) {
			test.fail("Enter Expected Return Rate Failed .");
			LoggerHandler.logError("Enter Expected Return Rate Failed .");
			e.getMessage();
		}
	}
	
	public void enterAge(WebDriver driver , ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			String data = reader.readDataFromExcel(path,"Groww",3,11);
			String age = "";
			for(int i=0;i<data.length()-2;i++) {
				age = age + data.charAt(i);
			}

			helper.ElementToBeClickable(npscalculatorpage.sliderAge,20);
			Actions actions = new Actions(driver);
			WebElement slider = helper.FindElement(npscalculatorpage.sliderAge);
			actions.dragAndDropBy(slider, 45, 0).perform();
			
			test.pass("Enter Age " + age +" Successed .");
			LoggerHandler.logInfo("Enter Age " + age +" Successed .");
		}
		catch(Exception e) {
			test.fail("Enter Age Failed .");
			LoggerHandler.logError("Enter Age Failed .");
			e.getMessage();
		}
	}
	
	public void displayTotalInvestment(WebDriver driver , ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			helper.ScrollByThreeHundred();
			Thread.sleep(1000);
			helper.ElemenetToBeLocated(npscalculatorpage.totalInvestment,20);
			String amount = helper.GetText(npscalculatorpage.totalInvestment);
			
			test.pass("Total Invested Amount is "+amount);
			LoggerHandler.logInfo("Total Invested Amount is "+amount);
		}
		catch(Exception e) {
			test.fail("Display Total Invested Amount Failed .");
			LoggerHandler.logError("Display Total Invested Amount Failed .");
			e.getMessage();
		}
	}
	
	public void displayTotalInterestAmount(WebDriver driver , ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			helper.ElemenetToBeLocated(npscalculatorpage.totalInterest,20);
			String amount = helper.GetText(npscalculatorpage.totalInterest);
			
			test.pass("Total Interest Amount is "+amount);
			LoggerHandler.logInfo("Total Interest Amount is "+amount);
		}
		catch(Exception e) {
			test.fail("Display Total Interest Amount Failed .");
			LoggerHandler.logError("Display Total Interest Amount Failed .");
			e.getMessage();
		}
	}
	
	public void displayMaturityAmount(WebDriver driver , ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			helper.ElemenetToBeLocated(npscalculatorpage.maturityAmount,20);
			String amount = helper.GetText(npscalculatorpage.maturityAmount);
			
			test.pass("Maturity Amount is "+amount);
			LoggerHandler.logInfo("Maturity Amount is "+amount);
		}
		catch(Exception e) {
			test.fail("Display Maturity Amount Failed .");
			LoggerHandler.logError("Display Maturity Amount Failed .");
			e.getMessage();
		}
	}
	
	public void displayMinAnnuityInvestment(WebDriver driver , ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			helper.ElemenetToBeLocated(npscalculatorpage.annuityInvestment,20);
			String amount = helper.GetText(npscalculatorpage.annuityInvestment);
			
			test.pass("Min. Annuity Investment is "+amount);
			LoggerHandler.logInfo("Min. Annuity Investment is "+amount);
		}
		catch(Exception e) {
			test.fail("Display Min. Annuity Investment Failed .");
			LoggerHandler.logError("Display Min. Annuity Investment Failed .");
			e.getMessage();
		}
	}
}
