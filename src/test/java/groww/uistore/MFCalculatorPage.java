package groww.uistore;

import org.openqa.selenium.By;

public class MFCalculatorPage {

	public By totalInvestment = By.id("LUMPSUM_MONTHLY_INVESTMENT");
	public By returnRate = By.id("RETURN RATE");
	public By timePeriod = By.id("TIME_PERIOD");
	
	public By showInvestedAmount = By.xpath("//div[contains(text(),'Total value')]/parent::div/preceding-sibling::div[2]/child::div/following-sibling::div/child::span/child::span");
	public By showEstimateReturn = By.xpath("//div[contains(text(),'Total value')]/parent::div/preceding-sibling::div[1]/child::div/following-sibling::div/child::span/child::span");
	public By showTotalValue = By.xpath("//div[contains(text(),'Total value')]/parent::div/child::div/following-sibling::div/child::span/child::span");
}
