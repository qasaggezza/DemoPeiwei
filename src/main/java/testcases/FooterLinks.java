package testcases;
import org.testng.annotations.Test;


import pages.HomePage;
// import pages.Login;
//import pages.Register;
import wrappers.PeiweiWrappers;

import org.testng.annotations.BeforeClass;

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
	.clickMedia()
	.clickLogo()
	.clickPrivacy()
	.clickLogo()
	.clickTerms()
	.clickLogo();
	System.out.println("success");
	
    
	}
@BeforeClass
public void beforeClass() {
//dataSheetName="PW003";
browserName="chrome";
testCaseName="FooterLinks";
testDescription="User Logging in using POM";
}

}
