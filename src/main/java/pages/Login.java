package pages;

import java.util.concurrent.TimeUnit;

import utils.Reporter;
import wrappers.PeiweiWrappers;
public class Login extends PeiweiWrappers{

	public Login() {
		if(!verifyTitle("Home | Pei Wei Asian Diner")) ;
		//	Reporter.reportStep("This is not the Login Page", "FAIL");
	}
	
	public Login enterEmailaddresslogin(String data) {
		enterById(prop.getProperty("Login.Emailaddress.Id"), data);
		return this;
	}

	public Login enterPassword(String data) {
		enterById(prop.getProperty("Login.Password.Id"), data);
		return this;
	}
	
	public Login clickForgotPwd() {
		clickByLink(prop.getProperty("Login.Forgotpassword.Linktext"));
		return this;
	}
	
	public HomePage clickSubmit() throws InterruptedException {
		clickByXpath(prop.getProperty("Login.Submit.Xpath"));
		return new HomePage();
	}
	
	

}


