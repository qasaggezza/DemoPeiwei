package pages;

import utils.Reporter; 
import wrappers.PeiweiWrappers;
public class MenuAndOrder extends PeiweiWrappers {

	public MenuAndOrder() {
		if(!verifyTitle("Lighter Offerings | Main Menu | Phoenix- Mcdowell | Pei Wei Asian Diner")); 
			//Reporter.reportStep("This is not Home Page", "FAIL");
	}
	
	public MenuAndOrder clickRiceAndNoodle() {
		clickByXpath(prop.getProperty("MenuAndOrder.RiceBowls.XPath"));
		return this;	
		
	}
	
	public MenuAndOrder clickMangolian() {
		clickByXpath(prop.getProperty("MenuAndOrder.Item1.XPath"));
		return this;	
		
	}
	
	public MenuAndOrder clickKungPao() {
		clickByXpath(prop.getProperty("MenuAndOrder.Item2.XPath"));
		return this;	
		
	}
	
	public MenuAndOrder clickHoneySeared() {
		clickByXpath(prop.getProperty("MenuAndOrder.Item3.XPath"));
		return this;	
		
	}
	
	public MenuAndOrder clickSesame() {
		clickByXpath(prop.getProperty("MenuAndOrder.Item4.XPath"));
		return this;	
		
	}
	
	public MenuAndOrder clickPeiWeiSpicy() {
		clickByXpath(prop.getProperty("MenuAndOrder.Item5.XPath"));
		return this;	
		
	}
	
	public MenuAndOrder clickGingerBroccolli() {
		clickByXpath(prop.getProperty("MenuAndOrder.Item6.XPath"));
		return this;	
		
	}
	
	public MenuAndOrder clickThaiDynamite() {
		clickByXpath(prop.getProperty("MenuAndOrder.Item7.XPath"));
		return this;	
		
	}
	
	public MenuAndOrder clickOrangePeel() {
		clickByXpath(prop.getProperty("MenuAndOrder.Item4.XPath"));
		return this;	
		
	}
	
	public MenuAndOrder clickJapeneseSteak() {
		clickByXpath(prop.getProperty("MenuAndOrder.Item9.XPath"));
		return this;	
		
	}
	
	public MenuAndOrder enterQuantity(String data) throws InterruptedException {
		Thread.sleep(2000);
		enterByName(prop.getProperty("MenuAndOrder.Quantity.name"), data);
		return this;	
		
	}
	
	public MenuAndOrder clickSize1() {
		clickByXpath(prop.getProperty("MenuAndOrder.Size1.XPath"));
		return this;	
		
	}
	
	public MenuAndOrder clickSize2() {
		clickByXpath(prop.getProperty("MenuAndOrder.Size2.XPath"));
		return this;	
		
	}
	
	public MenuAndOrder clickIngredient() {
		clickByXpath(prop.getProperty("MenuAndOrder.Ingredient1.XPath"));
		return this;	
		
	}
	
	public MenuAndOrder clickIngredient2() {
		clickByXpath(prop.getProperty("MenuAndOrder.Ingredient2.XPath"));
		return this;	
		
	}
	
	public MenuAndOrder clickIngredient3() {
		clickByXpath(prop.getProperty("MenuAndOrder.Ingredient3.XPath"));
		return this;	
		
	}
	
	public MenuAndOrder clickServedWith1() {
		clickByXpath(prop.getProperty("MenuAndOrder.ServedWith1.XPath"));
		return this;	
		
	}
	
	public MenuAndOrder clickServedWith2() {
		clickByXpath(prop.getProperty("MenuAndOrder.ServedWith2.XPath"));
		return this;	
		
	}
	
	public MenuAndOrder clickServedWith3() {
		clickByXpath(prop.getProperty("MenuAndOrder.ServedWith3.XPath"));
		return this;	
		
	}
	
	public MenuAndOrder clickExtras() {
		clickByXpath(prop.getProperty("MenuAndOrder.Extras.XPath"));
		return this;	
		
	}
	
	public MenuAndOrder clickPartyMenu() {
		clickByLink(prop.getProperty("MenuAndOrder.PartyMenu.linktext"));
		return this;	
		
	}
	
	public MenuAndOrder clickAddToOrder() throws InterruptedException {
		clickByXpath(prop.getProperty("MenuAndOrder.AddtoOrder.XPath"));
	    Thread.sleep(1000);
		return this;	
		
	}
	
	public MenuAndOrder clickKeepLooking() {
		clickByXpath(prop.getProperty("MenuAndOrder.KeepLooking.XPath"));
		return this;	
		
	}
	
	public Extras clickCheckOut() {
		clickByXpath(prop.getProperty("MenuAndOrder.CheckOut.XPath"));
		return new Extras();	
		
	}
	
}
