package TestFile;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import UtilityPackage.Listners;

@Listeners(UtilityPackage.Listners.class)

public class ALTC_AmazonHome extends Listners {

	@BeforeMethod
	public void login() {

		driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void Quit() {
		driver.quit();
	}

}
