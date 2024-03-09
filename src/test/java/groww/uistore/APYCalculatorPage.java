package groww.uistore;

import org.openqa.selenium.By;

public class APYCalculatorPage {

	public By sliderAge = By.xpath("//div[@aria-valuenow='25']");
	public By sliderPension = By.xpath("//div[@aria-valuemin='1000']");
	
	public By displayMonthlyInvestment = By.xpath("//td[contains(text(),'Monthly investment')]/following-sibling::td/child::span");
	public By displayDuration = By.xpath("//td[contains(text(),'Investment duration')]/following-sibling::td");
	public By displayAmount = By.xpath("//td[contains(text(),'Total amount')]/following-sibling::td");
}
