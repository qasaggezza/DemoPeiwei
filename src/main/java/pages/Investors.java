package pages;
import utils.Reporter; 
import wrappers.PeiweiWrappers;
public class Investors extends PeiweiWrappers {

	public Investors() {
		if(!verifyTitle("PFCB P.F. Chang's China Bistro Inc. - Investor Relations - Investors")) ;
			//Reporter.reportStep("This is not Home Page", "FAIL");
	}
	public HomePage switchback() throws InterruptedException {
		Thread.sleep(5000);
		switchToParentWindow();
		return new HomePage();
		
		}
}
