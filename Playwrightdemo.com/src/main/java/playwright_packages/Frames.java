package playwright_packages;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Frames {
	public static void main(String[] args) {
		Playwright playwright = Playwright.create();

		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		BrowserContext brconext = browser.newContext();
		Page page = brconext.newPage();
		page.navigate("https://plumlogix.com/");
		page.locator("//li[@id='menu-item-10555']//a[normalize-space()='Contact Us']").click();
		page.frameLocator("//iframe[@id='hs-form-iframe-0']").locator("input[name='firstname']").fill("Fizzah");
	}
}
