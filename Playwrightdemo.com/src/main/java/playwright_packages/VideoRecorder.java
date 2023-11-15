package playwright_packages;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class VideoRecorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		BrowserContext browserContext = browser.newContext(new Browser.NewContextOptions().setRecordVideoDir(Paths.get("Video123/")));
		Page page = browserContext.newPage();
		page.navigate("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		Locator loc = page.locator("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//p//select");
		loc.selectOption("Australia");
		page.close();
	}

}
