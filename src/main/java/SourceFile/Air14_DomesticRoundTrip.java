package SourceFile;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Air14_DomesticRoundTrip {

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
	
	public void Traveller()
	{
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

	public Air14_DomesticRoundTrip(ChromeDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
