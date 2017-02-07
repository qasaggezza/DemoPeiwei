package pages;
import utils.Reporter; 
import wrappers.PeiweiWrappers;
public class FAQ extends PeiweiWrappers {

	public FAQ()  {
		if(!verifyTitle("My Wei Rewards FAQs | Pei Wei Asian Diner")); 
			//Reporter.reportStep("This is not Home Page", "FAIL");
	}
	
	
	public MyPeiWeiRewards clickMyWeiRewards1() throws InterruptedException {
		Thread.sleep(2000);
		clickByXpath(prop.getProperty("AccountOverview.MyWeiRewards.Xpath"));
		return new MyPeiWeiRewards();
	}
}