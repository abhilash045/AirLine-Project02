package SourceFile;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Air10_FightInformationBaggageRules {

	@FindBy(xpath = "//button[@class='_7e41f983 bba41d3c  _50baedd0  ']")
	WebElement Search;

	@FindBy(xpath = "(//button[@class='_7e41f983 bba41d3c  _50baedd0  '])[2]")
	WebElement Book;

	@FindBy(xpath = "//div[@class='_7c598c35 ']")
	WebElement ViewBaggage;

	@FindBy(xpath = "(//div[@class='tabListInner'])[2]")
	WebElement Cancellation;

	@FindBy(xpath = "(//div[@class='tabListInner'])[3]")
	WebElement Dates;
	
	
	@FindBy(xpath = "(//div[@class='tabListInner'])[1]")
	WebElement traveller;
	
	@FindBy(xpath ="//div[@class='_7c598c35 a69d62e8']")
	WebElement ViewFareDetails;

	public void Search() {
		Search.click();
	}

	public void Book() {
		Book.click();
	}

	public void ViewBaggage() {
		ViewBaggage.click();
	}

	public void Cancellation() {
		Cancellation.click();
	}

	public void Dates() {
		Dates.click();
	}
	
	public void traveller()
	{
		traveller.click();
	}
	
	public void ViewFareDetails()
	{
		ViewFareDetails.click();
	}

	public Air10_FightInformationBaggageRules(ChromeDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
