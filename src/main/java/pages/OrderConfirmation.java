package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utils.Reporter; 
import wrappers.PeiweiWrappers;
public class OrderConfirmation extends PeiweiWrappers {

	public OrderConfirmation() {
		if(!verifyTitle("| Pei Wei Asian Diner"));
			//Reporter.reportStep("This is not Home Page", "FAIL");
	}
	
	public OrderConfirmation verifyMonth(String data) {
		verifyTextContainsByXpath(prop.getProperty("OrderConfirmation.DateTime.Xpath"), data);
	return this;
	}
	
	public OrderConfirmation verifydate(String data) {
		verifyTextContainsByXpath(prop.getProperty("OrderConfirmation.DateTime.Xpath"), data);
	return this;
	}
	
    public OrderConfirmation verifytime(String data) {
  	    verifyTextContainsByXpath(prop.getProperty("OrderConfirmation.DateTime.Xpath"), data);
	return this;	

}
	
    public OrderConfirmation getTotal() {
		getTextByXpath(prop.getProperty("OrderConfirmation.Total.XPath"));
		return this;	
		
	}
    
	public Gmail InvokeGmail1() throws InterruptedException {
		/*System.setProperty("webdriver.chrome.driver", "C://Users/Murugeshwari/Downloads/chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
		 driver.get("https://www.gmail.com");
		 driver.manage().window().maximize();
		 switchToLastWindow();*/
		driver.navigate().to("https://www.gmail.com");
		// Thread.sleep(2000);
		 return new Gmail();
		}
	
	
	
}
