package playwright_packages;

import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class First_LastElement {
	@Test
	public  void main4321() {
		Playwright playwright = Playwright.create();

		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		BrowserContext brconext = browser.newContext();
		Page page = brconext.newPage();
		page.navigate("https://www.ebay.com/");
		// click 1st element
		//page.locator("text= Help & Contact").first().click();
		// click last element
		Locator loc=page.locator("text= Help & Contact").first();
		loc.click();

	}

}