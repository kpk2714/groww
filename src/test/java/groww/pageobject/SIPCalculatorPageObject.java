package groww.pageobject;

import org.openqa.selenium.WebDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import com.aventstack.extentreports.ExtentTest;

import groww.uistore.SIPCalculatorPage;
import groww.utilities.ExcelReader;
import groww.utilities.LoggerHandler;
import groww.utilities.WebDriverHelper;

public class SIPCalculatorPageObject {

	SIPCalculatorPage sipcalculatorpage = new SIPCalculatorPage();
	
	String path = System.getProperty("user.dir")+"/TestData/testdata.xlsx";
	
	ExcelReader reader = new ExcelReader();
	
	public void enterMonthlyInvestment(WebDriver driver,ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			String data = reader.readDataFromExcel(path,"Groww", 1, 2);
			
			String amount = "";
			for(int i=0;i<data.length()-2;i++) {
				amount += data.charAt(i);
			}
			
			helper.ElementToBeClickable(sipcalculatorpage.monthlyInvestment,20);
			helper.ClickOnElement(sipcalculatorpage.monthlyInvestment);
			helper.ClearInput(sipcalculatorpage.monthlyInvestment);
			helper.SendKeys(sipcalculatorpage.monthlyInvestment,amount);
			
			test.pass("Enter Monthly Investment " + amount +" Successed .");
			LoggerHandler.logInfo("Enter Monthly Investment " + amount +" Successed .");
		}
		catch(Exception e) {
			test.fail("Enter Monthly Investment Failed .");
			LoggerHandler.logError("Enter Monthly Investment Failed .");
			e.getMessage();
		}
	}
	
	public void enterReturnRate(WebDriver driver,ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			String data = reader.readDataFromExcel(path,"Groww", 2, 2);
			
			String rate = "";
			for(int i=0;i<data.length()-2;i++) {
				rate += data.charAt(i);
			}
			
			helper.ElementToBeClickable(sipcalculatorpage.returnRate,20);
			helper.ClickOnElement(sipcalculatorpage.returnRate);
			helper.ClearInput(sipcalculatorpage.returnRate);
			helper.SendKeys(sipcalculatorpage.returnRate,rate);
			
			test.pass("Enter Expected Return Rate " + rate +" Successed .");
			LoggerHandler.logInfo("Enter Expected Return Rate " + rate +" Successed .");
		}
		catch(Exception e) {
			test.fail("Enter Expected Return Rate Failed .");
			LoggerHandler.logError("Enter Expected Return Rate Failed .");
		}
	}
	
	public void enterTimePeriod(WebDriver driver,ExtentTest test) {
		try {
			WebDriverHelper helper = new WebDriverHelper(driver);
			
			String data = reader.readDataFromExcel(path,"Groww", 3, 2);
			
			String period = "";
			for(int i=0;i<data.length()-2;i++) {
				period += data.charAt(i);
			}
			
			helper.ElementToBeClickable(sipcalculatorpage.timePeriod,20);
			helper.ClickOnElement(sipcalculatorpage.timePeriod);
			helper.ClearInput(sipcalculatorpage.timePeriod);
			helper.SendKeys(sipcalculatorpage.timePeriod,period);
			
			test.pass("Enter Time Period " + period +" Successed .");
			LoggerHandler.logInfo("Enter Time Period " + period +" Successed .");
		}
		catch(Exception e) {
			test.fail("Enter Time Period Failed .");
			LoggerHandler.logError("Enter Time Period Failed .");
			e.getMessage();
		}
	}
	
	public void displayInvestedAmount(WebDriver driver,ExtentTest test) {
		try {
			Screen screen = new Screen();
			Pattern investedAmount = new Pattern("G:\\FreeLenserProject\\GrowwHybrid\\SikuliImages\\investedAmount.PNG");
			
			WebDriverHelper helper = new WebDriverHelper(driver);
			helper.ScrollByFiveHundred();
			
			screen.wait(investedAmount,20);
			String amount = screen.find(investedAmount).text();
			
			test.pass("Invested Amount is "+amount);
			LoggerHandler.logInfo("Invested Amount is "+amount);
		}
		catch(Exception e) {
			test.fail("Display Invested Amount Failed");
			LoggerHandler.logError("Display Invested Amount Failed");
			e.getMessage();
		}
	}
	
	public void displayReturnAmount(WebDriver driver,ExtentTest test) {
		try {
			Screen screen = new Screen();
			Pattern returnAmount = new Pattern("G:\\FreeLenserProject\\GrowwHybrid\\SikuliImages\\returnAmount.PNG");
			
			screen.wait(returnAmount,20);
			String amount = screen.find(returnAmount).text();
			
			test.pass("Expected Return Amount is "+amount);
			LoggerHandler.logInfo("Expected Return Amount is "+amount);
		}
		catch(Exception e) {
			test.fail("Display Expected Return Amount Failed .");
			LoggerHandler.logInfo("Display Expected Return Amount Failed .");
			e.getMessage();
		}
	}
	
	public void displayTotalAmount(WebDriver driver,ExtentTest test) {
		try {
			Screen screen = new Screen();
			Pattern totalAmount = new Pattern("G:\\FreeLenserProject\\GrowwHybrid\\SikuliImages\\totalAmount.PNG");
			
			screen.wait(totalAmount,20);
			String amount = screen.find(totalAmount).text();
			
			test.pass("Total Amount is "+amount);
			LoggerHandler.logInfo("Total Amount is "+amount);
		}
		catch(Exception e) {
			test.fail("Display Total Amount Failed .");
			LoggerHandler.logError("Display Total Amount Failed . ");
			e.getMessage();
		}
	}
}
