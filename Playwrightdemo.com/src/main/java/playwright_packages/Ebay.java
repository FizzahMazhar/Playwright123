package playwright_packages;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Ebay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		BrowserContext brcontext = browser.newContext();
		Page page = brcontext.newPage();
		page.navigate("https://www.ebay.com/");
		//page.locator("a:has-text('register')").first().click();
		//Personal Account
		//page.locator("a:has-text('n')").first().click();
		//page.locator("input[name='firstname']").fill("Shanza");
		//page.locator("input[name='lastname']").fill("Mazhar");
		//page.locator("input[name='Email']").fill("fiz@plumlogix.com");
		//page.locator("input[name='password']").fill("Mcs@2580");
		//page.locator("button:has-text('Create account')").first().click();
		//page.locator("button[name='EMAIL_REG_FORM_SUBMIT']").click();	
		//Business account
		//page.locator("input[name='accountcreate']").last().check();
		//page.locator("input[name='businessName']").fill("Test Business");
		//page.locator("input[name='businessEmail']").fill("business12@gmail.com");
		//page.locator("input[name='bizPassword']").fill("Mcs12345@");
		//Locator loc = page.locator("select[id='businessCountry']");
		//loc.selectOption("Canada");
		//page.locator("input[name='bizOnlyToBuy']").check();
		//page.locator("button:has-text('Create account')").first().click();
		//Add things to Cart
		page.locator("button:has-Text('Electronics')").first().click();
	    
	}

}
