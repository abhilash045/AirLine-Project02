package TestFile;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import SourceFile.Air02_LoginwithCorrectCredentials;
import SourceFile.Air14_DomesticRoundTrip;
import UtilityPackage.DataDrivenTesting;

@Listeners(UtilityPackage.Listners.class)

public class ALTC14_DomesticRoundTrip extends ALTC_LaunchQuit {

	@Test(retryAnalyzer=UtilityPackage.Retry.class)
	public void DomesticRoundtrip() throws EncryptedDocumentException, IOException, InterruptedException {

		DataDrivenTesting D1 = new DataDrivenTesting();
		D1.DDT_01();

		Air02_LoginwithCorrectCredentials a1 = new Air02_LoginwithCorrectCredentials(driver);

		a1.Email();
		a1.Continue();
		a1.password();
		Thread.sleep(4000);
		a1.signin();

		Air14_DomesticRoundTrip a2 = new Air14_DomesticRoundTrip(driver);

		a2.AddressClick();
		a2.AInput01("Hyderabad");
		Thread.sleep(2000);
		a2.ASelect();

		a2.ToAddress("Bengalure");
		Thread.sleep(4000);		
		a2.SAddress();
		Thread.sleep(4000);
		a2.Traveller();
		Thread.sleep(4000);
		a2.Adult();
		Thread.sleep(4000);
		a2.permium();
		Thread.sleep(4000);
		a2.Search();

	}

}
