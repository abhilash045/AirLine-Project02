package SourceFile;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Air09_HandleMultpilePassengers {

	@FindBy(xpath = "//div[@class='sizeMedium a8cdd5cb']")
	WebElement Traveller;

	@FindBy(xpath = "((//div[@class='ecbd2509 _769d5a4a _6078df67'])[2]/button)[2]")
	WebElement Children;

	@FindBy(xpath = "//button[@class='_7e41f983 bba41d3c  _50baedd0  ']")
	WebElement Search;

	@FindBy(xpath = "(//button[@class='_7e41f983 bba41d3c  _50baedd0  '])[2]")
	WebElement Book;

	@FindBy(xpath = "//a[.='Proceed to traveller details']")
	WebElement Proceeddetails;

	@FindBy(xpath = "(//div[@class='_7c598c35 colorLink d7c291ce'])[1]")
	WebElement AddNew;

	@FindBy(xpath = "(//button[@class=' _526485ba _7e41f983   cdf8d022 _50baedd0'])[1]")
	WebElement Gender;

	@FindBy(xpath = "(//li[@class=' undefined'])[1]")
	WebElement male;

	@FindBy(xpath = "(//input[@id='input-first_name'])[1]")
	WebElement FirstName;

	@FindBy(xpath = "(//input[@id='input-last_name'])[1]")
	WebElement LastName;

	@FindBy(xpath = "(//button[@class='_7e41f983 bba41d3c    _6c913dd6'])[1]")
	WebElement Submit;

	@FindBy(xpath = "(//div[@class='_7c598c35 colorLink d7c291ce'])[2]")
	WebElement Child;

	@FindBy(xpath = "(//button[@class=' _526485ba _7e41f983   cdf8d022 _50baedd0'])[2]")
	WebElement Gender01;

	@FindBy(xpath = "(//ul[@class='_6878b2d1 ']/li)[2]")
	WebElement Female;

	@FindBy(xpath = "(//input[@class='   undefined'])[3]")
	WebElement FName;

	@FindBy(xpath = "(//input[@class='   undefined'])[4]")
	WebElement LName;

	@FindBy(xpath = "//button[@class='_7e41f983 undefined  _50baedd0  c0de9476']")
	WebElement DOB;

	@FindBy(xpath = "(//span[@class='rc-calendar-my-select']/a)[2]")
	WebElement Year;

	@FindBy(xpath = "(//a[@class='rc-calendar-year-panel-year'])[2]")
	WebElement SelectYear;

	@FindBy(xpath = "(//div[@class='rc-calendar-date'])[20]")
	WebElement SelectDate;

	@FindBy(xpath = "(//button[@class='_7e41f983 bba41d3c    _6c913dd6'])[2]")
	WebElement AddChild;

	public void Traveller() {
		Traveller.click();
	}

	public void Children() {
		Children.click();
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

	public void AddNew() {
		AddNew.click();
	}

	public void Gender() {
		Gender.click();
	}

	public void male() {
		male.click();
	}

	public void FirstName(String Name) {
		FirstName.sendKeys(Name);
	}

	public void LastName(String Name) {
		LastName.sendKeys(Name);
	}

	public void Submit() {
		Submit.click();
	}

	public void Child() {
		Child.click();
	}

	public void Gender01() {
		Gender01.click();
	}

	public void Female() {
		Female.click();
	}

	public void FName(String Name) {
		FName.sendKeys(Name);
	}

	public void LName(String Name) {
		LName.sendKeys(Name);
	}

	public void DOB() {
		DOB.click();
	}

	public void Year() {
		Year.click();
	}

	public void SelectYear() {
		SelectYear.click();
	}

	public void SelectDate() {
		SelectDate.click();
	}

	public void AddChild() {
		AddChild.click();
	}

	public Air09_HandleMultpilePassengers(ChromeDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
