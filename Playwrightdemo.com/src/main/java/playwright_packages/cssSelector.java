package playwright_packages;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class cssSelector {

	public static void main(String[] args) {
		Playwright playwright = Playwright.create();

		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		BrowserContext brconext = browser.newContext();
		Page page = brconext.newPage();
		page.navigate("https://www.ebay.com/");
		page.locator("span:has-text('Sign in'), span:has-text('Log in')").first().click();
	}
}
