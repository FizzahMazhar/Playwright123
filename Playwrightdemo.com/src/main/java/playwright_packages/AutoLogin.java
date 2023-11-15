package playwright_packages;

import java.nio.file.Paths;

import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class AutoLogin {
@Test
	public void main() {

		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		BrowserContext brcontext1 = browser.newContext(new Browser.NewContextOptions().setStorageStatePath(Paths.get("applogin.json")));
		Page page = brcontext1.newPage();
		page.navigate("https://ibo--pspdevpro.sandbox.my.salesforce.com/");
		System.out.println("Autologin Done");
	}
}