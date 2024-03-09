package groww.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.aventstack.extentreports.ExtentTest;

import groww.uistore.APYCalculatorPage;
import groww.utilities.LoggerHandler;
import groww.utilities.WebDriverHelper;

public class APYCalculatorPageObject {
	
	APYCalculatorPage apycalculatorpage = new APYCalculatorPage();

	public void enterAge(WebDriver driver,ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			helper.ElemenetToBeLocated(apycalculatorpage.sliderAge, 20);
			WebElement slider = helper.FindElement(apycalculatorpage.sliderAge);
			
			Actions actions = new Actions(driver);
			actions.dragAndDropBy(slider, -50, 0).perform();;
			
			test.pass("Choosing Joining Age by Slider Successed .");
			LoggerHandler.logInfo("Choosing Joining Age by Slider Successed .");
		}
		catch(Exception e) {
			test.fail("Choosing Joining Age by Slider Failed .");
			LoggerHandler.logError("Choosing Joining Age by Slider Failed .");
		}
	}
	
	public void enterPension(WebDriver driver,ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			helper.ElemenetToBeLocated(apycalculatorpage.sliderPension, 20);
			WebElement slider = helper.FindElement(apycalculatorpage.sliderPension);
			
			Actions actions = new Actions(driver);
			actions.dragAndDropBy(slider, 750, 0).perform();
			
			test.pass("Choosing Desired Monthly Pension by Slider Successed .");
			LoggerHandler.logInfo("Choosing Desired Monthly Pension by Slider Successed .");
		}
		catch(Exception e) {
			test.fail("Choosing Desired Monthly Pension by Slider Failed .");
			LoggerHandler.logError("Choosing Desired Monthly Pension by Slider Failed .");
		}
	}
	
	public void displayMonthlyInvestment(WebDriver driver,ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			Thread.sleep(1000);
			
			helper.ElemenetToBeLocated(apycalculatorpage.displayMonthlyInvestment, 20);
			String amount = helper.GetText(apycalculatorpage.displayMonthlyInvestment);
			
			test.pass("Monthly Investment is "+amount);
			LoggerHandler.logInfo("Monthly Investment is "+amount);
		}
		catch(Exception e) {
			test.fail("Display Monthly Investment Failed .");
			LoggerHandler.logError("Display Monthly Investment Failed .");
		}
	}
	
	public void displayInvestmentDuration(WebDriver driver,ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			helper.ElemenetToBeLocated(apycalculatorpage.displayDuration, 20);
			String data = helper.GetText(apycalculatorpage.displayDuration);
			
			String duration = data.charAt(0)+""+data.charAt(1)+"";
			
			test.pass("Investment Duration is "+duration);
			LoggerHandler.logInfo("Investment Duration is "+duration);
		}
		catch(Exception e) {
			test.fail("Display Investment Duration Failed .");
			LoggerHandler.logError("Display Investment Duration Failed .");
		}
	}
	
	public void displayTotalAmount(WebDriver driver,ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			helper.ElemenetToBeLocated(apycalculatorpage.displayAmount, 20);
			String data = helper.GetText(apycalculatorpage.displayAmount);
			
			String amount = "";
			
			for(int i=2;i<data.length();i++) {
				amount = amount + data.charAt(i);
			}
			
			test.pass("Total Amount is "+amount);
			LoggerHandler.logInfo("Total Amount is "+amount);
		}
		catch(Exception e) {
			test.fail("Display Total Amount Failed .");
			LoggerHandler.logError("Display Total Amount Failed .");
		}
	}
}
