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
		enterByName(prop.getProperty("CardCheckout.Fname.name"), data);
		return this;	
		
	}
	public CardCheckout enterLname(String data) {
		enterByName(prop.getProperty("CardCheckout.Lname.name"), data);
		return this;	
		
	}
	
	public CardCheckout enterPhone(String data) {
		enterByXpath(prop.getProperty("CardCheckout.Phone.Xpath"), data);
		return this;	
		
	}
	
	public CardCheckout enterAddr1(String data) {
		enterByName(prop.getProperty("CardCheckout.Addr1.name"), data);
		return this;	
		
	}
	
	public CardCheckout enterAddr2(String data) {
		enterByName(prop.getProperty("CardCheckout.Addr2.name"), data);
		return this;	
		
	}
	
	public CardCheckout enterCity(String data) {
		enterByName(prop.getProperty("CardCheckout.City.name"), data);
		return this;	
		
	}
	public CardCheckout selectState(String data) {
		selectByName(prop.getProperty("CardCheckout.State.name"), data);
		return this;	
		
	}
	public CardCheckout enterZipCode(String data) {
		enterByName(prop.getProperty("CardCheckout.Zip.name"), data);
		return this;	
		
	}
	
	public CardCheckout selectShippingMethood(String data) {
		selectByName(prop.getProperty("CardCheckout.ShippingMethod.name"), data);
		return this;	
		
	}
	
	
	public CardCheckout enterEmail(String data) {
		enterByName(prop.getProperty("CardCheckout.Email.name"), data);
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
	
}
