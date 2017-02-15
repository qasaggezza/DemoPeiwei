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
		enterByName(prop.getProperty("CheckOut.Calendar.Name"), data);
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
		selectByName(prop.getProperty("CheckOut.Time.Name"), data);
		return this;	
		
	}
	
	public CheckOut clickPayOnline() {
		clickById(prop.getProperty("CheckOut.PayOnline.Id"));
		return this;	
		
	}
	
	
	public CheckOut enterFname(String data) {
		enterByName(prop.getProperty("CheckOut.FName.Name"), data);
		return this;	
		
	}
	public CheckOut enterLname(String data) {
		enterByName(prop.getProperty("CheckOut.LName.Name"), data);
		return this;	
		
	}
	public CheckOut enterEmail(String data) {
		enterByName(prop.getProperty("CheckOut.Email.Name"), data);
		return this;	
		
	}
	public CheckOut enterPhone(String data) {
		enterByXpath(prop.getProperty("CheckOut.Phone.Xpath"), data);
		return this;	
		
	}
	public CheckOut enterZipCode(String data) {
		enterByName(prop.getProperty("CheckOut.ZipCode.Name"), data);
		return this;	
		
	}
	
	public OrderConfirmation clickPlaceOrder() throws InterruptedException {
		clickByXpath(prop.getProperty("CheckOut.PlaceOrder.Xpath"));
		//Thread.sleep(25000);
		return new OrderConfirmation();	
		
	}
	
	public PaymentGateway clickPlaceOrder2() {
		clickByXpath(prop.getProperty("CheckOut.PlaceOrder.Xpath"));
		return new PaymentGateway();	
		
	}

	public CheckOut getTotal1() {
		getTextByXpath(prop.getProperty("CheckOut.Total.Xpath"));
		return this;	
		
	}
	
	public CheckOut getTotal2() {
		getTextByXpath(prop.getProperty("CheckOut.Total1.Xpath"));
		return this;	
		
	}
	
}
