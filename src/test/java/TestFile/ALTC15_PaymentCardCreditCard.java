package TestFile;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import SourceFile.Air02_LoginwithCorrectCredentials;
import SourceFile.Air15_PaymentPageCreditCard;
import UtilityPackage.DataDrivenTesting;

@Listeners(UtilityPackage.Listners.class)

public class ALTC15_PaymentCardCreditCard extends ALTC_LaunchQuit {

	@Test(retryAnalyzer=UtilityPackage.Retry.class)
	public void CreditCardPaymentc() throws EncryptedDocumentException, IOException, InterruptedException {

		DataDrivenTesting D1 = new DataDrivenTesting();
		D1.DDT_01();

		Air02_LoginwithCorrectCredentials a1 = new Air02_LoginwithCorrectCredentials(driver);

		a1.Email();
		a1.Continue();
		a1.password();
		Thread.sleep(4000);
		a1.signin();

		Air15_PaymentPageCreditCard a2 = new Air15_PaymentPageCreditCard(driver);

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
		Thread.sleep(10000);
		a2.Book();
		Thread.sleep(15000);
		a2.Proceeddetails();
		Thread.sleep(4000);
		a2.TravellerDetails1();
		Thread.sleep(4000);
		a2.TravellerDetails2();
		Thread.sleep(10000);
		a2.SeatSelection();
		Thread.sleep(4000);
		a2.skipseat();
		Thread.sleep(4000);
		a2.checkbox();
		Thread.sleep(4000);
		a2.ProceedPayment();
		Thread.sleep(10000);
		a2.PaymentMethod();
		Thread.sleep(4000);
		// a2.CustomerName("Abhilash");
		// a2.Thread.sleep(4000);
		a2.CardNumber("416643210118117");
		Thread.sleep(4000);
		a2.EMonth();
		Thread.sleep(4000);
		a2.SMonth();
		Thread.sleep(4000);
		a2.EYear();
		Thread.sleep(4000);
		a2.SYear();
		Thread.sleep(4000);
		a2.EnterCarddetails();

	}

}
