package groww.pageobject;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import groww.uistore.MahindraManulifeMutualFundPage;
import groww.utilities.LoggerHandler;
import groww.utilities.WebDriverHelper;

public class MahindraManulifeMutualFundPageObject {
	
	MahindraManulifeMutualFundPage mahindraManulifeMutualFundPage = new MahindraManulifeMutualFundPage();

	public void clickOnViewAll(WebDriver driver,ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			helper.ElementToBeClickable(mahindraManulifeMutualFundPage.viewAll, 20);
			helper.ClickOnElement(mahindraManulifeMutualFundPage.viewAll);
			
			test.pass("Click on View All Successed .");
			LoggerHandler.logInfo("Click on View All Successed .");
		}
		catch(Exception e) {
			test.fail("Click on View All Failed .");
			LoggerHandler.logError("Click on View All Failed .");
			e.getMessage();
		}
	}
	
	public void displayTotalNumberOfMutualFunds(WebDriver driver,ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			helper.ElemenetToBeLocated(mahindraManulifeMutualFundPage.total, 20);
			
			String no = helper.GetText(mahindraManulifeMutualFundPage.total);
			
			test.pass("Display total number of Mutual Funds is "+no);
			LoggerHandler.logInfo("Display total number of Mutual Funds is "+no);
		}
		catch(Exception e) {
			test.fail("Display total number of Mutual Funds Failed .");
			LoggerHandler.logError("Display total number of Mutual Funds Failed .");
			e.getMessage();
		}
	}
}
