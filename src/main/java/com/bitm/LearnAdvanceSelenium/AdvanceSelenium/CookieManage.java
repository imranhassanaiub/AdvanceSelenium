package com.bitm.LearnAdvanceSelenium.AdvanceSelenium;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookieManage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Imran\\Desktop\\Selenium Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");

		// Capture All cookies from the browser

		Set<Cookie> cookies = driver.manage().getCookies();

		System.out.println("Size of Cookies: " + cookies.size()); // Size of cookies
		for (Cookie cookie : cookies) {
			System.out.println(cookie.getName() + " : " + cookie.getValue());
		}

		// Get specific cookie

		System.out.println(driver.manage().getCookieNamed("session-token"));
		
				
		// Adding new cookies

		Cookie newcookie = new Cookie("Imran", "123456");
		driver.manage().addCookie(newcookie);
		cookies = driver.manage().getCookies();
		System.out.println("Size of Cookies: " + cookies.size()); // Size of cookies
		for (Cookie cookie : cookies) {
			System.out.println(cookie.getName() + " : " + cookie.getValue());
		}
		
		//Delete cookies 
		
		driver.manage().deleteCookie(newcookie);
		cookies = driver.manage().getCookies();
		System.out.println("Size of Cookies: " + cookies.size()); // Size of cookies
		for (Cookie cookie : cookies) {
			System.out.println(cookie.getName() + " : " + cookie.getValue());
		}
		
		//Delete all cookies 
		driver.manage().deleteAllCookies();
		cookies = driver.manage().getCookies();
		System.out.println("Size of Cookies: " + cookies.size()); // Size of cookies
		for (Cookie cookie : cookies) {
			System.out.println(cookie.getName() + " : " + cookie.getValue());
		}
		
	}

}
