package TestFile;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import SourceFile.Air02_LoginwithCorrectCredentials;
import SourceFile.Air10_FightInformationBaggageRules;
import UtilityPackage.DataDrivenTesting;

@Listeners(UtilityPackage.Listners.class)

public class ALTC10_FightInformationBaggageRules extends ALTC_LaunchQuit {

	@Test(retryAnalyzer=UtilityPackage.Retry.class)
	public void FlightInformation() throws EncryptedDocumentException, IOException, InterruptedException {

		DataDrivenTesting D1 = new DataDrivenTesting();
		D1.DDT_01();

		Air02_LoginwithCorrectCredentials a1 = new Air02_LoginwithCorrectCredentials(driver);

		a1.Email();
		a1.Continue();
		a1.password();
		Thread.sleep(4000);
		a1.signin();

		Air10_FightInformationBaggageRules a2 = new Air10_FightInformationBaggageRules(driver);
		Thread.sleep(5000);
		a2.Search();
		Thread.sleep(8000);
		a2.Book();
		Thread.sleep(10000);
		a2.ViewBaggage();
		Thread.sleep(4000);
		a2.Cancellation();
		Thread.sleep(4000);
		a2.Dates();
		Thread.sleep(4000);
		a2.traveller();
		Thread.sleep(4000);
		a2.ViewFareDetails();

	}

}
