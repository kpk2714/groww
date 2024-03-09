package groww.uistore;

import org.openqa.selenium.By;

public class SWPCalculatorPage {

	public By totalInvestment = By.id("TOTAL_INVESTMENT");
	public By withdrawlPerMonth = By.id("WITHDRAWAL_PER_MONTH");
	public By returnRate = By.id("RATE_OF_INTEREST");
	public By timePeriod = By.id("TIME_PERIOD");
	
	public By showTotalInvestment = By.xpath("//td[contains(text(),'Total investment')]/following-sibling::td/child::span");
	public By showTotalWithdrawl = By.xpath("//td[contains(text(),'Total withdrawal')]/following-sibling::td/child::span");
	public By showFinalValue = By.xpath("//td[contains(text(),'Final value')]/following-sibling::td/child::span");
}
