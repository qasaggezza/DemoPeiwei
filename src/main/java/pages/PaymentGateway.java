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
		enterByXpath(prop.getProperty("PaymentGateway.Name.Xpath"), data);
		return this;	
		
	}
	public PaymentGateway enterCardNumber(String data) {
		enterByXpath(prop.getProperty("PaymentGateway.Number.Xpath"), data);
		return this;	
		
	}
	public PaymentGateway enterExpDate(String data) {
		enterByXpath(prop.getProperty("PaymentGateway.ExpDate.Xpath"), data);
		return this;	
		
	}
	public PaymentGateway enterCvv(String data) {
		enterByXpath(prop.getProperty("PaymentGateway.Cvv.Xpath"), data);
		return this;	
		
	}
	
	public PaymentGateway enterAddress(String data) {
		enterByXpath(prop.getProperty("PaymentGateway.Address.Xpath"), data);
		return this;	
		
	}
	public PaymentGateway enterCity(String data) {
		enterByXpath(prop.getProperty("PaymentGateway.City.Xpath"), data);
		return this;	
		
	}
	
	public PaymentGateway selectState(String data) {
		selectByXpath(prop.getProperty("PaymentGateway.State.Xpath"), data);
		return this;	
		
	}
	
	public PaymentGateway enterZipCode(String data) {
		enterByXpath(prop.getProperty("PaymentGateway.ZipCode.Xpath"), data);
		return this;	
		
	}
	
	public OrderConfirmation clickPayWithCard() throws InterruptedException {
		clickByXpath(prop.getProperty("PaymentGateway.PayWithCard.Xpath"));
		Thread.sleep(20000);
		return new OrderConfirmation();	
		
	}
}
