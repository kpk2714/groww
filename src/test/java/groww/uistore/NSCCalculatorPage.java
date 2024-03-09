package groww.uistore;

import org.openqa.selenium.By;

public class NSCCalculatorPage {

	public By investedAmount = By.id("AMOUNT_INVESTED");
	public By interestRate = By.id("RATE_OF_INTEREST");
	public By frequency = By.xpath("//div[contains(text(),'Compounding frequency')]/child::div");
	
	public By showPrincipleAmount = By.xpath("//td[contains(text(),'Principal amount')]/following-sibling::td/child::span");
	public By interestAmount = By.xpath("//td[contains(text(),'Total interest')]/following-sibling::td/child::span");
	public By totalAmount = By.xpath("//td[contains(text(),'Total amount')]/following-sibling::td/child::span");
}
