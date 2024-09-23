package SourceFile;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Air05_SearchRoundwayflight {

	@FindBy(xpath = "(//div[@class='dafe1197'])[2]")
	WebElement roundtrip;

	@FindBy(xpath = "(//span[@class='colorBase sizeMedium _8d2f006b _79bb5d49'])[1]")
	WebElement Address;

	@FindBy(xpath = "//input[@placeholder='Select Airport']")
	WebElement AInput01;

	@FindBy(xpath = "(//p[@class='_6f949d1e'])[1]")
	WebElement ASelect;

	@FindBy(xpath = "//input[@placeholder='Select Airport']")
	WebElement ToAddress;

	@FindBy(xpath = "(//div[@class='_32608d65'])[1]")
	WebElement SAddress;

//	@FindBy(xpath = "//div[@class='_898b66e5 _87c3834d']")
//	WebElement NextMonth;

	@FindBy(xpath = "(((//div[@class='_1711da50'])[5]//ul)[5]//li)[5]")
	WebElement DDate;

	@FindBy(xpath = "(((//div[@class='_1711da50'])[5]//ul)[6]//li)[4]")
	WebElement Rdate;

	@FindBy(xpath = "//button[@class='_7e41f983 bba41d3c  _50baedd0  ']")
	WebElement Search;

	public void roundtrip() {
		roundtrip.click();
	}

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

	public void DDate() {
		DDate.click();
	}

	public void Rdate() {
		Rdate.click();
	}

	public void Search() {
		Search.click();
	}

	public Air05_SearchRoundwayflight(ChromeDriver driver) {

		PageFactory.initElements(driver, this);
	}

}
