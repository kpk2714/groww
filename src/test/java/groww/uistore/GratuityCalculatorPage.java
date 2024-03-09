package groww.uistore;

import org.openqa.selenium.By;

public class GratuityCalculatorPage {

	public By monthlySalary = By.id("MONTHLY_SALARY");
	public By year = By.id("YEARS");
	public By dragYear = By.xpath("//div[starts-with(@aria-valuenow,'20')]");
	public By gratuityAmount = By.xpath("//div[contains(text(),'Total Gratuity payable')]/child::div/child::span");
}
