package playwright_packages;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Contact {
	public static void main(String[] args)  {

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
