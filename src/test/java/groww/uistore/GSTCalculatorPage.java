package groww.uistore;

import org.openqa.selenium.By;

public class GSTCalculatorPage {

	public By totalAmount = By.xpath("//div[@aria-valuemin='5000']");
	public By taxSlab = By.xpath("//div[@aria-valuemin='1']");
	
	public By totalGST = By.xpath("//div[contains(text(),'Total GST')]/following-sibling::div/child::span");
	public By postGSTAmount = By.xpath("//div[contains(text(),'Post-GST amount')]/following-sibling::div/child::span");
}
