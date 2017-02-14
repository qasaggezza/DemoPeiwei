package pages;
import utils.Reporter; 
import wrappers.PeiweiWrappers;
public class AllLocations extends PeiweiWrappers {

	public AllLocations() {
		if(!verifyTitle("All Locations | Pei Wei Asian Diner")) ;
			//Reporter.reportStep("This is not Home Page", "FAIL");
	}
	
	public HomePage clickLogo() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Logo.Xpath"));
		Thread.sleep(1000);
		return new HomePage();
	}

}
