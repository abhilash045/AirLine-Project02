package TestFile;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import UtilityPackage.Listners;

public class ALTC_LaunchQuit extends Listners {

	@BeforeMethod
	public void ALaunch() {

		/*
		 * ChromeOptions option=new ChromeOptions(); option.addArguments("--headless");
		 * driver= new ChromeDriver(option);
		 */

		driver = new ChromeDriver();

		driver.get("https://www.amazon.in/flights?ref_=nav_em_sbc_desktop_flights_0_1_1_33");

		driver.manage().window().maximize();

	}

	@AfterMethod
	public void AQuit() {

		driver.quit();

	}

}
