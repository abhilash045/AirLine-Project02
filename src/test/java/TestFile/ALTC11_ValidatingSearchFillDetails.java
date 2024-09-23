package TestFile;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import SourceFile.Air02_LoginwithCorrectCredentials;
import SourceFile.Air11_ValidatingSearchFillDetails;
import UtilityPackage.DataDrivenTesting;

@Listeners(UtilityPackage.Listners.class)

public class ALTC11_ValidatingSearchFillDetails extends ALTC_LaunchQuit {

	@Test(retryAnalyzer=UtilityPackage.Retry.class)
	public void CustomerDetails() throws EncryptedDocumentException, IOException, InterruptedException {

		DataDrivenTesting D1 = new DataDrivenTesting();
		D1.DDT_01();

		Air02_LoginwithCorrectCredentials a1 = new Air02_LoginwithCorrectCredentials(driver);

		a1.Email();
		a1.Continue();
		a1.password();
		Thread.sleep(4000);
		a1.signin();

		Air11_ValidatingSearchFillDetails a2 = new Air11_ValidatingSearchFillDetails(driver);

		Thread.sleep(4000);
		a2.Search();
		Thread.sleep(8000);
		a2.Book();
		Thread.sleep(15000);
		a2.Proceeddetails();
		Thread.sleep(5000);

		WebElement AddNewAdult = driver.findElement(By.xpath("(//div[@class='_7c598c35 colorLink d7c291ce'])[1]"));
		boolean a3 = AddNewAdult.isEnabled();

		if (a3) {
			System.out.println("Addnew Adult is Enabled");
		} else {
			System.out.println("Addnew is not Enabled");
		}
		Thread.sleep(2000);
		a2.AddNew();

		WebElement GenderButton = driver.findElement(By.xpath("//div[@class='edb7cb84']"));
		boolean GButton = GenderButton.isEnabled();
		if (GButton) {
			System.out.println("GButton is Enabled");
		} else {
			System.out.println("GButton is not Enabled");
		}
		GenderButton.click();
		Thread.sleep(4000);

		WebElement FirstName = driver.findElement(By.xpath("(//input[@id='input-first_name'])[1]"));
		boolean FName = FirstName.isEnabled();
		if (FName) {
			System.out.println("FName is Enable");
		} else {
			System.out.println("FName is not Enabled");
		}
		FirstName.sendKeys("Abhilash");
		Thread.sleep(4000);

		WebElement LastName = driver.findElement(By.xpath("(//input[@id='input-last_name'])[1]"));
		boolean LName = LastName.isEnabled();
		if (LName) {
			System.out.println("LastName is Enable");

		} else {
			System.out.println("LastName is not Enabled");
		}
		LastName.sendKeys("Pasikanti");
		Thread.sleep(4000);

		WebElement AddAdult = driver.findElement(By.xpath("(//button[@class='_7e41f983 bba41d3c    _6c913dd6'])[1]"));
		boolean AAdult = AddAdult.isEnabled();
		if (AAdult) {
			System.out.println("AddAdult is Enable");
		} else {
			System.out.println("AddAdult is not Enabled");  //-->  ")
		}
		
		WebElement AddChild = driver.findElement(By.xpath("(//div[@class='_7c598c35 colorLink d7c291ce'])[2]"));
		boolean AChild = AddChild.isEnabled();
		if (AChild) {
			System.out.println("AddChild is Enable");

		} else {
			System.out.println("AddChild is not Enabled");
		}
		AddChild.click();  
		Thread.sleep(4000);
		
		WebElement ChildGender = driver.findElement(By.xpath("(//button[@class=' _526485ba _7e41f983   cdf8d022 _50baedd0'])[2]"));
		boolean ChildGenders = ChildGender.isEnabled();
		if (ChildGenders) {
			System.out.println("ChildGenders is Enable");

		} else {
			System.out.println("ChildGenders is not Enabled");
		}
		ChildGender.click();
		Thread.sleep(4000);
		
		WebElement ChildFirstName = driver.findElement(By.xpath("(//input[@class='   undefined'])[3]"));
		boolean ChildFName = ChildFirstName.isEnabled();
		if (ChildFName) {
			System.out.println("ChildFirstName is Enable");
		} else {
			System.out.println("ChildFirstName is not Enabled");
		}
		ChildFirstName.sendKeys("Sweety");
		Thread.sleep(4000);
		
		WebElement ChildLastName = driver.findElement(By.xpath("(//input[@class='   undefined'])[4]"));
		boolean LastCFName = ChildLastName.isEnabled();
		if (ChildFName) {
			System.out.println("ChildLastName is Enable");
		} else {
			System.out.println("ChildLastName is not Enabled");
		}
		ChildLastName.sendKeys("papa"); 
		Thread.sleep(4000);
		
		WebElement Calendar = driver.findElement(By.xpath("//button[@class='_7e41f983 undefined  _50baedd0  c0de9476']"));
		boolean CalendarDates = Calendar.isEnabled();
		if (CalendarDates) {
			System.out.println("Calendar is Enable");

		} else {
			System.out.println("Calendar is not Enabled");
		}
		Calendar.click();
		

	}

}
