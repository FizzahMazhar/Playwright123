package playwright_packages;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class BrowserClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Playwright playwright = Playwright.create();
		Browser browser = playwright.webkit().launch(new BrowserType.LaunchOptions().setHeadless(false));
		BrowserContext brcontext = browser.newContext();
		Page page = brcontext.newPage();
		page.navigate("https://www.arlo.com/asia/");
		// when Class, ".", When ID, "#"
		String abc = page.locator("//p[normalize-space()='The best value to get the most out of your cameras.']")
				.textContent();
		System.out.println(abc);
		String ab = page.locator("//h1[normalize-space()='We protect your everything.']").textContent();
		System.out.println(ab);

	}

}
