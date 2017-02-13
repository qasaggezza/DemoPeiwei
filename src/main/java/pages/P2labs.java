package pages;

import utils.Reporter; 
import wrappers.PeiweiWrappers;
public class P2labs extends PeiweiWrappers {

	
	public MenuAndOrder clickMenuAndOrd() {
		clickByXpath(prop.getProperty("P2labs.MenuAndOrd.Xpath"));
		return new MenuAndOrder();
		
		}
}
