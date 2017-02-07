package pages;
import utils.Reporter; 
import wrappers.PeiweiWrappers;
public class MyPeiWeiRewards extends PeiweiWrappers {

	public MyPeiWeiRewards()  {
		if(!verifyTitle("My Wei Rewards | Pei Wei Asian Diner")); 
			//Reporter.reportStep("This is not Home Page", "FAIL");
	}
	
	
	public MyPeiWeiRewards verifyCard() throws InterruptedException {
		Thread.sleep(4000);
		clickByXpath(prop.getProperty("MyWeiRewards.Card.Xpath"));
		return this;
	}

	public EarnAVisit clickEarnAVisit() throws InterruptedException  {
		clickByXpath(prop.getProperty("MyWeiRewards.EarnAVisit.Xpath"));
		Thread.sleep(5000);
		return new EarnAVisit();
		
		}
	public FAQ clickFAQ() throws InterruptedException  {
		clickByXpath(prop.getProperty("MyWeiRewards.FAQ.Xpath"));
		Thread.sleep(5000);
		return new FAQ();
		
		}
	
}
