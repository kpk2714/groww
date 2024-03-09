package groww.uistore;

import org.openqa.selenium.By;

public class CalculatorPage {
	
	public By homeLoanEMI = By.xpath("//p[contains(text(),'Home Loan EMI')]");
	public By SIP = By.xpath("//p[contains(text(),'SIP')]");
	public By Lumpsum = By.xpath("//p[contains(text(),'Lumpsum')]");
	public By SWP = By.xpath("//p[contains(text(),'SWP')][1]");
	public By MF = By.xpath("//p[contains(text(),'MF')]");
	public By SSY = By.xpath("//p[contains(text(),'SSY')][1]");
	public By PPF = By.xpath("//p[contains(text(),'PPF')][1]");
	public By EPF = By.xpath("//p[contains(text(),'EPF')]");
	public By FD = By.xpath("//p[contains(text(),'FD')][1]");
	public By RD = By.xpath("//p[contains(text(),'RD')][1]");
	public By NPS = By.xpath("//p[contains(text(),'NPS')][1]");
	public By HRA = By.xpath("//p[contains(text(),'HRA')][1]");
	
	public By EMI = By.xpath("//a[@href = '/calculators/emi-calculator']/child::div/child::p[1]");
	public By carLoanEMI = By.xpath("//p[contains(text(),'Car Loan EMI')]");
	public By simpleInterest = By.xpath("//p[contains(text(),'Simple Interest')]");
	public By compoundInterest = By.xpath("//p[contains(text(),'Compound Interest')]");
	public By NSC = By.xpath("//p[contains(text(),'NSC')]");
	public By setUpSIP = By.xpath("//p[contains(text(),'Step Up SIP')]");
	public By gratuity = By.xpath("//p[contains(text(),'Gratuity')]");
	
	public By APY = By.xpath("//p[contains(text(),'APY')]");
	public By GST = By.xpath("//p[contains(text(),'GST')][1]");
}
