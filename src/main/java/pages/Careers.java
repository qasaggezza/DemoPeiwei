package pages;
import utils.Reporter; 
import wrappers.PeiweiWrappers;
public class Careers extends PeiweiWrappers {

	public Careers() {
		if(!verifyTitle("Jobs at Pei Wei | Join our team of culinary professionals today! | Home")) ;
			//Reporter.reportStep("This is not Home Page", "FAIL");
	}
	public HomePage switchback() throws InterruptedException {
		Thread.sleep(2000);
		switchToParentWindow();
		return new HomePage();
		
		}
}

