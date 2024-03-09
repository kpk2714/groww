package groww.uistore;

import org.openqa.selenium.By;

public class HomeLoanEMICalculatorPage {
	
	public By loanAmount = By.id("LOAN_AMOUNT");
	public By interestRate = By.id("RATE_OF_INTEREST");
	public By loanYear = By.id("LOAN_TENURE");
	
	public By monthlyEMI = By.xpath("//td[contains(text(),'Monthly EMI')]/following-sibling::td");
	public By principalAmount = By.xpath("//td[contains(text(),'Principal amount')]/following-sibling::td");
	public By totalInterest = By.xpath("//td[contains(text(),'Total interest')]/following-sibling::td");
	public By totalAmount = By.xpath("//td[contains(text(),'Total amount')]/following-sibling::td");
}
