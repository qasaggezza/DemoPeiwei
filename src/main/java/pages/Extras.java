package pages;

import utils.Reporter; 
import wrappers.PeiweiWrappers;
public class Extras extends PeiweiWrappers {

	public Extras() {
		if(!verifyTitle("Extras | Order | Menu | Pei Wei Asian Diner")); 
			//Reporter.reportStep("This is not Home Page", "FAIL");
	}
	
	public Extras enterWhite(String data) {
		enterByXpath(prop.getProperty("Extras.WRiceQty.XPath"), data);
		return this;	
		
	}
	public Extras clickWRiceAddToOrder() {
		clickByXpath(prop.getProperty("Extras.WRice.XPath"));
		return this;	
		
	}
	
	public Extras enterSnicker(String data) {
		enterByXpath(prop.getProperty("Extras.SnickerdoodleQuantity.XPath"), data);
		return this;	
		
	}
	
	public Extras enterChocoChip(String data) {
		enterByXpath(prop.getProperty("Extras.ChocolateChipCookieQuantity.XPath"), data);
		return this;	
		
	}
	
	public Extras enterSteamedVeg(String data) {
		enterByXpath(prop.getProperty("Extras.SteamedVegetableQuantity.XPath"), data);
		return this;	
		
	}
	
	public Extras clickSnickerAddToOrder() {
		clickByXpath(prop.getProperty("Extras.SnickerdoodleAddToOrder.XPath"));
		return this;	
		
	}
	
	public Extras clickChocoAddToOrder() {
		clickByXpath(prop.getProperty("Extras.ChocolateChipCookieAddToOrder.XPath"));
		return this;	
		
	}
	
	public Extras clickSteamedVegAddToOrder() {
		clickByXpath(prop.getProperty("Extras.SteamedVegetableAddToOrder.XPath"));
		return this;	
		
	}
	
	public CheckOut clickCheckOut() throws InterruptedException {
		clickByXpath(prop.getProperty("Extras.CheckOut.XPath"));
		//Thread.sleep(3000);
		return new CheckOut();	
		
	}
	
	public Extras clickQuinoaAddToFavorite() {
		clickByXpath(prop.getProperty("Extras.quinoaFavorite.XPath"));
		return this;	

		}
	
}
