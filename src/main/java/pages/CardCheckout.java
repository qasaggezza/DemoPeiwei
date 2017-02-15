package pages;
import utils.Reporter; 
import wrappers.PeiweiWrappers;
public class CardCheckout extends PeiweiWrappers {

	public CardCheckout() {
		if(!verifyTitle("Checkout | Gift Card | Pei Wei Asian Diner")); 
		//Thread.sleep(3000);
			//Reporter.reportStep("This is not Home Page", "FAIL");
	}
	public CardCheckout enterFname(String data) {
		enterByName(prop.getProperty("CardCheckout.FName.Name"), data);
		return this;	
		
	}
	public CardCheckout enterLname(String data) {
		enterByName(prop.getProperty("CardCheckout.LName.Name"), data);
		return this;	
		
	}
	
	public CardCheckout enterPhone(String data) {
		enterByXpath(prop.getProperty("CardCheckout.Phone.Xpath"), data);
		return this;	
		
	}
	
	public CardCheckout enterAddr1(String data) {
		enterByName(prop.getProperty("CardCheckout.Addr1.Name"), data);
		return this;	
		
	}
	
	public CardCheckout enterAddr2(String data) {
		enterByName(prop.getProperty("CardCheckout.Addr2.Name"), data);
		return this;	
		
	}
	
	public CardCheckout enterCity(String data) {
		enterByName(prop.getProperty("CardCheckout.City.Name"), data);
		return this;	
		
	}
	public CardCheckout selectState(String data) {
		selectByName(prop.getProperty("CardCheckout.State.Name"), data);
		return this;	
		
	}
	public CardCheckout enterZipCode(String data) {
		enterByName(prop.getProperty("CardCheckout.Zip.Name"), data);
		return this;	
		
	}
	
	public CardCheckout selectShippingMethood(String data) {
		selectByName(prop.getProperty("CardCheckout.ShippingMethod.Name"), data);
		return this;	
		
	}
	
	
	public CardCheckout enterEmail(String data) {
		enterByName(prop.getProperty("CardCheckout.Email.Name"), data);
		return this;	
		
	}
	
	public CardCheckout clickReview() {
		clickByXpath(prop.getProperty("CardCheckout.Review.Xpath"));
		return this;	
		
	}
	
	public PaymentGateway clickPayNow() {
		clickByXpath(prop.getProperty("CardCheckout.Paynow.Xpath"));
		return new PaymentGateway();	
		
	}
	public CardCheckout verifyFrom(String data) {
		verifyTextByXpath(prop.getProperty("CardCheckout.VerifyFrom.Xpath"), data);
		return this;
	}
	
	public CardCheckout verifyTo(String data) {
		verifyTextByXpath(prop.getProperty("CardCheckout.VerifyTo.Xpath"), data);
		return this;
	}
}
