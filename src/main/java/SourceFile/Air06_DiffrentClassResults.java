package SourceFile;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Air06_DiffrentClassResults {

	@FindBy(xpath = "//div[@class='sizeMedium a8cdd5cb']")
	WebElement Traveller;

	@FindBy(xpath = "((//div[@class='ecbd2509 _769d5a4a _6078df67'])[1]/button)[2]")
	WebElement Adult;

	@FindBy(xpath = "((//div[@class='ecbd2509 _769d5a4a _6078df67'])[2]/button)[1]")
	WebElement Children;

	@FindBy(xpath = "((//div[@class='ecbd2509 _769d5a4a _6078df67'])[3]/button)[1]")
	WebElement Infants;

	@FindBy(xpath = "(//i[@class='_4b539ab8'])[4]")
	WebElement permium;
	
	@FindBy(xpath ="//button[@class='_7e41f983 bba41d3c  _50baedd0  ']")
	WebElement search;

	public void Traveller() {
		Traveller.click();
	}

	public void Adult() {
		Adult.click();
	}

	public void Children() {
		Children.click();
	}

	public void Infants() {
		Infants.click();
	}

	public void permium() {
		permium.click();
	}
	
	public void search()
	{
		search.click();
	}

	public Air06_DiffrentClassResults(ChromeDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
