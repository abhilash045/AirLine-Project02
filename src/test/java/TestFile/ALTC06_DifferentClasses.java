package TestFile;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import SourceFile.Air02_LoginwithCorrectCredentials;
import SourceFile.Air06_DiffrentClassResults;
import UtilityPackage.DataDrivenTesting;

@Listeners(UtilityPackage.Listners.class)

public class ALTC06_DifferentClasses extends ALTC_LaunchQuit {

	@Test(retryAnalyzer = UtilityPackage.Retry.class)
	public void Diffrentclass() throws EncryptedDocumentException, IOException, InterruptedException {

		DataDrivenTesting D1 = new DataDrivenTesting();
		D1.DDT_01();

		Air02_LoginwithCorrectCredentials a1 = new Air02_LoginwithCorrectCredentials(driver);

		a1.Email();
		a1.Continue();
		a1.password();
		Thread.sleep(4000);
		a1.signin();

		Air06_DiffrentClassResults a2 = new Air06_DiffrentClassResults(driver);

		Thread.sleep(2000);
		a2.Traveller();
		Thread.sleep(4000);
		a2.Adult();
		Thread.sleep(4000);
		a2.Children();
		Thread.sleep(4000);
		a2.Infants();
		Thread.sleep(4000);
		a2.permium();
		Thread.sleep(4000);
		a2.search();

	}

}
