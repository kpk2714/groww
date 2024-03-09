package groww.runner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import groww.pageobject.AMCMutualFundPageObject;
import groww.pageobject.APYCalculatorPageObject;
import groww.pageobject.BajajFinservMutualFundPageObject;
import groww.pageobject.CalculatorPageObject;
import groww.pageobject.CarLoanEMICalculatorPageObject;
import groww.pageobject.CompoundInterestCalculatorPageObject;
import groww.pageobject.EMICalculatorPageObject;
import groww.pageobject.EPFCalculatorPageObject;
import groww.pageobject.FDCalculatorPageObject;
import groww.pageobject.GSTCalculatorPageObject;
import groww.pageobject.GratuityCalculatorPageObject;
import groww.pageobject.HomeLoanEMICalculatorPageObject;
import groww.pageobject.HomePageObject;
import groww.pageobject.ITIMutualFundPageObject;
import groww.pageobject.LumpsumCalculatorPageObject;
import groww.pageobject.MFCalculatorPageObject;
import groww.pageobject.MahindraManulifeMutualFundPageObject;
import groww.pageobject.NJMutualFundPageObject;
import groww.pageobject.NPSCalculatorPageObject;
import groww.pageobject.NSCCalculatorPageObject;
import groww.pageobject.PPFCalculatorPageObject;
import groww.pageobject.RDCalculatorPageObject;
import groww.pageobject.SIPCalculatorPageObject;
import groww.pageobject.SSYCalculatorPageObject;
import groww.pageobject.SWPCalculatorPageObject;
import groww.pageobject.SamcoMutualFundPageObject;
import groww.pageobject.SetUpSIPCalculatorPageObject;
import groww.pageobject.SimpleInterestCalculatorPageObject;
import groww.pageobject.StockSearchPageObject;
import groww.pageobject.TrustMutualFundPageObject;
import groww.pageobject.WhiteOakMutualFundPageObject;
import groww.utilities.Base;
import groww.utilities.Reporter;


public class RunTest {

	WebDriver driver;
	Base base = new Base();
	ExtentReports reports;
	ExtentTest test;
	HomePageObject homepageObject = new HomePageObject();
	StockSearchPageObject stocksearchpageObject = new StockSearchPageObject();
	CalculatorPageObject calculatorpageobject = new CalculatorPageObject();
	HomeLoanEMICalculatorPageObject homeloanemicalculatorpageObject = new HomeLoanEMICalculatorPageObject();
	SIPCalculatorPageObject sipcalculatorpageobject = new SIPCalculatorPageObject();
	LumpsumCalculatorPageObject lumpsumcalculatorpageobject = new LumpsumCalculatorPageObject();
	SWPCalculatorPageObject swpcalculatorpageobject = new SWPCalculatorPageObject();
	MFCalculatorPageObject mfcalculatorpageobject = new MFCalculatorPageObject();
	SSYCalculatorPageObject ssycalculatorpageobject = new SSYCalculatorPageObject();
	PPFCalculatorPageObject ppfcalculatorpageobject = new PPFCalculatorPageObject();
	EPFCalculatorPageObject epfcalculatorpageobject = new EPFCalculatorPageObject();
	FDCalculatorPageObject fdcalculatorpageobject = new FDCalculatorPageObject();
	RDCalculatorPageObject rdcalculatorpageobject = new RDCalculatorPageObject();
	NPSCalculatorPageObject npscalculatorpageobject = new NPSCalculatorPageObject();
	EMICalculatorPageObject emicalculatorpageobject = new EMICalculatorPageObject();
	CarLoanEMICalculatorPageObject carLoanEMICalculatorPageObject = new CarLoanEMICalculatorPageObject();
	SimpleInterestCalculatorPageObject simpleInterestCalculatorPageObject = new SimpleInterestCalculatorPageObject();
	CompoundInterestCalculatorPageObject compoundInterestCalculatorPageObject = new CompoundInterestCalculatorPageObject();
	NSCCalculatorPageObject nscCalculatorPageObject = new NSCCalculatorPageObject();
	SetUpSIPCalculatorPageObject setUpSIPCalculatorPageObject = new SetUpSIPCalculatorPageObject();
	GratuityCalculatorPageObject gratuityCalculatorPageObject = new GratuityCalculatorPageObject();
	APYCalculatorPageObject apyCalculatorPageObject = new APYCalculatorPageObject();
	GSTCalculatorPageObject gstCalculatorPageObject = new GSTCalculatorPageObject();
	AMCMutualFundPageObject amcMutualFundPageObject = new AMCMutualFundPageObject();
	BajajFinservMutualFundPageObject bajajFinservMutualFundPageObject = new BajajFinservMutualFundPageObject();
	WhiteOakMutualFundPageObject whiteOakMutualFundPageObject = new WhiteOakMutualFundPageObject();
	ITIMutualFundPageObject itiMutualFundPageObject = new ITIMutualFundPageObject();
	TrustMutualFundPageObject trustMutualFundPageObject = new TrustMutualFundPageObject();
	NJMutualFundPageObject njMutualFundPageObject = new NJMutualFundPageObject();
	SamcoMutualFundPageObject samcoMutualFundPageObject = new SamcoMutualFundPageObject();
	MahindraManulifeMutualFundPageObject mahindraManulifeMutualFundPageObject = new MahindraManulifeMutualFundPageObject();
	
	static int i = 1;
	static String testcaseName = "Verify Stock Name";
	
	@BeforeTest
	public void createReport() {
		reports = Reporter.getReport("groww");
	}
	
	@Parameters("browserName")
	@BeforeMethod
	public void openbrowser(String browserName) {
		test = reports.createTest("Test Cases "+i+" - "+testcaseName);
		i++;
		
		driver = base.openBrowser(browserName,test);
	}
	
	
	@Test(priority = 1,enabled = true)
	public void testcaseone() {
		homepageObject.clickOnSearchBox(driver,test);
		homepageObject.enterDataOnSearchBox(driver,test);
		homepageObject.clickOnSearchItem(driver,test);
		stocksearchpageObject.verifyStockName(driver, test);
		
		testcaseName = "Calculate Home Loan EMI";
	}
	
	@Test(priority = 2 , enabled = true)
	public void testcasetwo() {
		homepageObject.clickOnCalculators(driver, test);
		calculatorpageobject.clickOnHomeLoanEMI(driver, test);
		homeloanemicalculatorpageObject.enterLoanAmount(driver, test);
		homeloanemicalculatorpageObject.enterInterestRate(driver, test);
		homeloanemicalculatorpageObject.enterLoanYear(driver, test);
		homeloanemicalculatorpageObject.displayMonthlyEMI(driver, test);
		homeloanemicalculatorpageObject.displayPrincipalAmount(driver, test);
		homeloanemicalculatorpageObject.displayTotalInterest(driver, test);
		homeloanemicalculatorpageObject.displayTotalAmount(driver, test);
		
		testcaseName = "Calculate SIP using Sikuli";
	}
	
	@Test(priority = 3 , enabled = true)
	public void testcasethree() {
		homepageObject.clickOnCalculators(driver, test);
		calculatorpageobject.clickOnSIP(driver,test);
		sipcalculatorpageobject.enterMonthlyInvestment(driver,test);
		sipcalculatorpageobject.enterReturnRate(driver,test);
		sipcalculatorpageobject.enterTimePeriod(driver,test);
		sipcalculatorpageobject.displayInvestedAmount(driver,test);
		sipcalculatorpageobject.displayReturnAmount(driver,test);
		sipcalculatorpageobject.displayTotalAmount(driver,test);
		
		testcaseName = "Calculate Lumpsum";
	}
	
	@Test(priority = 4, enabled = true)
	public void testcasefour() {
		homepageObject.clickOnCalculators(driver, test);
		calculatorpageobject.clickOnLumpsum(driver, test);
		lumpsumcalculatorpageobject.enterTotalInvestment(driver , test);
		lumpsumcalculatorpageobject.enterReturnRate(driver , test);
		lumpsumcalculatorpageobject.enterTimePeriod(driver , test);
		lumpsumcalculatorpageobject.displayInvestedAmount(driver , test);
		lumpsumcalculatorpageobject.displayReturnAmount(driver , test);
		lumpsumcalculatorpageobject.displayTotalAmount(driver , test);
		
		testcaseName = "Calculate SWP(Systematic Withdrawl Plans)";
	}
	
	@Test(priority = 5 , enabled = true)
	public void testcasefive() {
		homepageObject.clickOnCalculators(driver, test);
		calculatorpageobject.clickOnSWP(driver, test);
		swpcalculatorpageobject.enterTotalInvestment(driver,test);
		swpcalculatorpageobject.enterWithdrawlPerMonth(driver,test);
		swpcalculatorpageobject.enterReturnRate(driver,test);
		swpcalculatorpageobject.enterTimePeriod(driver,test);
		swpcalculatorpageobject.displayTotalInvestment(driver, test);
		swpcalculatorpageobject.displayTotalWithdrawl(driver, test);
		swpcalculatorpageobject.displayFinalValue(driver, test);
		
		testcaseName = "Calculate MF(Mutual Fund)";
	}
	
	@Test(priority = 6 , enabled = true)
	public void testcasesix() {
		homepageObject.clickOnCalculators(driver, test);
		calculatorpageobject.clickOnMF(driver, test);
		mfcalculatorpageobject.enterTotalInvestment(driver, test);
		mfcalculatorpageobject.enterReturnRate(driver, test);
		mfcalculatorpageobject.enterTimePeriod(driver, test);
		mfcalculatorpageobject.displayInvestedAmount(driver, test);
		mfcalculatorpageobject.displayEstimateReturn(driver, test);
		mfcalculatorpageobject.displayTotalValue(driver, test);
		
		testcaseName = "Calculate SSY(Sukanya Samriddhi Yojana)";
	}
	
	@Test(priority = 7 , enabled = true)
	public void testcaseseven() {
		homepageObject.clickOnCalculators(driver, test);
		calculatorpageobject.clickOnSSY(driver, test);
		ssycalculatorpageobject.enterYearlyInvestment(driver, test);
		ssycalculatorpageobject.enterGirlAge(driver, test);
		ssycalculatorpageobject.enterStartPeriod(driver, test);
		ssycalculatorpageobject.displayTotalInvestment(driver, test);
		ssycalculatorpageobject.displayTotalInterest(driver, test);
		ssycalculatorpageobject.displayMaturityYear(driver, test);
		ssycalculatorpageobject.displayMaturityValue(driver, test);
		
		testcaseName = "Calculate PPF(Public Provident Fund)";
	}
	
	@Test(priority = 8 , enabled = true)
	public void testcaseeight() {
		homepageObject.clickOnCalculators(driver, test);
		calculatorpageobject.clickOnPPF(driver, test);
		ppfcalculatorpageobject.enterYearlyInvestment(driver, test);
		ppfcalculatorpageobject.enterTimePeriod(driver, test);
		ppfcalculatorpageobject.displayInvestedAmount(driver, test);
		ppfcalculatorpageobject.displayTotalInterest(driver, test);
		ppfcalculatorpageobject.displayMaturityValue(driver, test);
		
		testcaseName = "Calculate EPF(Employee's Provident Fund) - Sliding Age Data";
	}
	
	@Test(priority = 9 , enabled = true)
	public void testcasenine() {
		homepageObject.clickOnCalculators(driver, test);
		calculatorpageobject.clickOnEPF(driver, test);
		epfcalculatorpageobject.enterMonthlySalary(driver, test);
		epfcalculatorpageobject.enterAge(driver, test);
		epfcalculatorpageobject.enterContribution(driver, test);
		epfcalculatorpageobject.enterAnnualIncrease(driver, test);
		epfcalculatorpageobject.displayRetiredAmount(driver, test);
		
		testcaseName = "Calculate FD(Fixed Deposit)";
	}
	
	@Test(priority = 10 , enabled = true)
	public void testcaseten() {
		homepageObject.clickOnCalculators(driver, test);
		calculatorpageobject.clickOnFD(driver, test);
		fdcalculatorpageobject.enterTotalInvestment(driver, test);
		fdcalculatorpageobject.enterInterestRate(driver, test);
		fdcalculatorpageobject.enterTimePeriod(driver, test);
		fdcalculatorpageobject.displayInvestedAmount(driver, test);
		fdcalculatorpageobject.displayReturnAmount(driver, test);
		fdcalculatorpageobject.displayTotalValue(driver, test);
		
		testcaseName = "Calculate RD(Recurring Deposit)";
	}
	
	@Test(priority = 11 , enabled = true)
	public void testcaseeleven() {
		homepageObject.clickOnCalculators(driver, test);
		calculatorpageobject.clickOnRD(driver, test);
		rdcalculatorpageobject.enterMonthlyInvestment(driver, test);
		rdcalculatorpageobject.enterInterestRate(driver, test);
		rdcalculatorpageobject.enterTimePeriod(driver, test);
		rdcalculatorpageobject.displayInvestedAmount(driver, test);
		rdcalculatorpageobject.displayReturnAmount(driver, test);
		rdcalculatorpageobject.displayTotalValue(driver, test);
		
		testcaseName = "Calculate NPS(National Pension Scheme) - Sliding Age data";
	}
	
	@Test(priority = 12 , enabled = true)
	public void testcasetwelve() {
		homepageObject.clickOnCalculators(driver, test);
		calculatorpageobject.clickOnNPS(driver, test);
		npscalculatorpageobject.enterMonthlyInvestment(driver, test);
		npscalculatorpageobject.enterInterestRate(driver, test);
		npscalculatorpageobject.enterAge(driver, test);
		npscalculatorpageobject.displayTotalInvestment(driver, test);
		npscalculatorpageobject.displayTotalInterestAmount(driver, test);
		npscalculatorpageobject.displayMaturityAmount(driver, test);
		npscalculatorpageobject.displayMinAnnuityInvestment(driver, test);
		
		testcaseName = "Calculate EMI";
	}
	
	@Test(priority = 15 , enabled = true)
	public void testcasefifteen() {
		homepageObject.clickOnCalculators(driver, test);
		calculatorpageobject.clickOnEMI(driver, test);
		emicalculatorpageobject.enterLoanAmount(driver, test);
		emicalculatorpageobject.enterInterestRate(driver, test);
		emicalculatorpageobject.enterLoanTenure(driver, test);
		emicalculatorpageobject.displayMonthlyEMI(driver, test);
		emicalculatorpageobject.displayPrincipalAmount(driver, test);
		emicalculatorpageobject.displayTotalInterest(driver, test);
		emicalculatorpageobject.displayTotalAmount(driver, test);
		
		testcaseName = "Calculate Car Loan EMI";
	}
	
	@Test(priority = 16 , enabled = true)
	public void testcasesixteen() {
		homepageObject.clickOnCalculators(driver, test);
		calculatorpageobject.clickOnCarLoanEMI(driver, test);
		carLoanEMICalculatorPageObject.enterLoanAmount(driver, test);
		carLoanEMICalculatorPageObject.enterInterestRate(driver, test);
		carLoanEMICalculatorPageObject.enterLoanTenure(driver, test);
		carLoanEMICalculatorPageObject.displayMonthlyEMI(driver, test);
		carLoanEMICalculatorPageObject.displayPrincipalAmount(driver, test);
		carLoanEMICalculatorPageObject.displayTotalInterest(driver, test);
		carLoanEMICalculatorPageObject.displayTotalAmount(driver, test);
		
		testcaseName = "Calculate Simple Interest";
	}
	
	@Test(priority = 17 , enabled = true)
	public void testcaseseventeen() {
		homepageObject.clickOnCalculators(driver, test);
		calculatorpageobject.clickOnSimpleInterest(driver, test);
		simpleInterestCalculatorPageObject.enterPrincipleAmount(driver, test);
		simpleInterestCalculatorPageObject.enterInterestRate(driver, test);
		simpleInterestCalculatorPageObject.enterTimePeriod(driver, test);
		simpleInterestCalculatorPageObject.displayPrincipleAmount(driver, test);
		simpleInterestCalculatorPageObject.displayTotalInterest(driver, test);
		simpleInterestCalculatorPageObject.displayTotalAmount(driver, test);
		
		testcaseName = "Calculate Compound Interest";
	}
	
	@Test(priority = 18 , enabled = true)
	public void testcaseeightteen() {
		homepageObject.clickOnCalculators(driver, test);
		calculatorpageobject.clickOnCompoundInterest(driver, test);
		compoundInterestCalculatorPageObject.enterPrincipleAmount(driver, test);
		compoundInterestCalculatorPageObject.enterInterestRate(driver, test);
		compoundInterestCalculatorPageObject.enterTimePeriod(driver, test);
		compoundInterestCalculatorPageObject.chooseFrequency(driver, test);
		compoundInterestCalculatorPageObject.displayPrincipleAmount(driver, test);
		compoundInterestCalculatorPageObject.displayTotalInterest(driver, test);
		compoundInterestCalculatorPageObject.displayTotalAmount(driver, test);
		
		testcaseName = "Calculate return under National Saving Certificate";
	}
	
	@Test(priority = 19 , enabled = true)
	public void testcasenineteen() {
		homepageObject.clickOnCalculators(driver, test);
		calculatorpageobject.clickOnNSC(driver, test);
		nscCalculatorPageObject.enterInvestedAmount(driver, test);
		nscCalculatorPageObject.enterInterestRate(driver, test);
		nscCalculatorPageObject.chooseFrequency(driver, test);
		nscCalculatorPageObject.displayPrincipleAmount(driver, test);
		nscCalculatorPageObject.displayTotalInterest(driver, test);
		nscCalculatorPageObject.displayTotalAmount(driver, test);
		
		testcaseName = "Calculate SIP returns with an yearly rise";
	}
	
	@Test(priority = 20 , enabled = true)
	public void testcasetwenty() {
		homepageObject.clickOnCalculators(driver, test);
		calculatorpageobject.clickOnSetUpSIP(driver, test);
		setUpSIPCalculatorPageObject.enterMonthlyInvestment(driver, test);
		setUpSIPCalculatorPageObject.enterAnnualSetUpRate(driver, test);
		setUpSIPCalculatorPageObject.enterReturnRate(driver, test);
		setUpSIPCalculatorPageObject.enterTimePeriod(driver, test);
		setUpSIPCalculatorPageObject.displayInvestedAmount(driver, test);
		setUpSIPCalculatorPageObject.displayEstimateReturn(driver, test);
		setUpSIPCalculatorPageObject.displayTotalValue(driver, test);
		
		testcaseName = "Calculate Gratuity - Sliding Year of Service";
	}
	
	@Test(priority = 21 , enabled = true)
	public void testcasetwentyone() {
		homepageObject.clickOnCalculators(driver, test);
		calculatorpageobject.clickOnGratuity(driver, test);
		gratuityCalculatorPageObject.enterMonthlySalary(driver, test);
		gratuityCalculatorPageObject.enterYearofService(driver, test);
		gratuityCalculatorPageObject.displayGratuityAmount(driver, test);
		
		testcaseName = "Calculate APY - Atal Pension Yojana - Using Sliding";
	}
	
	@Test(priority = 22 , enabled = true)
	public void testcasetwentytwo() {
		homepageObject.clickOnCalculators(driver, test);
		calculatorpageobject.clickOnAPY(driver, test);
		apyCalculatorPageObject.enterAge(driver, test);
		apyCalculatorPageObject.enterPension(driver, test);
		apyCalculatorPageObject.displayMonthlyInvestment(driver, test);
		apyCalculatorPageObject.displayInvestmentDuration(driver, test);
		apyCalculatorPageObject.displayTotalAmount(driver, test);
		
		testcaseName = "Calculate GST - Using Sliding";
	}
	
	@Test(priority = 23 , enabled = true)
	public void testcasetwentythree() {
		homepageObject.clickOnCalculators(driver, test);
		calculatorpageobject.clickOnGST(driver, test);
		gstCalculatorPageObject.chooseTotalAmount(driver, test);
		gstCalculatorPageObject.chooseTaxSlab(driver, test);
		gstCalculatorPageObject.displayGSTAmount(driver, test);
		gstCalculatorPageObject.displayPostGSTAmount(driver, test);
		
		testcaseName = "Find Total Number of Bajaj Finserv Mutual Funds";
	}
	
	@Test(priority = 24 , enabled = true)
	public void testcasetwentyfour() {
		homepageObject.clickOnAmcMutualFund(driver, test);
		amcMutualFundPageObject.clickOnBajajFinance(driver, test);
		bajajFinservMutualFundPageObject.clickOnViewAll(driver, test);
		bajajFinservMutualFundPageObject.displayTotalNumberOfMutualFunds(driver, test);
		
		testcaseName = "Find Total Number of WhitOak Capital Mutual Funds";
	}
	
	@Test(priority = 25 , enabled = true)
	public void testcasetwentyfive() {
		homepageObject.clickOnAmcMutualFund(driver, test);
		amcMutualFundPageObject.clickOnWhiteOak(driver, test);
		whiteOakMutualFundPageObject.clickOnViewAll(driver, test);
		whiteOakMutualFundPageObject.displayTotalNumberOfMutualFunds(driver, test);
		
		testcaseName = "Find Total Number of ITI Mutual Funds";
	}
	
	@Test(priority = 26 , enabled = true)
	public void testcasetwentysix() {
		homepageObject.clickOnAmcMutualFund(driver, test);
		amcMutualFundPageObject.clickOnItiMutualFund(driver, test);
		itiMutualFundPageObject.clickOnViewAll(driver, test);
		itiMutualFundPageObject.displayTotalNumberOfMutualFunds(driver, test);
		
		testcaseName = "Find Total Number of Trust Mutual Funds";
	}
	
	@Test(priority = 27 , enabled = true)
	public void testcasetwentyseven() {
		homepageObject.clickOnAmcMutualFund(driver, test);
		amcMutualFundPageObject.clickOnTrustMutualFund(driver, test);
		trustMutualFundPageObject.clickOnViewAll(driver, test);
		trustMutualFundPageObject.displayTotalNumberOfMutualFunds(driver, test);
		
		testcaseName = "Find Total Number of NJ Mutual Funds";
	}
	
	@Test(priority = 28 , enabled = true)
	public void testcasetwentyeight() {
		homepageObject.clickOnAmcMutualFund(driver, test);
		amcMutualFundPageObject.clickOnNJMutualFund(driver, test);
		njMutualFundPageObject.clickOnViewAll(driver, test);
		njMutualFundPageObject.displayTotalNumberOfMutualFunds(driver, test);
		
		testcaseName = "Find Total Number of Samco Mutual Funds";
	}
	
	@Test(priority = 29 , enabled = true)
	public void testcasetwentynine() {
		homepageObject.clickOnAmcMutualFund(driver, test);
		amcMutualFundPageObject.clickOnSamcoMutualFund(driver, test);
		samcoMutualFundPageObject.clickOnViewAll(driver, test);
		samcoMutualFundPageObject.displayTotalNumberOfMutualFunds(driver, test);
	}
	
	@Test(priority = 30 , enabled = true)
	public void testcasethirty() {
		homepageObject.clickOnAmcMutualFund(driver, test);
		amcMutualFundPageObject.clickOnMahindraMutualFund(driver, test);
		mahindraManulifeMutualFundPageObject.clickOnViewAll(driver, test);
		mahindraManulifeMutualFundPageObject.displayTotalNumberOfMutualFunds(driver, test);
	}
	
	@AfterMethod
	public void exit() {
		driver.quit();
	}
	
	@AfterTest
	public void generateReport() {
		reports.flush();
	}
}
