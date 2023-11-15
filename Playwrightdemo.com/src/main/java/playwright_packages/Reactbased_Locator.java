package playwright_packages;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Reactbased_Locator {
//Components, Profiler is used in react based
	// -> lambda
	public static void main(String[] args) {
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		BrowserContext brcontext = browser.newContext();
		Page page = brcontext.newPage();
		page.navigate("https://www.netflix.com/pk/");
		page.locator("input[name='email']").first().fill("fizza@gmail.com");
		//page.keyboard().press("Enter");
	}
}
