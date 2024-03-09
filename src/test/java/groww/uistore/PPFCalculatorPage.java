package groww.uistore;

import org.openqa.selenium.By;

public class PPFCalculatorPage {

	public By yearlyInvestment = By.id("YEARLY_INVESTMENT");
	public By timePeriod = By.id("FD_TIME_IN_YEARS");
	
	public By investedAmount = By.xpath("//td[contains(text(),'Invested amount')]/following-sibling::td/child::span");
	public By totalInterest = By.xpath("//td[contains(text(),'Total interest')]/following-sibling::td/child::span");
	public By maturityvalue = By.xpath("//td[contains(text(),'Maturity value')]/following-sibling::td/child::span");
}
