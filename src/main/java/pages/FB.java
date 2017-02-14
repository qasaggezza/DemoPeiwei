package pages;

import utils.Reporter; 
import wrappers.PeiweiWrappers;
public class FB extends PeiweiWrappers {

	public FB() {
		if(!verifyTitle("Pei Wei | Facebook")) ;
			//Reporter.reportStep("This is not Home Page", "FAIL");
	}
	
	public HomePage switchback() throws InterruptedException {
		Thread.sleep(2000);
		switchToParentWindow();
		return new HomePage();
		
		}
	
}
