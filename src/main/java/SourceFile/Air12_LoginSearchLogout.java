package SourceFile;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Air12_LoginSearchLogout {

	@FindBy(xpath = "//button[@class='_7e41f983 bba41d3c  _50baedd0  ']")
	WebElement Search;

	@FindBy(xpath = "(//button[@class='_7e41f983 bba41d3c  _50baedd0  '])[2]")
	WebElement Book;

	@FindBy(xpath = "//a[@class='nav-a nav-a-2 nav-truncate   nav-progressive-attribute']")
	WebElement AccountList;
	
	@FindBy(xpath ="//span[.='Sign Out']")
	WebElement SignOut;
	
	public void Search()
	{
		Search.click();
	}
	
	public void Book()
	{
		Book.click();
	}
	
	public void SignOut()
	{
		SignOut.click();
	}
	
	public void AccountList(ChromeDriver driver)
	{
		Actions a1 = new Actions(driver);
		a1.moveToElement(AccountList).perform();
	}

	public Air12_LoginSearchLogout(ChromeDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
