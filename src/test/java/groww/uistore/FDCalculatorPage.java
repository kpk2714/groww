package groww.uistore;

import org.openqa.selenium.By;

public class FDCalculatorPage {

	public By totalInvestment = By.id("TOTAL_INVESTMENT");
	public By interestRate = By.id("RATE_OF_INTEREST");
	public By timePeriod = By.id("FD_TIME_IN_YEARS");
	
	public By investedAmount = By.xpath("//td[contains(text(),'Invested amount')]/following-sibling::td/child::span");
	public By returnAmount = By.xpath("//td[contains(text(),'Est. returns')]/following-sibling::td/child::span");
	public By totalValue = By.xpath("//td[contains(text(),'Total value')]/following-sibling::td/child::span");
}
