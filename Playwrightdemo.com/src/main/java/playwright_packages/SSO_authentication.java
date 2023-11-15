package playwright_packages;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class SSO_authentication {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		BrowserContext brcontext = browser.newContext();
		Page page = brcontext.newPage();
		page.navigate("https://www.arlo.com/asia/");
		String abc = page.locator("//p[normalize-space()='The best value to get the most out of your cameras.']").textContent();
		System.out.println(abc);

		BrowserContext brcontext1 = browser.newContext();
		Page page1 = brcontext1.newPage();
		page1.navigate("https://www.daraz.pk/");

		BrowserContext brcontext11 = browser.newContext();
		Page page11 = brcontext11.newPage();
		page11.navigate("https://www.ebay.com/");

	}
}