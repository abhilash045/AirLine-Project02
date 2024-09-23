package UtilityPackage;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {

	// TODO Auto-generated method stub
	@Override
	public boolean retry(ITestResult result) {

		int current_count = 0;
		int retry_count = 0;

		if (current_count < retry_count) {
			current_count++;

			return true;
		}

		return false;
	}

}
