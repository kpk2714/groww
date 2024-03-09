package groww.uistore;

import org.openqa.selenium.By;

public class SSYCalculatorPage {

	public By yearlyInvestment = By.id("YEARLY_INVESTMENT");
	public By girlAge = By.id("GIRLS_AGE");
	public By startYear = By.id("START_YEAR");
	
	public By totalInvestment = By.xpath("//td[contains(text(),'Total investment')]/following-sibling::td/child::span");
	public By totalInterest = By.xpath("//td[contains(text(),'Total interest')]/following-sibling::td/child::span");
	public By maturityYear = By.xpath("//td[contains(text(),'Maturity year')]/following-sibling::td");
	public By maturityValue = By.xpath("//td[contains(text(),'Maturity value')]/following-sibling::td/child::span");
}
