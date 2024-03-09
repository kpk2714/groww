package groww.uistore;

import org.openqa.selenium.By;

public class SimpleInterestCalculatorPage {

	public By principleAmount = By.id("PRINCIPAL_AMOUNT");
	public By interestRate = By.id("RATE_OF_INTEREST");
	public By timePeriod = By.id("TIME_PERIOD");
	
	public By showPrincipleAmount = By.xpath("//td[contains(text(),'Principal amount')]/following-sibling::td/child::span");
	public By interestAmount = By.xpath("//td[contains(text(),'Total interest')]/following-sibling::td/child::span");
	public By totalAmount = By.xpath("//td[contains(text(),'Total amount')]/following-sibling::td/child::span");
}
