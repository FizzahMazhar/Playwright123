package playwright_packages;

import java.nio.file.Paths;

import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class UplaodFile {
	@Test
	public void ab(){

		Playwright playwright = Playwright.create();

		Browser browser = playwright.webkit().launch(new BrowserType.LaunchOptions().setHeadless(false));
		BrowserContext brconext = browser.newContext();
		Page page = brconext.newPage();
		page.navigate("https://the-internet.herokuapp.com/upload");
		page.setInputFiles("#file-upload", Paths.get("C:\\Users\\Fizzah Mazhar\\Desktop/Text.png"));
		page.locator("#file-submit").click();
		System.out.println("File Uploaded");

	}
}
