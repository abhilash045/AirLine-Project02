package SourceFile;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Air11_ValidatingSearchFillDetails {

	@FindBy(xpath = "//button[@class='_7e41f983 bba41d3c  _50baedd0  ']")
	WebElement search;

	@FindBy(xpath = "(//button[@class='_7e41f983 bba41d3c  _50baedd0  '])[2]")
	WebElement Book;

	@FindBy(xpath = "//a[.='Proceed to traveller details']")
	WebElement Proceeddetails;

	@FindBy(xpath = "(//div[@class='_7c598c35 colorLink d7c291ce'])[1]")
	WebElement AddNew;

//	@FindBy(xpath = "(//button[@class='_7e41f983 bba41d3c    _6c913dd6'])[2]")
//	WebElement AddChild;

//	@FindBy(xpath = "//input[@id='input-mobile']")
//	WebElement MobileInput;
//
	public void Search() {
		search.click();
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
//
//	public void Gender() {
//		boolean Enabled =Gender.isEnabled();
//	   if(Enabled)
//	   {
//		 System.out.println("Gender is enabled");
//	   }else {
//		   System.out.println("Gender is Disabled");
//	   }
//	}
//
//	public void male() {
//		male.click();
//	}
//
//	public void FirstName(String Name) {
//		FirstName.sendKeys(Name);
//	}
//
//	public void LastName(String Name) {
//		LastName.sendKeys(Name);
//	}
//
//	public void Submit() {
//		Submit.click();
//	}
//
//	public void Child() {
//		Child.click();
//	}
//
//	public void Gender01() {
//		Gender01.click();
//	}
//
//	public void Female() {
//		Female.click();
//	}
//
//	public void FName(String Name) {
//		FName.sendKeys(Name);
//	}
//
//	public void LName(String Name) {
//		LName.sendKeys(Name);
//	}
//
//	public void DOB() {
//		DOB.click();
//	}
//
//	public void Year() {
//		Year.click();
//	}
//
//	public void SelectYear() {
//		SelectYear.click();
//	}
//
//	public void SelectDate() {
//		SelectDate.click();
//	}
//
//	public void AddChild() {
//		AddChild.click();
//	}
//
//	public void MobileInput(String Number) {
//		MobileInput.sendKeys(Number);
//	}

	public Air11_ValidatingSearchFillDetails(ChromeDriver driver) {

		PageFactory.initElements(driver, this);

	}

}
