package playwright_packages;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Reloginwithout_Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub﻿
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		BrowserContext brcontext = browser.newContext();
		Page page = brcontext.newPage();
		page.navigate("https://ibo--pspdevpro.sandbox.my.salesforce.com/");

		page.fill("#username", "fizzah.mazhar@ibo.org.pspdevpro");
		page.fill("#password", "Mcs12345@");
		page.locator("input#Login").click();
		System.out.println("Done");
		brcontext.storageState(new BrowserContext.StorageStateOptions().setPath(Paths.get("applogin.json")));

	}

}
