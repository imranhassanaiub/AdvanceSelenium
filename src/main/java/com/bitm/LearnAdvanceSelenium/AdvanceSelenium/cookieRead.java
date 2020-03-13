package com.bitm.LearnAdvanceSelenium.AdvanceSelenium;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class cookieRead {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\imran\\Desktop\\SeleniumFiles\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/cookie/selenium_aut.php");
		driver.findElement(By.name("username")).sendKeys("abc123");							
        driver.findElement(By.name("password")).sendKeys("123xyz");							
        driver.findElement(By.name("submit")).click();
		
		//Cookie Read
		
		//// create file named Cookies to store Login Information
		
		File file = new File("Cookies.data");
		
		try {
			file.delete(); // Delete old files if existed
			file.createNewFile();
			FileWriter fileWrite = new FileWriter(file);
			BufferedWriter Bwrite = new BufferedWriter(fileWrite);
			for (Cookie ck : driver.manage().getCookies()) {
				
				Bwrite.write((ck.getName()+";"+ck.getValue()+";"+ck.getDomain()+";"+ck.getPath()+";"+ck.getExpiry()+";"+ck.isSecure()));																									
                Bwrite.newLine();
			}
			Bwrite.close();
			fileWrite.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
