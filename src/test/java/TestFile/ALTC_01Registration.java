package TestFile;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import SourceFile.Air01_HomeRegistration;

@Listeners(UtilityPackage.Listners.class)

public class ALTC_01Registration extends ALTC_AmazonHome {

	@Test(retryAnalyzer=UtilityPackage.Retry.class)
	public void ALTC_01Registration() throws InterruptedException {

		Air01_HomeRegistration h1 = new Air01_HomeRegistration(driver);
		Thread.sleep(3000);
		h1.accountList(driver);
		h1.startHere();
		h1.name("Abhilash");
		Thread.sleep(2000);
		h1.email("abhilash.avr5@gmail.com");
		Thread.sleep(2000);
		h1.password("Abhilash1432");
		Thread.sleep(2000);

	}

}
