package pages;

import utils.Reporter; 
import wrappers.PeiweiWrappers;
public class GlobalInvestments extends PeiweiWrappers {

	public GlobalInvestments() {
		if(!verifyTitle("PFCB P.F. Chang's China Bistro Inc.")) ;
			//Reporter.reportStep("This is not Home Page", "FAIL");
	}
	
	public HomePage switchback() throws InterruptedException {
		Thread.sleep(5000);
		switchToParentWindow();
		return new HomePage();
		
		}

}
