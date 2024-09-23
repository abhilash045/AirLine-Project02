package TestFile;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import SourceFile.Air02_LoginwithCorrectCredentials;
import UtilityPackage.DataDrivenTesting;

@Listeners(UtilityPackage.Listners.class)

public class ALTC02_LoginCorrectCredentials extends ALTC_LaunchQuit {

	@Test(retryAnalyzer = UtilityPackage.Retry.class)
	public void login() throws EncryptedDocumentException, IOException, InterruptedException {

		DataDrivenTesting D1 = new DataDrivenTesting();
		D1.DDT_01();

		Air02_LoginwithCorrectCredentials a1 = new Air02_LoginwithCorrectCredentials(driver);

		a1.Email();
		a1.Continue();
		a1.password();
		Thread.sleep(5000);
		a1.signin();

	}

}
