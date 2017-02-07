package pages;

import utils.Reporter; 
import wrappers.PeiweiWrappers;
public class Googleplus extends PeiweiWrappers {

	public Googleplus() {
		if(!verifyTitle("Pei Wei Asian Diner - Google+")) ;
			//Reporter.reportStep("This is not Home Page", "FAIL");
	}
	public HomePage switchback() throws InterruptedException {
		Thread.sleep(5000);
		switchToParentWindow();
		return new HomePage();
		
		}
}
