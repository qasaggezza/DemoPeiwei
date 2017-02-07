package pages;

import utils.Reporter; 
import wrappers.PeiweiWrappers;
public class Twitter extends PeiweiWrappers {

	public Twitter() {
		if(!verifyTitle("PeiWei (@PeiWei) | Twitter")) ;
			//Reporter.reportStep("This is not Home Page", "FAIL");
	}
	public HomePage switchback() throws InterruptedException {
		Thread.sleep(5000);
		switchToParentWindow();
		return new HomePage();
		
		}
}
