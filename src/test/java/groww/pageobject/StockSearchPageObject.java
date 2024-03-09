package groww.pageobject;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import groww.uistore.StockSearchPage;
import groww.utilities.ExcelReader;
import groww.utilities.LoggerHandler;
import groww.utilities.WebDriverHelper;

public class StockSearchPageObject {

	StockSearchPage stocksearchpage = new StockSearchPage();
	
	String path = System.getProperty("user.dir") + "/TestData/testdata.xlsx";
	
	ExcelReader reader = new ExcelReader();
	
	public void verifyStockName(WebDriver driver,ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			String data = reader.readDataFromExcel(path,"Groww",2,0);
			
			helper.ElemenetToBeLocated(stocksearchpage.verifystockname,20);
			String stockName = helper.GetText(stocksearchpage.verifystockname);
			if(stockName.equalsIgnoreCase(data)) {
				test.pass("Stock Name "+data+" Verification Successed .");
				LoggerHandler.logInfo("Stock Name "+data+" Verification Successed .");
			}
			else {
				test.fail("Stock Name "+data+" Verification Failed .");
				LoggerHandler.logError("Stock Name "+data+" Verification Failed .");
			}
		}
		catch(Exception e) {
			e.getMessage();
		}
	}
}
