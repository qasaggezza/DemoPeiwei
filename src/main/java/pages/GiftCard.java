package pages;

import utils.Reporter; 
import wrappers.PeiweiWrappers;
public class GiftCard extends PeiweiWrappers {

	public GiftCard() {
		if(!verifyTitle("Gift Card | Pei Wei Asian Diner")); 
		//Thread.sleep(3000);
			//Reporter.reportStep("This is not Home Page", "FAIL");
	}
	
	
	public AddCard clickOrdercard()  {
		clickByXpath(prop.getProperty("Giftcards.OrderaGiftCard.Xpath"));
		return new AddCard();
			
	}
	
	public GiftCard clickSendeGift()  {
		clickByXpath(prop.getProperty("Giftcards.SendEGift.Xpath"));
		return this;
			
	}
}
