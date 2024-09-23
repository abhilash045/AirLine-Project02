package TestFile;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import SourceFile.Air02_LoginwithCorrectCredentials;
import UtilityPackage.DataDrivenTesting;

@Listeners(UtilityPackage.Listners.class)

public class ALTC03_LoginInvalidCredentials extends ALTC_LaunchQuit {

	@Test(retryAnalyzer = UtilityPackage.Retry.class)
	public void ILogin() throws EncryptedDocumentException, IOException {

		DataDrivenTesting D1 = new DataDrivenTesting();
		D1.DDT_02();

		Air02_LoginwithCorrectCredentials a1 = new Air02_LoginwithCorrectCredentials(driver);

		a1.Email1();
		a1.Continue();

		a1.password1();
		a1.signin();

		String Actual_Result = driver.getTitle();

	}

}
