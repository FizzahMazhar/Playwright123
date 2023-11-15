package playwright_packages;

import java.util.List;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import junit.framework.Test;

public class Captureall_Links {
	
	public static void main(String[] args)  {
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		BrowserContext brcontext = browser.newContext();
		Page page = brcontext.newPage();
		page.navigate("https://www.daraz.pk/");
		// a refers link "a:visible"(built in command in playwright for links)
		List<String> ab = page.locator("a:visible").allInnerTexts();
		for (int i=0; i<=ab.size(); i++) {
		System.out.println(ab.get(i));

		//page.locator("a:visible").allInnerTexts().forEach(e -> System.out.println(e));
	}
}
}