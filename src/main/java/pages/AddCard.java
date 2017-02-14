package pages;
import utils.Reporter; 
import wrappers.PeiweiWrappers;
public class AddCard extends PeiweiWrappers {

	public AddCard() {
		if(!verifyTitle("Create | Gift Card | Pei Wei Asian Diner")); 
		//Thread.sleep(3000);
			//Reporter.reportStep("This is not Home Page", "FAIL");
	}
	
	
	public AddCard selectCardValue(String data )  {
		selectByXpath(prop.getProperty("Addcard.CardValue.Xpath"), data);
		return this;
			
	}
	
	public AddCard enterQty(String data )  {
		enterById(prop.getProperty("Addcard.CardQty.id"), data);
		return this;
			
	}
	
	public AddCard clicknext()  {
		clickByXpath(prop.getProperty("Addcard.AddMessage.Xpath"));
		return this;
			
	}
	
	public AddCard enterTo(String data )  {
		enterByXpath(prop.getProperty("Addcard.To.Xpath"), data);
		return this;
			
	}
	public AddCard enterFrom(String data )  {
		enterByXpath(prop.getProperty("Addcard.From.Xpath"), data);
		return this;
			
	}
	
	public AddCard enterMessage(String data )  {
		enterByXpath(prop.getProperty("Addcard.Message.Xpath"), data);
		return this;
			
	}
	
	public AddCard clickPreview()  {
		clickByXpath(prop.getProperty("Addcard.Previewcard.Xpath"));
		return this;
			
	}
	
	public AddCard clickAddOrder()  {
		clickByXpath(prop.getProperty("Addcard.AddtoOrder.Xpath"));
		return this;
			
	}
	
	public CardCheckout clickCheckOut()  {
		clickByXpath(prop.getProperty("Addcard.Checkout.Xpath"));
		return new CardCheckout();
			
	}
}
