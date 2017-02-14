package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utils.Reporter;
import wrappers.PeiweiWrappers;
public class Gmail extends PeiweiWrappers{

	public Gmail() {
		if(!verifyTitle("Gmail")) ;
//			//Reporter.reportStep("This is not the Register Page", "FAIL");
	}
	
	public Gmail enterEmailaddress(String data) {
		enterById(prop.getProperty("Gmail.Emailaddress.id"), data);
		return this;
	}
	
	public Gmail enterNext() throws InterruptedException {
		clickById(prop.getProperty("Gmail.Next.id"));
		//Thread.sleep(3000);
		return this;
	}

	public Gmail enterPassword(String data) {
		enterById(prop.getProperty("Gmail.Password.id"), data);
		return this;
	}
	
	public Inbox clickSignIn() {
		clickById(prop.getProperty("Gmail.Signin.id"));
		return new Inbox();
	}
	
	
}
