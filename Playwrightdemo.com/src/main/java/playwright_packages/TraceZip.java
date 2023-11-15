package playwright_packages;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.Tracing;

public class TraceZip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		BrowserContext brcontext = browser.newContext();
		brcontext.tracing().start(new Tracing.StartOptions().setScreenshots(true).setSnapshots(true).setSources(true));

		Page page = brcontext.newPage();
		page.navigate("https://login.salesforce.com/");
		page.fill("#username", "Fizzah@plumlogix.com");
		page.pause();

		page.fill("#password", "Mcs12345@");

		brcontext.tracing().stop(new Tracing.StopOptions().setPath(Paths.get("Trace.zip")));

	}

}
