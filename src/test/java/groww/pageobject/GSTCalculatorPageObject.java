package groww.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.aventstack.extentreports.ExtentTest;

import groww.uistore.GSTCalculatorPage;
import groww.utilities.LoggerHandler;
import groww.utilities.WebDriverHelper;

public class GSTCalculatorPageObject {
	
	GSTCalculatorPage gstCalculatorPage = new GSTCalculatorPage();

	public void chooseTotalAmount(WebDriver driver,ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			helper.ElemenetToBeLocated(gstCalculatorPage.totalAmount, 20);
			WebElement slider = helper.FindElement(gstCalculatorPage.totalAmount);
			
			Actions actions = new Actions(driver);
			actions.dragAndDropBy(slider, 30, 0).perform();
			
			test.pass("Choosing Total Amount by Slider Successed .");
			LoggerHandler.logInfo("Choosing Total Amount by Slider Successed .");
		}
		catch(Exception e) {
			test.fail("Choosing Total Amount by Slider Failed .");
			LoggerHandler.logError("Choosing Total Amount by Slider Failed .");
		}
	}
	
	public void chooseTaxSlab(WebDriver driver,ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			helper.ElemenetToBeLocated(gstCalculatorPage.taxSlab, 20);
			WebElement slider = helper.FindElement(gstCalculatorPage.taxSlab);
			
			Actions actions = new Actions(driver);
			actions.dragAndDropBy(slider,120, 0).perform();
			
			test.pass("Choosing Desired Monthly Pension by Slider Successed .");
			LoggerHandler.logInfo("Choosing Desired Monthly Pension by Slider Successed .");
		}
		catch(Exception e) {
			test.fail("Choosing Desired Monthly Pension by Slider Failed .");
			LoggerHandler.logError("Choosing Desired Monthly Pension by Slider Failed .");
		}
	}
	
	public void displayGSTAmount(WebDriver driver,ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			Thread.sleep(1000);
			
			helper.ElemenetToBeLocated(gstCalculatorPage.totalGST, 20);
			String amount = helper.GetText(gstCalculatorPage.totalGST);
			
			test.pass("Total GST Amount is "+amount);
			LoggerHandler.logInfo("Total GST Amount is "+amount);
		}
		catch(Exception e) {
			test.fail("Display Total GST Amount Failed .");
			LoggerHandler.logError("Display Total GST Amount Failed .");
		}
	}
	
	public void displayPostGSTAmount(WebDriver driver,ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			helper.ElemenetToBeLocated(gstCalculatorPage.postGSTAmount, 20);
			String amount = helper.GetText(gstCalculatorPage.postGSTAmount);
			
			test.pass("Post-GST Amount is "+amount);
			LoggerHandler.logInfo("Post-GST Amount is "+amount);
		}
		catch(Exception e) {
			test.fail("Display Post-GST Amount Failed .");
			LoggerHandler.logError("Display Post-GST Amount Failed .");
		}
	}
}
