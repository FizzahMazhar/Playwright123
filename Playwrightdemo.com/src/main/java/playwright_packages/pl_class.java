package playwright_packages;

import java.util.regex.Pattern;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.AriaRole;

public class pl_class {

	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * 
	 * Playwright playwright=Playwright.create();
	 * 
	 * Browser browser= playwright.chromium().launch(new
	 * BrowserType.LaunchOptions().setHeadless(false)); BrowserContext brconext=
	 * browser.newContext(); Page page= brconext.newPage();
	 * page.navigate("https://www.ebay.com/");
	 */

	// Opened one website, cover all scenerios, then open next website, cover all
	// scenerios, then close 2nd website.
	// When close 1st website, the chrome closed, and code also closed.
	public static void main(String[] args) {
		try (Playwright playwright = Playwright.create()) {
			Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
			BrowserContext context = browser.newContext();
			Page page = context.newPage();
			page.navigate("https://www.arlo.com/asia/");
			page.getByRole(AriaRole.NAVIGATION)
					.getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("Products")).click();
			page.getByRole(AriaRole.NAVIGATION)
					.getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("Secure Plans")).click();
			page.getByRole(AriaRole.BANNER).getByRole(AriaRole.NAVIGATION)
					.getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("Accessories")).click();
			page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("My Arlo").setExact(true)).click();
			page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Create Account")).click();
			page.locator("#firstNameArlo").click();
			page.locator("#firstNameArlo").press("Tab");
			page.locator("#lastNameArlo").fill("F");
			page.locator("#lastNameArlo").press("CapsLock");
			page.locator("#lastNameArlo").fill("");
			page.locator("#firstNameArlo").click();
			page.locator("#firstNameArlo").fill("F");
			page.locator("#firstNameArlo").press("CapsLock");
			page.locator("#firstNameArlo").fill("Fizzah");
			page.locator("#lastNameArlo").click();
			page.locator("#lastNameArlo").fill("M");
			page.locator("#lastNameArlo").press("CapsLock");
			page.locator("#lastNameArlo").fill("Mazhar");
			page.locator("#emailArlo").fill("f");
			page.locator("#mat-mdc-form-field-label-16").getByText("Email Address").click();
			page.locator("#emailArlo").fill("fizzah@plumlogix.com");
			page.locator("#mat-mdc-form-field-label-18").getByText("Confirm New Email Address").click();
			page.locator("#confirmEmailArlo").fill("fizzah@plimlogix.com");
			page.locator("#passwordArlo").click();
			page.locator("#passwordArlo").press("CapsLock");
			page.locator("#passwordArlo").fill("M");
			page.locator("#passwordArlo").press("CapsLock");
			page.locator("#passwordArlo").fill("Mcs12345@");
			page.locator("#confirmPasswordArlo").click();
			page.locator("#confirmPasswordArlo").fill("M");
			page.locator("#confirmPasswordArlo").press("CapsLock");
			page.locator("#confirmPasswordArlo").fill("Mcs12345@");
			page.getByText("Keep me up-to-date on the latest news, support, and more from Arlo.").click();
			page.locator("#termsAndConditionsArlo div")
					.filter(new Locator.FilterOptions().setHasText("I understand and agree to the Terms of Service."))
					.click();
			page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^Continue$"))).click();
			page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^Continue$")))
					.dblclick();
			page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^Continue$")))
					.dblclick();
			page.locator("#confirmEmailArlo").click();
			page.locator("#confirmEmailArlo").dblclick();
			page.locator("#confirmEmailArlo").click();
			page.locator("#confirmEmailArlo").click();
			page.locator("#confirmEmailArlo").dblclick();
			page.locator("#confirmEmailArlo").fill("fizzah@plumlogix.com");
			page.locator("#confirmEmailArlo").press("Enter");
			page.locator("#confirmEmailArlo").press("Enter");
			page.getByLabel("NEXT").click();
			page.getByLabel("NEXT").click();
			page.navigate("https://www.arlo.com/asia/#");
			page.navigate("https://www.arlo.com/asia/");
			Page page1 = context.newPage();
			page1.navigate(
					"https://www.google.com/search?q=ebay&oq=ebay&gs_lcrp=EgZjaHJvbWUyBggAEEUYOdIBCDE4MDVqMGoxqAIAsAIA&sourceid=chrome&ie=UTF-8");
			page1.getByRole(AriaRole.LINK,
					new Page.GetByRoleOptions()
							.setName("eBay: Electronics, Cars, Fashion, Collectibles & More eBay https://www.ebay.com"))
					.click();
			page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Shop by category")).click();
			page1.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Your shopping cart")).click();
			page1.getByLabel("Account").locator("div").filter(new Locator.FilterOptions().setHasText("Notification"))
					.click();
			page1.close();
		}
	}
}