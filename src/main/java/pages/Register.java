package pages;

import java.util.concurrent.TimeUnit;

import utils.Reporter;
import wrappers.PeiweiWrappers;
public class Register extends PeiweiWrappers{

	public Register() throws InterruptedException {
		//Thread.sleep(3000);
		if(!verifyTitle("Register | My Account | Pei Wei Asian Diner")) 
			Reporter.reportStep("This is not the Register Page", "FAIL");
	}
	
	public Register enterEmailaddress(String data) {
		enterByName(prop.getProperty("Register.Emailaddress.Name"), data);
		return this;
	}

	public Register enterPassword(String data) {
		enterByName(prop.getProperty("Register.Password.Name"), data);
		return this;
	}
	
	public Register enterFirstname(String data) {
		enterByName(prop.getProperty("Register.FirstName.Name"), data);
		return this;
	}
	public Register enterLastname(String data) {
		enterByName(prop.getProperty("Register.LastName.Name"), data);
		return this;
	}
	
	public Register enterPhone(String data) {
		enterByName(prop.getProperty("Register.Phone.Name"), data);
		return this;
	}
	
	
	public Register enterZip(String data) {
		enterByName(prop.getProperty("Register.Zip.Name"), data);
		return this;
	}
	

	public Register clickenableLoyal() {
		clickByXpath(prop.getProperty("Register.Signup.Xpath"));
		return this;
	}
	
	public Register clickCreateMyAccount() throws InterruptedException {
		clickByXpath(prop.getProperty("Register.Createaccount.Xpath"));
		//Thread.sleep(5000);
		return this;
			}	
	
	public AccountOverview clickCreateMyAccount2() throws InterruptedException {
		clickByXpath(prop.getProperty("Register.Createaccount.Xpath"));
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return new AccountOverview();
			}
	
	public Register enterMonth(String data) throws InterruptedException {
		selectByName(prop.getProperty("Register.Selectmonth.Name"), data);		
		return this;
	}	
	
	public Register enterDate(String data) {
		selectByName(prop.getProperty("Register.Selectday.Name"), data);
		return this;
	}
	

	public AccountOverview clickSubmit() throws InterruptedException {
		//System.out.println(driver.findElementByXpath("(//button[@type='submit'])[2]").getText());
		//Thread.sleep(6000);
		clickById(prop.getProperty("Register.Submit.Id"));
		//Thread.sleep(5000);
		return new AccountOverview();

}


}
