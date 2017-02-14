package testcases;
import org.testng.annotations.Test;


import pages.HomePage;
// import pages.Login;
//import pages.Register;
import wrappers.PeiweiWrappers;

import org.testng.annotations.BeforeClass;

//To check whether we are able to click and navigate to the corresponding Footers.

public class FooterLinks extends PeiweiWrappers{
@Test
public void login() throws InterruptedException {

	new HomePage()
	.clickContactus()
	.clickLogo()
	.clickSitemap()
	.clickLogo()
	.clickAllloc()
	.clickLogo()
	.clickCareers()
	.switchback()
	.clickPeiweilocal()
	.clickLogo()
	.clickInvestors()
	.switchback()
	.clickGlobalInvestments()
	.switchback()
	.clickMedia()
	.clickLogo()
	.clickPrivacy()
	.clickLogo()
	.clickTerms()
	.clickLogo();    
	}
@BeforeClass
public void beforeClass() {

browserName="chrome";
testCaseName="FooterLinks";
testDescription="Check Footer Links";
}

}
