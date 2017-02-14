package pages;

import utils.Reporter; 
import wrappers.PeiweiWrappers;
public class ResetPassword extends PeiweiWrappers {

	public ResetPassword() {
		if(!verifyTitle("Reset Password | My Account | Pei Wei Asian Diner")) ;
		//	Reporter.reportStep("This is not the Register Page", "FAIL");
	}
	
	public ResetPassword enterPassword1(String data) {
		enterByXpath(prop.getProperty("ResetPwd.Password1.Xpath"), data);
		return this;
	}
	
	public ResetPassword enterPassword2(String data) {
		enterByXpath(prop.getProperty("ResetPwd.Password2.Xpath"), data);
		return this;
	}
	
	public AccountOverview clickSubmit() throws InterruptedException {
		clickByXpath(prop.getProperty("ResetPwd.submit.Xpath"));
		//Thread.sleep(5000);
		return new AccountOverview();
	}
	
}
