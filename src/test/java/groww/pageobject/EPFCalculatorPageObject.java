package groww.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.aventstack.extentreports.ExtentTest;

import groww.uistore.EPFCalculatorPage;
import groww.utilities.ExcelReader;
import groww.utilities.LoggerHandler;
import groww.utilities.WebDriverHelper;

public class EPFCalculatorPageObject {

	EPFCalculatorPage epfcalculatorpage = new EPFCalculatorPage();
	
	String path = System.getProperty("user.dir")+"/TestData/testdata.xlsx";
	
	ExcelReader reader = new ExcelReader();
	
	public void enterMonthlySalary(WebDriver driver , ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			String data = reader.readDataFromExcel(path,"Groww",1,8);
			String amount = "";
			for(int i=0;i<data.length()-2;i++) {
				amount = amount + data.charAt(i);
			}
			
			helper.ElementToBeClickable(epfcalculatorpage.monthlySalary,20);
			helper.ClickOnElement(epfcalculatorpage.monthlySalary);
			helper.ClearInput(epfcalculatorpage.monthlySalary);
			helper.SendKeys(epfcalculatorpage.monthlySalary,amount);
			
			test.pass("Enter Monthly Salary " + amount +" Successed .");
			LoggerHandler.logInfo("Enter Monthly Salary " + amount +" Successed .");
		}
		catch(Exception e) {
			test.fail("Enter Monthly Salary Failed .");
			LoggerHandler.logError("Enter Monthly Salary Failed .");
			e.getMessage();
		}
	}
	
	public void enterAge(WebDriver driver , ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			String data = reader.readDataFromExcel(path,"Groww",2,8);

			String age = "";
			for(int i=0;i<data.length()-2;i++) {
				age = age + data.charAt(i);
			}
			
			WebElement slider = helper.FindElement(epfcalculatorpage.slider);
			Actions actions = new Actions(driver);
			actions.dragAndDropBy(slider,-95, 0).perform();
			
			test.pass("Enter Age " + age +" Successed .");
			LoggerHandler.logInfo("Enter Age " + age +" Successed .");
		}
		catch(Exception e) {
			test.fail("Enter Age Failed .");
			LoggerHandler.logError("Enter Age Failed .");
			e.getMessage();
		}
	}
	
	public void enterContribution(WebDriver driver , ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			String data = reader.readDataFromExcel(path,"Groww",3,8);
			String contribution = "";
			for(int i=0;i<data.length()-2;i++) {
				contribution = contribution + data.charAt(i);
			}
			
			helper.ElementToBeClickable(epfcalculatorpage.contribution,20);
			helper.ClickOnElement(epfcalculatorpage.contribution);
			helper.ClearInput(epfcalculatorpage.contribution);
			helper.SendKeys(epfcalculatorpage.contribution,contribution);
			
			test.pass("Enter contribution to EPF " + contribution +" Successed .");
			LoggerHandler.logInfo("Enter contribution to EPF " + contribution +" Successed .");
		}
		catch(Exception e) {
			test.fail("Enter contribution to EPF Failed .");
			LoggerHandler.logError("Enter contribution to EPF Failed .");
			e.getMessage();
		}
	}
	
	public void enterAnnualIncrease(WebDriver driver , ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			String data = reader.readDataFromExcel(path,"Groww",4,8);
			String annualIncrease = "";
			for(int i=0;i<data.length()-2;i++) {
				annualIncrease = annualIncrease + data.charAt(i);
			}
			
			helper.ElementToBeClickable(epfcalculatorpage.increaseRate,20);
			helper.ClickOnElement(epfcalculatorpage.increaseRate);
			helper.ClearInput(epfcalculatorpage.increaseRate);
			helper.SendKeys(epfcalculatorpage.increaseRate,annualIncrease);
			
			test.pass("Enter Annual Increase " + annualIncrease +" in Salary Successed .");
			LoggerHandler.logInfo("Enter Annual Increase " + annualIncrease +" in Salary Successed .");
		}
		catch(Exception e) {
			test.fail("Enter Annual Increase in Salary Failed .");
			LoggerHandler.logError("Enter Annual Increase in Salary Failed .");
			e.getMessage();
		}
	}
	
	public void displayRetiredAmount(WebDriver driver , ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			helper.ScrollByThreeHundred();
			Thread.sleep(2000);
			helper.ElemenetToBeLocated(epfcalculatorpage.retireAmount,20);
			String amount = helper.GetText(epfcalculatorpage.retireAmount);
			
			test.pass("Retired Amount is "+amount);
			LoggerHandler.logInfo("Retired Amount is "+amount);
		}
		catch(Exception e) {
			test.fail("Display Retired Amount Failed .");
			LoggerHandler.logError("Display Retired Amount Failed .");
			e.getMessage();
		}
	}
	
	
}
