package groww.uistore;

import org.openqa.selenium.By;

public class LumpsumCalculatorPage {

	public By totalInvestment = By.id("LUMPSUM_MONTHLY_INVESTMENT");
	public By returnRate = By.id("RETURN_RATE");
	public By timePeriod = By.id("TIME_PERIOD");
	
	public By investedAmount = By.xpath("//div[contains(text(),'Total value')]/parent::div/preceding-sibling::div[2]/child::div[2]/child::span/child::span");
	public By returnAmount = By.xpath("//div[contains(text(),'Total value')]/parent::div/preceding-sibling::div[1]/child::div[2]/child::span/child::span");
	public By totalAmount = By.xpath("//div[contains(text(),'Total value')]/parent::div/child::div[2]/child::span/child::span");
}
