package pages;

import java.util.concurrent.TimeUnit;

import utils.Reporter; 
import wrappers.PeiweiWrappers;
public class PaymentGateway extends PeiweiWrappers {

	public PaymentGateway() {
		if(!verifyTitle("Payment Portal: Payment")); 
			//Reporter.reportStep("This is not Home Page", "FAIL");
	}
	
	public PaymentGateway enterName(String data) {
		enterByName(prop.getProperty("PaymentGateway.Name.Name"), data);
		return this;	
		
	}
	public PaymentGateway enterCardNumber(String data) {
		enterByName(prop.getProperty("PaymentGateway.Number.Name"), data);
		return this;	
		
	}
	public PaymentGateway enterExpDate(String data) {
		enterByName(prop.getProperty("PaymentGateway.ExpDate.Name"), data);
		return this;	
		
	}
	public PaymentGateway enterCvv(String data) {
		enterByName(prop.getProperty("PaymentGateway.Cvv.Name"), data);
		return this;	
		
	}
	
	public PaymentGateway enterAddress(String data) {
		enterByName(prop.getProperty("PaymentGateway.Address.Name"), data);
		return this;	
		
	}
	public PaymentGateway enterCity(String data) {
		enterByName(prop.getProperty("PaymentGateway.City.Name"), data);
		return this;	
		
	}
	
	public PaymentGateway selectState(String data) {
		selectByName(prop.getProperty("PaymentGateway.State.Name"), data);
		return this;	
		
	}
	
	public PaymentGateway enterZipCode(String data) {
		enterByName(prop.getProperty("PaymentGateway.ZipCode.Name"), data);
		return this;	
		
	}
	
	public OrderConfirmation clickPayWithCard() throws InterruptedException {
		clickByName(prop.getProperty("PaymentGateway.PayWithCard.Name"));
		//Thread.sleep(20000);
		return new OrderConfirmation();	
		
	}
}
