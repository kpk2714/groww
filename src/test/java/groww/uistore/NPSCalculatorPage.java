package groww.uistore;

import org.openqa.selenium.By;

public class NPSCalculatorPage {

	public By monthlyInvestment = By.id("INVESTMENT_PER_MONTH");
	public By interestRate = By.id("RATE_OF_INTEREST");
	public By age = By.id("AGE");
	public By sliderAge = By.xpath("//div[@aria-valuenow='20']");
	
	public By totalInvestment = By.xpath("//td[contains(text(),'Total investment')]/following-sibling::td/child::span");
	public By totalInterest = By.xpath("//td[contains(text(),'Interest earned')]/following-sibling::td/child::span");
	public By maturityAmount = By.xpath("//td[contains(text(),'Maturity amount')]/following-sibling::td/child::span");
	public By annuityInvestment = By.xpath("//td[contains(text(),'Min. annuity investment')]/following-sibling::td/child::span");
	
}
