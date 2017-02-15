package pages;

import utils.Reporter; 
import wrappers.PeiweiWrappers;
public class Extras extends PeiweiWrappers {

	public Extras() {
		if(!verifyTitle("Extras | Order | Menu | Pei Wei Asian Diner")); 
			//Reporter.reportStep("This is not Home Page", "FAIL");
	}
	
	public Extras enterLettuce(String data) {
		enterByXpath(prop.getProperty("Extras.Lettuce.Xpath"), data);
		return this;	
		
	}
	public Extras clickLettuceAddToOrder() {
		clickByXpath(prop.getProperty("Extras.LettuceAddToOrder.Xpath"));
		return this;	
		
	}
	
	public Extras selectRice(String data) {
		selectByXpath(prop.getProperty("Extras.Rice.Xpath"), data);
		return this;	
		
	}
	
	public Extras enterQuan(String data) {
		enterByXpath(prop.getProperty("Extras.RiceQuantity.Xpath"), data);
		return this;	
		
	}
	
	public Extras enterSnicker(String data) {
		enterByXpath(prop.getProperty("Extras.SnickerdoodleQuantity.Xpath"), data);
		return this;	
		
	}
	
	public Extras enterNoodlesQuan(String data) {
		enterByXpath(prop.getProperty("Extras.NoodlesQuantity.Xpath"), data);
		return this;	
		
	}
	
	public Extras enterSauceQuan(String data) {
		enterByXpath(prop.getProperty("Extras.SauceQuantity.Xpath"), data);
		return this;	
		
	}
	
	public Extras clickRiceAddToOrder() {
		clickByXpath(prop.getProperty("Extras.RiceAddToOrder.Xpath"));
		return this;	
		
	}
	
	public Extras clickNoodlesAddToOrder() {
		clickByXpath(prop.getProperty("Extras.NoodlesAddToOrder.Xpath"));
		return this;	
		
	}
	
	public Extras clickSauceAddToOrder() {
		clickByXpath(prop.getProperty("Extras.SauceAddToOrder.Xpath"));
		return this;	
		
	}
	
	public CheckOut clickCheckOut() throws InterruptedException {
		clickByXpath(prop.getProperty("Extras.CheckOut.Xpath"));
		//Thread.sleep(3000);
		return new CheckOut();	
		
	}
	
	public Extras clickQuinoaAddToFavorite() {
		clickByXpath(prop.getProperty("Extras.QuinoaFavorite.Xpath"));
		return this;	

		}
	
	public Extras getTotal() {
		getTextByXpath(prop.getProperty("Extras.Total4.Xpath"));
		return new Extras();	
		
	}
	
	public Extras verifyMenuQuantity(String data) {
		verifyTextByXpath(prop.getProperty("Extras.MenuQuantity.Xpath"), data);
		return this;
	}
	
	public Extras verifyPartyMenuQuantity(String data) {
		verifyTextByXpath(prop.getProperty("Extras.PartyMenuQuantity.Xpath"), data);
		return this;
	}
	
	public Extras verifyExtrasQuantity(String data) {
		verifyTextByXpath(prop.getProperty("Extras.ExtrasQuantity.Xpath"), data);
		return this;
	}
	
	public Extras verifyExtras(String data) {
		verifyTextContainsByXpath(prop.getProperty("Extras.Extras.Xpath"), data);
		return this;
	}
	
}
