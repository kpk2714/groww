package groww.uistore;

import org.openqa.selenium.By;

public class EPFCalculatorPage {

	public By monthlySalary = By.id("MONTHLY_SALARY");
	public By slider = By.xpath("//div[@aria-valuenow='30']");
	public By age = By.id("AGE");
	public By contribution = By.id("EMPLOYEE_CONTRIBUTION_PERCENT");
	public By increaseRate = By.id("ANNUAL_INCREASE_SALARY");
	
	public By retireAmount = By.xpath("//div[contains(text(),'You will have accumulated')]/child::div/child::span");
}
