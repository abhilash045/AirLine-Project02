package SourceFile;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Air13_CoupenCodeAppling {

	@FindBy(xpath = "//button[@class='_7e41f983 bba41d3c  _50baedd0  ']")
	WebElement Search;

	@FindBy(xpath = "(//button[@class='_7e41f983 bba41d3c  _50baedd0  '])[2]")
	WebElement Book;
	
	@FindBy(xpath ="(//button[@class='_7e41f983 undefined  _50baedd0  '])[1]")
	WebElement CoupenApply;

	public void Search() {

		Search.click();

	}

	public void Book() {
		Book.click();
	}
	
	public void CoupenApply()
	{
		CoupenApply.click();
	}

	public Air13_CoupenCodeAppling(ChromeDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
