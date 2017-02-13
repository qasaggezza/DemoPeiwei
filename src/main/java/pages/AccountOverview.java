package pages;

import utils.Reporter; 
import wrappers.PeiweiWrappers;
public class AccountOverview extends PeiweiWrappers {

	public AccountOverview() throws InterruptedException {
		if(!verifyTitle("Pei Wei | My Account | Overview | Pei Wei Asian Diner")); 
		//Thread.sleep(3000);
			//Reporter.reportStep("This is not Home Page", "FAIL");
	}
	
	
	public AccountOverview clickLogout() throws InterruptedException {
	//	Thread.sleep(5000);
		clickByLink(prop.getProperty("AccountOverview.LogOut.linktext"));
		return this;
		
		
	}

	public HomePage clickNotUserName() throws InterruptedException {
	//	Thread.sleep(5000);
		clickByXpath(prop.getProperty("AccountOverview.NotUserName.XPath"));
		return new HomePage();
		
		}

	public MenuAndOrder clickMenuAndOrder() {
		clickByXpath(prop.getProperty("AccountOverview.MenuAndOrder.XPath"));
		return new MenuAndOrder();
		
		}
	

	public Inbox switchback() throws InterruptedException {
		//Thread.sleep(5000);
		switchToParentWindow();
		return new Inbox();
		
		}

	public GiftCard clickGiftcard(){
		clickByXpath(prop.getProperty("AccountOverview.Giftcards.Xpath"));
		return new GiftCard();
	}

	public MyPeiWeiRewards clickMyWeiRewards(){
		clickByXpath(prop.getProperty("AccountOverview.MyWeiRewards.Xpath"));
		return new MyPeiWeiRewards();
	}

	public AccountOverview clickOrderFavourite() {
		clickByXpath(prop.getProperty("AccountOverview.orderFavorite.XPath"));
		return this;		
		}
	
	public Extras clickCheckOutFavourite() {
		clickByXpath(prop.getProperty("AccountOverview.orderFavoriteCheckOut.XPath"));
		return new Extras();		
		}
}
