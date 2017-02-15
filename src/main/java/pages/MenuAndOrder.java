package pages;

import utils.Reporter; 
import wrappers.PeiweiWrappers;
public class MenuAndOrder extends PeiweiWrappers {

	public MenuAndOrder() {
		if(!verifyTitle("Lighter Offerings | Main Menu | Phoenix- Mcdowell | Pei Wei Asian Diner")); 
			//Reporter.reportStep("This is not Home Page", "FAIL");
	}
	
	public MenuAndOrder clickRiceAndNoodle() {
		clickByXpath(prop.getProperty("MenuAndOrder.RiceBowls.Xpath"));
		return this;	
		
	}
	
	public MenuAndOrder clickMangolian() {
		clickByXpath(prop.getProperty("MenuAndOrder.Item1.Xpath"));
		return this;	
		
	}
	
	public MenuAndOrder clickPartyMangolian() {
		clickByXpath(prop.getProperty("MenuAndOrder.PartyMongolian.Xpath"));
		return this;	
		
	}
	
	public MenuAndOrder clickKungPao() {
		clickByXpath(prop.getProperty("MenuAndOrder.Item2.Xpath"));
		return this;	
		
	}
	
	public MenuAndOrder clickHoneySeared() {
		clickByXpath(prop.getProperty("MenuAndOrder.Item3.Xpath"));
		return this;	
		
	}
	
	public MenuAndOrder clickSesame() {
		clickByXpath(prop.getProperty("MenuAndOrder.Item4.Xpath"));
		return this;	
		
	}
	
	public MenuAndOrder clickPeiWeiSpicy() {
		clickByXpath(prop.getProperty("MenuAndOrder.Item5.Xpath"));
		return this;	
		
	}
	
	public MenuAndOrder clickGingerBroccolli() {
		clickByXpath(prop.getProperty("MenuAndOrder.Item6.Xpath"));
		return this;	
		
	}
	
	public MenuAndOrder clickThaiDynamite() {
		clickByXpath(prop.getProperty("MenuAndOrder.Item7.Xpath"));
		return this;	
		
	}
	
	public MenuAndOrder clickOrangePeel() {
		clickByXpath(prop.getProperty("MenuAndOrder.Item4.Xpath"));
		return this;	
		
	}
	
	public MenuAndOrder clickJapeneseSteak() {
		clickByXpath(prop.getProperty("MenuAndOrder.JapaneseSteak.Xpath"));
		return this;	
		
	}
	
	public MenuAndOrder enterQuantity(String data) throws InterruptedException {
		//Thread.sleep(1000);
		enterByXpath(prop.getProperty("MenuAndOrder.Quantity.Xpath"), data);
		return this;	
		
	}
	
	public MenuAndOrder clickSize1() {
		clickByXpath(prop.getProperty("MenuAndOrder.Size1.Xpath"));
		return this;	
		
	}
	
	public MenuAndOrder clickSize2() {
		clickByXpath(prop.getProperty("MenuAndOrder.Size2.Xpath"));
		return this;	
		
	}
	
	public MenuAndOrder clickIngredient() {
		clickById(prop.getProperty("MenuAndOrder.Ingredient1.Id"));
		return this;	
		
	}
	
	public MenuAndOrder clickIngredient2() {
		clickById(prop.getProperty("MenuAndOrder.Ingredient2.Id"));
		return this;	
		
	}
	
	public MenuAndOrder clickIngredient3() {
		clickById(prop.getProperty("MenuAndOrder.Ingredient3.Id"));
		return this;	
		
	}
	
	public MenuAndOrder clickServedWith1() {
		clickByXpath(prop.getProperty("MenuAndOrder.ServedWith1.Xpath"));
		return this;	
		
	}
	
	public MenuAndOrder clickServedWith2() {
		clickByXpath(prop.getProperty("MenuAndOrder.ServedWith2.Xpath"));
		return this;	
		
	}
	
	public MenuAndOrder clickServedWith3() {
		clickByXpath(prop.getProperty("MenuAndOrder.ServedWith3.Xpath"));
		return this;	
		
	}
	
	public MenuAndOrder clickExtras() {
		clickByXpath(prop.getProperty("MenuAndOrder.Extras.Xpath"));
		return this;	
		
	}
	
	public MenuAndOrder clickPartyMenu() {
		clickByLink(prop.getProperty("MenuAndOrder.PartyMenu.Linktext"));
		return this;	
		
	}
	
	public MenuAndOrder clickAddToOrder() throws InterruptedException {
		clickByXpath(prop.getProperty("MenuAndOrder.AddtoOrder.Xpath"));
	    Thread.sleep(1000);
		return this;	
		
	}
	
	public MenuAndOrder clickKeepLooking() {
		clickByXpath(prop.getProperty("MenuAndOrder.KeepLooking.Xpath"));
		return this;	
		
	}
	
	public Extras clickCheckOut() {
		clickByXpath(prop.getProperty("MenuAndOrder.CheckOut.Xpath"));
		return new Extras();	
		
	}
	
}
