package pages;


	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import utils.Reporter; 
	import wrappers.PeiweiWrappers;
	public class HomePage extends PeiweiWrappers {

		public HomePage() {
			if(!verifyTitle("Home | Pei Wei Asian Diner")) ;
				//Reporter.reportStep("This is not Home Page", "FAIL");
		}
			
		public Register clickRegister() throws InterruptedException {
		//Thread.sleep(5000);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			clickByLink(prop.getProperty("Home.Register.linktext"));
			return new Register();		
		}

		public HomePage clickLogin() throws InterruptedException {
			//Thread.sleep(3000);
			clickByLink(prop.getProperty("Home.Login.linktext"));
			return this;
			
		}

		public HomePage enterEmailaddresslogin(String data) {
			enterById(prop.getProperty("Login.emailaddress.id"), data);
			return this;
		}

		public HomePage enterPassword(String data) {
			enterById(prop.getProperty("Login.password.id"), data);
			return this;
		}
		
		public HomePage clickForgotPwd() {
			clickByLink(prop.getProperty("Login.forgotpassword.linktext"));
			return this;
		}
		
		public HomePage clickSubmit2() throws InterruptedException {
			clickByXpath(prop.getProperty("Login.submit.Xpath"));
			//Thread.sleep(10000);
			return this;
		}
		
		public AccountOverview clickSubmit() throws InterruptedException {
			clickByXpath(prop.getProperty("Login.submit.Xpath"));
			//Thread.sleep(5000);
			return new AccountOverview();
		}

		public HomePage enterChangeLoc(String loc) throws InterruptedException {
			enterByXpath(prop.getProperty("Home.Location.Xpath"), loc);
			//Thread.sleep(2000);
			return this;
		}
		
		public HomePage clickSearch() throws InterruptedException {
			clickByXpath(prop.getProperty("Home.Search.Xpath"));
			//Thread.sleep(3000);
			return this;
		}
		
		public HomePage clickP2labs() throws InterruptedException {
			clickByXpath(prop.getProperty("Home.P2labs.Xpath"));
			//Thread.sleep(2000);
			return this;
		}
		
		public MenuAndOrd clickMenuAndOrd() {
			clickByXpath(prop.getProperty("Home.MenuAndOrd.Xpath"));
			return new MenuAndOrd();
			
			}
		
		public Gmail InvokeGmail2() throws InterruptedException {
			/*System.setProperty("webdriver.chrome.driver", "C://Users/Murugeshwari/Downloads/chromedriver.exe");
		     WebDriver driver = new ChromeDriver();
			 driver.get("https://www.gmail.com");
			 driver.manage().window().maximize();
			 switchToLastWindow();*/
			driver.navigate().to("https://www.gmail.com");
			 //Thread.sleep(2000);
			 return new Gmail();
			}
		
		public FB clickFacebook() throws InterruptedException {
			clickByXpath(prop.getProperty("Home.Facebook.Xpath"));
			switchToLastWindow();
			//Thread.sleep(5000);
			return new FB();
		}
		
		public Twitter clickTwitter() throws InterruptedException {
			clickByXpath(prop.getProperty("Home.twitter.Xpath"));
			switchToLastWindow();
			//Thread.sleep(5000);
			return new Twitter();
		}
		public Pinterest clickPinterest() throws InterruptedException {
			clickByXpath(prop.getProperty("Home.Pinterest.Xpath"));
			switchToLastWindow();
			//Thread.sleep(5000);
			return new Pinterest();
		}
		public Googleplus clickGoogleplus() throws InterruptedException {
			clickByXpath(prop.getProperty("Home.Googleplus.Xpath"));
			switchToLastWindow();
			//Thread.sleep(5000);
			return new Googleplus();
		}
		public Instagram clickInstagram() throws InterruptedException {
			clickByXpath(prop.getProperty("Home.Instagram.Xpath"));
			switchToLastWindow();
			//Thread.sleep(5000);
			return new Instagram();
		}
		
		public Contactus clickContactus() throws InterruptedException {
			clickByXpath(prop.getProperty("Home.Contactus.Xpath"));
			//Thread.sleep(5000);
			return new Contactus();
		}
		public Sitemap clickSitemap() throws InterruptedException {
			clickByXpath(prop.getProperty("Home.Sitemap.Xpath"));
			//Thread.sleep(5000);
			return new Sitemap();
		}
		public AllLoc clickAllloc() throws InterruptedException {
			clickByXpath(prop.getProperty("Home.Allloc.Xpath"));
			//Thread.sleep(5000);
			return new AllLoc();
		}
		public Careers clickCareers() throws InterruptedException {
			clickByXpath(prop.getProperty("Home.Careers.Xpath"));
			switchToLastWindow();
			//Thread.sleep(5000);
			return new Careers();
		}
		public PeiweiLocal clickPeiweilocal() throws InterruptedException {
			clickByXpath(prop.getProperty("Home.Peiweilocal.Xpath"));
			//Thread.sleep(5000);
			return new PeiweiLocal();
		}
		public Investors clickInvestors() throws InterruptedException {
			clickByXpath(prop.getProperty("Home.Investors.Xpath"));
			switchToLastWindow();
			//Thread.sleep(5000);
			return new Investors();
		}
		public Media clickMedia() throws InterruptedException {
			clickByXpath(prop.getProperty("Home.Media.Xpath"));
			//Thread.sleep(5000);
			return new Media();
		}
		public PrivacyPolicy clickPrivacy() throws InterruptedException {
			clickByXpath(prop.getProperty("Home.Privacy.Xpath"));
			//Thread.sleep(5000);
			return new PrivacyPolicy();
		}
		public Terms clickTerms() throws InterruptedException {
			clickByXpath(prop.getProperty("Home.Terms.Xpath"));
			//Thread.sleep(5000);
			return new Terms();
		}
	
		public GlobalInvestments clickGlobalInvestments() throws InterruptedException {
			clickByXpath(prop.getProperty("Home.GlobalInvestments.Xpath"));
			//Thread.sleep(5000);
			return new GlobalInvestments();
		}
		
		public GiftCard clickGiftcard(){
			clickByXpath(prop.getProperty("AccountOverview.Giftcards.Xpath"));
			return new GiftCard();
		}
		
		
		
	}

