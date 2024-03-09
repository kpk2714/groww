package groww.pageobject;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import groww.uistore.ITIMutualFundPage;
import groww.utilities.LoggerHandler;
import groww.utilities.WebDriverHelper;

public class ITIMutualFundPageObject {
	
	ITIMutualFundPage itiMutualFundPage = new ITIMutualFundPage();

	public void clickOnViewAll(WebDriver driver,ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			helper.ElementToBeClickable(itiMutualFundPage.viewAll, 20);
			helper.ClickOnElement(itiMutualFundPage.viewAll);
			
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
			
			helper.ElemenetToBeLocated(itiMutualFundPage.total, 20);
			
			String no = helper.GetText(itiMutualFundPage.total);
			
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
