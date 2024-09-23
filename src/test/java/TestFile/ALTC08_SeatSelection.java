package TestFile;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import SourceFile.Air02_LoginwithCorrectCredentials;
import SourceFile.Air08_SeatSelection;
import UtilityPackage.DataDrivenTesting;

@Listeners(UtilityPackage.Listners.class)

public class ALTC08_SeatSelection extends ALTC_LaunchQuit {

	@Test(retryAnalyzer=UtilityPackage.Retry.class)
	public void SeatSelection() throws EncryptedDocumentException, IOException, InterruptedException {

		DataDrivenTesting D1 = new DataDrivenTesting();
		D1.DDT_01();

		Air02_LoginwithCorrectCredentials a1 = new Air02_LoginwithCorrectCredentials(driver);

		a1.Email();
		a1.Continue();
		a1.password();
		Thread.sleep(6000);
		a1.signin();

		Air08_SeatSelection a2 = new Air08_SeatSelection(driver);
		a2.button();
		Thread.sleep(5000);
		a2.search();
		Thread.sleep(5000);
		a2.Book();
		Thread.sleep(15000);
		a2.Proceeddetails();
		Thread.sleep(4000);
		a2.Adult01();
		Thread.sleep(4000);
		a2.child1();
		Thread.sleep(4000);
		a2.SeatSelection();
		Thread.sleep(4000);
		a2.Seat1();
		Thread.sleep(4000);
		a2.Seat2();
		Thread.sleep(10000);
		a2.Next();

	}

}
