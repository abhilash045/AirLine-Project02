package TestFile;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import SourceFile.Air02_LoginwithCorrectCredentials;
import SourceFile.Air12_LoginSearchLogout;
import UtilityPackage.DataDrivenTesting;

@Listeners(UtilityPackage.Listners.class)
public class ALTC12_LoginSearchLogout extends ALTC_LaunchQuit {

	@Test(retryAnalyzer=UtilityPackage.Retry.class)
	public void LoginSearchLogout() throws EncryptedDocumentException, IOException, InterruptedException {

		DataDrivenTesting D1 = new DataDrivenTesting();
		D1.DDT_01();

		Air02_LoginwithCorrectCredentials a1 = new Air02_LoginwithCorrectCredentials(driver);

		a1.Email();
		a1.Continue();
		a1.password();
		Thread.sleep(4000);
		a1.signin();

		Air12_LoginSearchLogout a2 = new Air12_LoginSearchLogout(driver);
		Thread.sleep(2000);
		a2.Search();
		Thread.sleep(2000);
		a2.Book();
		Thread.sleep(2000);
		a2.AccountList(driver);
		Thread.sleep(4000);
		a2.SignOut();

	}

}
