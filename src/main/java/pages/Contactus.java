package pages;
import utils.Reporter; 
import wrappers.PeiweiWrappers;
public class Contactus extends PeiweiWrappers {

	public Contactus() {
		if(!verifyTitle("Contact Us | Pei Wei Asian Diner")) ;
			//Reporter.reportStep("This is not Home Page", "FAIL");
	}
	
	public HomePage clickLogo() throws InterruptedException {
		Thread.sleep(1000);
		clickByXpath(prop.getProperty("Home.Logo.Xpath"));
		//Thread.sleep(2000);
		return new HomePage();
	}
}
