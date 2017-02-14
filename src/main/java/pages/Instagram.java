package pages;

import utils.Reporter; 
import wrappers.PeiweiWrappers;
public class Instagram extends PeiweiWrappers {

	public Instagram() {
		if(!verifyTitle("Pei Wei Official (@peiweiasiandiner) • Instagram photos and videos")) ;
			//Reporter.reportStep("This is not Home Page", "FAIL");
	}
	public HomePage switchback() throws InterruptedException {
		Thread.sleep(2000);
		switchToParentWindow();
		return new HomePage();
		
		}
}
