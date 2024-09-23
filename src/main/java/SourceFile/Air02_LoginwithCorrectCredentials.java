package SourceFile;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilityPackage.DataDrivenTesting;

public class Air02_LoginwithCorrectCredentials extends DataDrivenTesting {

	@FindBy(xpath = "//input[@class='a-input-text a-span12 auth-autofocus auth-required-field auth-require-claim-validation']")
	WebElement Elogin;

	@FindBy(xpath = "//input[@id='continue']")
	WebElement Continue;

	@FindBy(xpath = "//input[@id='ap_password']")
	WebElement password;

	@FindBy(xpath = "//input[@id='signInSubmit']")
	WebElement signin;

	public void Email() {
		Elogin.sendKeys(un);
	}

	public void Email1() {
		Elogin.sendKeys(un1);
	}

	public void Continue() {
		Continue.click();
	}

	public void password() {
		password.sendKeys(pswd);
	}

	public void password1() {
		password.sendKeys(pswd2);
	}

	public void signin() {
		signin.click();
	}

	public Air02_LoginwithCorrectCredentials(ChromeDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
