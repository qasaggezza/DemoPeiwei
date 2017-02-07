package pages;

import junit.framework.Assert;
import utils.Reporter;
import wrappers.PeiweiWrappers;
public class Mail extends PeiweiWrappers{

	
	public ResetPwd clickLink() throws InterruptedException {
		clickByXpath(prop.getProperty("Gmail.RefLink.Xpath"));
		switchToLastWindow();
		//Thread.sleep(10000);
		return new ResetPwd();
	}
	
	public Mail verifyText(String data) {
		verifyTextContainsByXpath(prop.getProperty("Gmail.msg4.Xpath"), data);
		return this;
	}
	
	public Mail verifyText1(String data) {
		verifyTextContainsByXpath(prop.getProperty("Gmail.msg2.Xpath"), data);
		return this;
	}
	
	public Mail verifyText2(String data) {
		verifyTextContainsByXpath(prop.getProperty("Gmail.msg1.Xpath"), data);
		return this;
	}
}
