package playwright_packages;

import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class PickList {

@Test
/*
 * @Severity(SeverityLevel.CRITICAL)
 * 
 * @Description("asasass")
 */
	public void main123() {
	
		// TODO Auto-generated method stub
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		BrowserContext brcontext = browser.newContext();
		Page page = brcontext.newPage();
		page.navigate("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		Locator loc = page.locator("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//p//select");
		loc.selectOption("Australia");
		loc.allInnerTexts().forEach(e->System.out.println(e));

	}
}






