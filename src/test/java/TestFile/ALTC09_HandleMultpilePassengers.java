package TestFile;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import SourceFile.Air02_LoginwithCorrectCredentials;
import SourceFile.Air09_HandleMultpilePassengers;
import UtilityPackage.DataDrivenTesting;

@Listeners(UtilityPackage.Listners.class)
public class ALTC09_HandleMultpilePassengers extends ALTC_LaunchQuit {

	@Test(retryAnalyzer = UtilityPackage.Retry.class)
	public void HandleMultpulePassengers() throws EncryptedDocumentException, IOException, InterruptedException {

		DataDrivenTesting D1 = new DataDrivenTesting();
		D1.DDT_01();

		Air02_LoginwithCorrectCredentials a1 = new Air02_LoginwithCorrectCredentials(driver);

		a1.Email();
		a1.Continue();
		a1.password();
		Thread.sleep(4000);
		a1.signin();

		Air09_HandleMultpilePassengers a2 = new Air09_HandleMultpilePassengers(driver);
		Thread.sleep(4000);
		a2.Traveller();
		Thread.sleep(3000);
		a2.Children();
		Thread.sleep(3000);
		a2.Search();
		Thread.sleep(5000);

		a2.Book();

		Thread.sleep(15000);

		a2.Proceeddetails();
		Thread.sleep(3000);
		a2.AddNew();

		Thread.sleep(3000);
		a2.Gender();
		Thread.sleep(2000);
		a2.male();
		Thread.sleep(4000);
		a2.FirstName("Abhilash");
		Thread.sleep(4000);
		a2.LastName("pasikanti");
		Thread.sleep(4000);
		a2.Submit();
		Thread.sleep(4000);
		a2.Child();
		Thread.sleep(4000);
		a2.Gender01();
		Thread.sleep(4000);
		a2.Female();
		Thread.sleep(4000);
		a2.FName("Chinnari");
		Thread.sleep(4000);
		a2.LName("Pasikanti");
		Thread.sleep(4000);
		a2.DOB();
		Thread.sleep(4000);
		a2.Year();
		Thread.sleep(4000);
		a2.SelectYear();

		Thread.sleep(4000);
		a2.SelectDate();
		Thread.sleep(4000);
		a2.AddChild();

	}

}
