package SourceFile;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Air08_SeatSelection {

	@FindBy(xpath = "(//label[@class='_95d8b863 e5eb3311'])[1]")
	WebElement button;

	@FindBy(xpath = "//button[@class='_7e41f983 bba41d3c  _50baedd0  ']")
	WebElement search;

	@FindBy(xpath = "(//button[@class='_7e41f983 bba41d3c  _50baedd0  '])[2]")
	WebElement Book;

	@FindBy(xpath = "//a[.='Proceed to traveller details']")
	WebElement Proceeddetails;

	@FindBy(xpath = "(//i[@class='d726bd8f _4d2636f0'])[1]")
	WebElement Adult01;

	@FindBy(xpath = "(//i[@class='d726bd8f _4d2636f0'])[2]")
	WebElement Adult02;

	@FindBy(xpath = "(//i[@class='d726bd8f _4d2636f0'])[3]")
	WebElement child1;

	@FindBy(xpath = "//button[@class='_7e41f983 bba41d3c  _50baedd0  ada8b185 _6b9247a2']")
	WebElement SeatSelection;

	@FindBy(xpath = "(//div[@class='_0d462540  _20da3076  '])[16]")
	WebElement Seat1;

	@FindBy(xpath = "(//div[@class='_0d462540  _20da3076  '])[17]")
	WebElement Seat2;

	@FindBy(xpath = "(//div[@class='_0d462540  _20da3076  '])[18]")
	WebElement Seat3;
	
	@FindBy(xpath ="//*[@id=\"root\"]/div[3]/div/div[2]/div/div[2]/button")
	WebElement Next;

	public void button() {
		button.click();
	}

	public void search() {
		search.click();
	}

	public void Book() {
		Book.click();
	}

	public void Proceeddetails() {
		Proceeddetails.click();
	}

	public void Adult01() {
		Adult01.click();
	}

	public void Adult02() {
		Adult02.click();
	}

	public void child1() {
		child1.click();
	}

	public void SeatSelection() {
		SeatSelection.click();
	}

	public void Seat1() {
		Seat1.click();
	}

	public void Seat2() {
		Seat2.click();
	}

	public void Seat3() {
		Seat3.click();
	}
	
	public void Next()
	{
		Next.click();
	}

	public Air08_SeatSelection(ChromeDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
