package SourceFile;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Air15_PaymentPageCreditCard {

	@FindBy(xpath = "(//span[@class='colorBase sizeMedium _8d2f006b _79bb5d49'])[1]")
	WebElement Address;

	@FindBy(xpath = "//input[@placeholder='Select Airport']")
	WebElement AInput01;

	@FindBy(xpath = "(//p[@class='c9d6cfb6'])[1]")
	WebElement ASelect;

	@FindBy(xpath = "//input[@placeholder='Select Airport']")
	WebElement ToAddress;

	@FindBy(xpath = "(//div[@class='_32608d65'])[1]")
	WebElement SAddress;

	@FindBy(xpath = "//div[@class='sizeMedium a8cdd5cb']")
	WebElement Traveller;

	@FindBy(xpath = "((//div[@class='ecbd2509 _769d5a4a _6078df67'])[1]/button)[2]")
	WebElement Adult;

	@FindBy(xpath = "(//i[@class='_4b539ab8'])[4]")
	WebElement permium;

	@FindBy(xpath = "//button[@class='_7e41f983 bba41d3c  _50baedd0  ']")
	WebElement Search;

	@FindBy(xpath = "(//button[@class='_7e41f983 bba41d3c  _50baedd0  '])[2]")
	WebElement Book;

	@FindBy(xpath = "//a[.='Proceed to traveller details']")
	WebElement Proceeddetails;

	@FindBy(xpath = "(//div[@id='fl_tr_select'])[1]")
	WebElement TravellerDetails1;

	@FindBy(xpath = "(//div[@id='fl_tr_select'])[2]")
	WebElement TravellerDetails2;

	@FindBy(xpath = "(//div[@id='fl_tr_select'])[3]")
	WebElement TravellerDetails3;

	@FindBy(xpath = "//button[.='Proceed to seat selection']")
	WebElement SeatSelection;

	@FindBy(xpath = "(//div[.='Skip seat selection'])[2]")
	WebElement skipseat;

	@FindBy(xpath = "//i[@class='d726bd8f _4d2636f0']")
	WebElement checkbox;

	@FindBy(xpath = "//button[.='Proceed to Payment']")
	WebElement ProceedPayment;
	
	@FindBy(xpath ="//input[@value='SelectableAddCreditCard']")
	WebElement PaymentMethod;
	
	@FindBy(xpath ="//input[@name='ppw-accountHolderName']")
	WebElement CustomerName;
	
	@FindBy(xpath ="//input[@name='addCreditCardNumber']")
	WebElement CardNumber;
	
	@FindBy(xpath ="(//span[@class='a-button-text a-declarative'])[1]")
	WebElement EMonth;
	
	@FindBy(xpath ="(//ul[@class='a-nostyle a-list-link']/li)[10]")
	WebElement SMonth;
	
	@FindBy(xpath ="(//span[@class='a-button-text a-declarative'])[2]")
	WebElement EYear;
	
	@FindBy(xpath= "((//div[@class='a-popover a-dropdown a-dropdown-common a-declarative'])[2]//li)[2]")
	WebElement SYear;
	
	@FindBy(xpath ="(//span[@class='a-button-inner'])[3]")
	WebElement EnterCarddetails;

	public void AddressClick() {
		Address.click();
	}

	public void AInput01(String Name) {
		AInput01.sendKeys(Name);
	}

	public void ASelect() {
		ASelect.click();
	}

	public void ToAddress(String Name) {
		ToAddress.sendKeys(Name);
	}

	public void SAddress() {
		SAddress.click();
	}

	public void Traveller() {
		Traveller.click();
	}

	public void Adult() {
		Adult.click();
	}

	public void permium() {
		permium.click();
	}

	public void Search() {
		Search.click();
	}

	public void Book() {
		Book.click();
	}

	public void Proceeddetails() {
		Proceeddetails.click();
	}

	public void TravellerDetails1() {
		TravellerDetails1.click();
	}

	public void TravellerDetails2() {
		TravellerDetails2.click();
	}

	public void TravellerDetails3() {
		TravellerDetails3.click();
	}

	public void SeatSelection() {
		SeatSelection.click();
	}

	public void skipseat() {
		skipseat.click();
	}

	public void checkbox() {
		checkbox.click();
	}

	public void ProceedPayment() {
		ProceedPayment.click();
	}
	
	public void PaymentMethod()
	{
		PaymentMethod.click();
	}
	
	public void CustomerName(String Name)
	{
		CustomerName.sendKeys(Name);
	}
	
	public void CardNumber(String CradNumber)
	{
		CardNumber.sendKeys(CradNumber);
	}
	
	public void EMonth()
	{
		EMonth.click();
	}
	
	public void SMonth()
	{
		SMonth.click();
	}
	
	public void EYear()
	{
		EYear.click();
	}
	
	public void SYear()
	{
		SYear.click();
	}
	
	public void EnterCarddetails()
	{
		EnterCarddetails.click();
	}

	public Air15_PaymentPageCreditCard(ChromeDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
