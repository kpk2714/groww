package groww.uistore;

import org.openqa.selenium.By;

public class SetUpSIPCalculatorPage {

	public By monthlyInvestment = By.id("MONTHLY_INVESTMENT");
	public By annualSetUp = By.id("STEP_UP");
	public By returnRate = By.id("RETURN_RATE");
	public By timePeriod = By.id("TIME_PERIOD");
	
	public By investedAmount = By.xpath("//div[contains(text(),'Invested amount')]/following-sibling::div/descendant::span[2]");
	public By returnAmount = By.xpath("//div[contains(text(),'Est. returns')]/following-sibling::div/descendant::span[2]");
	public By totalValue = By.xpath("//div[contains(text(),'Total value')]/following-sibling::div/descendant::span[2]");
	
}
