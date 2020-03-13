package com.bitm.LearnAdvanceSelenium.AdvanceSelenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UploadDownloadFileTest {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\imran\\Desktop\\SeleniumFiles\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//Upload File
		
		
		  driver.get("http://demo.guru99.com/test/upload/");
		  driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]")).sendKeys(
		  "D:\\index.html");
		  driver.findElement(By.xpath("//*[@id=\"terms\"]")).click();
		  driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();
		  System.out.println("File Uploaded Successfully!!");
		 
		// Download A File
		
		driver.get("http://demo.guru99.com/test/yahoo.html");
		WebElement downloadbutton = driver.findElement(By.xpath("//*[@id=\"messenger-download\"]"));
		String sourcelocation = downloadbutton.getAttribute("href");
		String wgetcommand = "cmd /c D:\\Wget\\wget.exe -P D: --no-check-certificate "+sourcelocation;
		try {
			Process exec = Runtime.getRuntime().exec(wgetcommand);
			int exitvalue = exec.waitFor();
			System.out.println("Exit value: " + exitvalue);
			System.out.println("File Has Been Downloaded!!");
			
		} catch (InterruptedException ex) {
			System.out.println(ex.toString());
		}
	}
}
