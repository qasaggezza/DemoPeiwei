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
		enterByXpath(prop.getProperty("CardCheckout.Fname.Xpath"), data);
		return this;	
		
	}
	public CardCheckout enterLname(String data) {
		enterByXpath(prop.getProperty("CardCheckout.Lname.Xpath"), data);
		return this;	
		
	}
	
	public CardCheckout enterPhone(String data) {
		enterByXpath(prop.getProperty("CardCheckout.Phone.Xpath"), data);
		return this;	
		
	}
	
	public CardCheckout enterAddr1(String data) {
		enterByXpath(prop.getProperty("CardCheckout.Addr1.Xpath"), data);
		return this;	
		
	}
	
	public CardCheckout enterAddr2(String data) {
		enterByXpath(prop.getProperty("CardCheckout.Addr2.Xpath"), data);
		return this;	
		
	}
	
	public CardCheckout enterCity(String data) {
		enterByXpath(prop.getProperty("CardCheckout.City.Xpath"), data);
		return this;	
		
	}
	public CardCheckout selectState(String data) {
		selectByName(prop.getProperty("CardCheckout.State.name"), data);
		return this;	
		
	}
	public CardCheckout enterZipCode(String data) {
		enterByXpath(prop.getProperty("CardCheckout.Zip.Xpath"), data);
		return this;	
		
	}
	
	public CardCheckout selectShippingMethood(String data) {
		selectByName(prop.getProperty("CardCheckout.ShippingMethod.name"), data);
		return this;	
		
	}
	
	
	public CardCheckout enterEmail(String data) {
		enterByXpath(prop.getProperty("CardCheckout.Email.Xpath"), data);
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
