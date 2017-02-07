package pages;

import utils.Reporter; 
import wrappers.PeiweiWrappers;
public class Pinterest extends PeiweiWrappers {

	public Pinterest() {
		if(!verifyTitle("Pei Wei on Pinterest")) ;
			//Reporter.reportStep("This is not Home Page", "FAIL");
	}
	public HomePage switchback() throws InterruptedException {
		Thread.sleep(5000);
		switchToParentWindow();
		return new HomePage();
		
		}
}
