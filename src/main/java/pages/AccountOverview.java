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
		clickByLink(prop.getProperty("AccountOverview.LogOut.Linktext"));
		return this;
		
		
	}

	public HomePage clickNotUserName() throws InterruptedException {
	//	Thread.sleep(5000);
		clickByXpath(prop.getProperty("AccountOverview.NotUserName.Xpath"));
		return new HomePage();
		
		}

	public MenuAndOrder clickMenuAndOrder() {
		clickByXpath(prop.getProperty("AccountOverview.MenuAndOrder.Xpath"));
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
		clickByXpath(prop.getProperty("AccountOverview.OrderFavorite.Xpath"));
		return this;		
		}
	
	public Extras clickCheckOutFavourite() {
		clickByXpath(prop.getProperty("AccountOverview.OrderFavoriteCheckOut.Xpath"));
		return new Extras();		
		}

	public AccountOverview verifyMailId(String data) {
		verifyTextByXpath(prop.getProperty("AccountOverview.MailId.Xpath"), data);
		return this;
	}

}


