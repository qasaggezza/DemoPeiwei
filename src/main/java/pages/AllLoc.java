package pages;
import utils.Reporter; 
import wrappers.PeiweiWrappers;
public class AllLoc extends PeiweiWrappers {

	public AllLoc() {
		if(!verifyTitle("All Locations | Pei Wei Asian Diner")) ;
			//Reporter.reportStep("This is not Home Page", "FAIL");
	}
	
	public HomePage clickLogo() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Logo.Xpath"));
		Thread.sleep(2000);
		return new HomePage();
	}

}
