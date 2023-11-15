package playwright_packages;

import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Salesforce {
@Test(invocationCount=4)
	public  void ab() {
	Playwright playwright = Playwright.create();
	Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
	BrowserContext brcontext = browser.newContext();
	Page page = brcontext.newPage();
	page.navigate("https://curious-panda-v7px3c-dev-ed.trailblaze.my.salesforce.com/");
	page.locator("input[name='username']").fill("fizzahmazhar12@curious-panda-v7px3c.com");
	page.locator("input[id='password']").fill("Mcs12345@");
	page.locator("input[id='Login']").click();
	page.locator("a:has-text('Accounts')").first().click();
	page.locator("input[title='New']").click();
	page.locator("input[id='acc2']").fill("Test 01");
	page.locator("input[id='acc5']").fill("012228");
	Locator loc = page.locator("select[id='acc6']");
	loc.selectOption("Other");
	page.locator("input[name='save']").first().click();
	page.close();
	}

@Test(invocationCount=4)
    public void abc()  {
	Playwright playwright = Playwright.create();
	Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
	BrowserContext brcontext = browser.newContext();
	Page page = brcontext.newPage();
	page.navigate("https://curious-panda-v7px3c-dev-ed.trailblaze.my.salesforce.com/");
	page.locator("input[name='username']").fill("fizzahmazhar12@curious-panda-v7px3c.com");
	page.locator("input[id='password']").fill("Mcs12345@");
	page.locator("input[id='Login']").click();
	page.locator("a:has-text('Contacts')").first().click();
	page.locator("input[title='New']").click();
	page.locator("input[name='name_firstcon2']").fill("Test Contact");
	page.locator("input[id='name_lastcon2']").fill("01");
	page.locator("input[id='00NDn00000GZ1bT']").fill("100");
	page.locator("input[name='save']").first().click();
}
}

	
	
		
	
	
	
	
