package pages;

import utils.Reporter; 
import wrappers.PeiweiWrappers;
public class MenuAndOrd extends PeiweiWrappers {

	public MenuAndOrd() {
		if(!verifyTitle("Lighter Offerings | Main Menu | Phoenix- Mcdowell | Pei Wei Asian Diner")); 
			//Reporter.reportStep("This is not Home Page", "FAIL");
	}
	
	public MenuAndOrd clickRiceAndNoodle() {
		clickByXpath(prop.getProperty("MenuAndOrder.RiceBowls.XPath"));
		return this;	
		
	}
	
	public MenuAndOrd clickMangolian() {
		clickByXpath(prop.getProperty("MenuAndOrder.Item1.XPath"));
		return this;	
		
	}
	
	public MenuAndOrd clickKungPao() {
		clickByXpath(prop.getProperty("MenuAndOrder.Item2.XPath"));
		return this;	
		
	}
	
	public MenuAndOrd clickHoneySeared() {
		clickByXpath(prop.getProperty("MenuAndOrder.Item3.XPath"));
		return this;	
		
	}
	
	public MenuAndOrd clickSesame() {
		clickByXpath(prop.getProperty("MenuAndOrder.Item4.XPath"));
		return this;	
		
	}
	
	public MenuAndOrd clickPeiWeiSpicy() {
		clickByXpath(prop.getProperty("MenuAndOrder.Item5.XPath"));
		return this;	
		
	}
	
	public MenuAndOrd clickGingerBroccolli() {
		clickByXpath(prop.getProperty("MenuAndOrder.Item6.XPath"));
		return this;	
		
	}
	
	public MenuAndOrd clickThaiDynamite() {
		clickByXpath(prop.getProperty("MenuAndOrder.Item7.XPath"));
		return this;	
		
	}
	
	public MenuAndOrd clickOrangePeel() {
		clickByXpath(prop.getProperty("MenuAndOrder.Item8.XPath"));
		return this;	
		
	}
	
	public MenuAndOrd enterQuantity(String data) {
		enterByXpath(prop.getProperty("MenuAndOrder.Quantity.XPath"), data);
		return this;	
		
	}
	
	public MenuAndOrd clickSize1() {
		clickByXpath(prop.getProperty("MenuAndOrder.Size1.XPath"));
		return this;	
		
	}
	
	public MenuAndOrd clickSize2() {
		clickByXpath(prop.getProperty("MenuAndOrder.Size2.XPath"));
		return this;	
		
	}
	
	public MenuAndOrd clickIngredient() {
		clickByXpath(prop.getProperty("MenuAndOrder.Ingredient1.XPath"));
		return this;	
		
	}
	
	public MenuAndOrd clickIngredient2() {
		clickByXpath(prop.getProperty("MenuAndOrder.Ingredient2.XPath"));
		return this;	
		
	}
	
	public MenuAndOrd clickIngredient3() {
		clickByXpath(prop.getProperty("MenuAndOrder.Ingredient3.XPath"));
		return this;	
		
	}
	
	public MenuAndOrd clickServedWith1() {
		clickByXpath(prop.getProperty("MenuAndOrder.ServedWith1.XPath"));
		return this;	
		
	}
	
	public MenuAndOrd clickServedWith2() {
		clickByXpath(prop.getProperty("MenuAndOrder.ServedWith2.XPath"));
		return this;	
		
	}
	
	public MenuAndOrd clickServedWith3() {
		clickByXpath(prop.getProperty("MenuAndOrder.ServedWith3.XPath"));
		return this;	
		
	}
	
	public MenuAndOrd clickExtras() {
		clickByXpath(prop.getProperty("MenuAndOrder.Extras.XPath"));
		return this;	
		
	}
	
	public MenuAndOrd clickPartyMenu() {
		clickByXpath(prop.getProperty("MenuAndOrder.PartyMenu.XPath"));
		return this;	
		
	}
	
	public MenuAndOrd clickAddToOrder() {
		clickByXpath(prop.getProperty("MenuAndOrder.AddtoOrder.XPath"));
		return this;	
		
	}
	
	public MenuAndOrd clickKeepLooking() {
		clickByXpath(prop.getProperty("MenuAndOrder.KeepLooking.XPath"));
		return this;	
		
	}
	
	public Extras clickCheckOut() {
		clickByXpath(prop.getProperty("MenuAndOrder.CheckOut.XPath"));
		return new Extras();	
		
	}
	
}
