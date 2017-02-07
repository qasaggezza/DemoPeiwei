package pages;
import utils.Reporter; 
import wrappers.PeiweiWrappers;
public class Sitemap extends PeiweiWrappers {

	public Sitemap() {
		if(!verifyTitle("Site Map | Pei Wei Asian Diner")) ;
			//Reporter.reportStep("This is not Home Page", "FAIL");
	}
	
	public HomePage clickLogo() throws InterruptedException {
		clickByXpath(prop.getProperty("Home.Logo.Xpath"));
		Thread.sleep(2000);
		return new HomePage();
	}

}

