package pages;

import java.util.concurrent.TimeUnit;

import utils.Reporter; 
import wrappers.PeiweiWrappers;
public class CheckOut extends PeiweiWrappers {

	public CheckOut() {
		if(!verifyTitle("Checkout | Order | Menu | Pei Wei Asian Diner")); 
			//Reporter.reportStep("This is not Home Page", "FAIL");
	}
	
	public CheckOut clickCalendar(String data) {
		enterByXpath(prop.getProperty("CheckOut.Calendar.Xpath"), data);
		return this;	
		
	}
	
	public CheckOut clickNext() {
		clickByXpath(prop.getProperty("CheckOut.Next.Xpath"));
		return this;	
		
	}
	
	public CheckOut clickDate() {
		clickByXpath(prop.getProperty("CheckOut.Date22.Xpath"));
		return this;	
		
	}
	
	public CheckOut selectTime(String data) {
		selectByName(prop.getProperty("CheckOut.Time.name"), data);
		return this;	
		
	}
	
	public CheckOut clickPayOnline() {
		clickByXpath(prop.getProperty("CheckOut.PayOnline.Xpath"));
		return this;	
		
	}
	
	
	public CheckOut enterFname(String data) {
		enterByXpath(prop.getProperty("CheckOut.Fname.Xpath"), data);
		return this;	
		
	}
	public CheckOut enterLname(String data) {
		enterByXpath(prop.getProperty("CheckOut.Lname.Xpath"), data);
		return this;	
		
	}
	public CheckOut enterEmail(String data) {
		enterByXpath(prop.getProperty("CheckOut.Email.Xpath"), data);
		return this;	
		
	}
	public CheckOut enterPhone(String data) {
		enterByXpath(prop.getProperty("CheckOut.Phone.Xpath"), data);
		return this;	
		
	}
	public CheckOut enterZipCode(String data) {
		enterByXpath(prop.getProperty("CheckOut.ZipCode.Xpath"), data);
		return this;	
		
	}
	
	public OrderConfirmation clickPlaceOrder() throws InterruptedException {
		clickByXpath(prop.getProperty("CheckOut.PlaceOrder.Xpath"));
		Thread.sleep(25000);
		return new OrderConfirmation();	
		
	}
	
	public PaymentGateway clickPlaceOrder2() {
		clickByXpath(prop.getProperty("CheckOut.PlaceOrder.Xpath"));
		return new PaymentGateway();	
		
	}
	
}
