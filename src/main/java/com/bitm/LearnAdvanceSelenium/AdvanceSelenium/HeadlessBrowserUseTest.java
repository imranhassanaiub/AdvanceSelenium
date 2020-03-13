package com.bitm.LearnAdvanceSelenium.AdvanceSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadlessBrowserUseTest {

	public static void main(String[] args) {

		WebDriver htmlunitdriver = new HtmlUnitDriver();
		htmlunitdriver.get("http://www.newtours.demoaut.com");
		htmlunitdriver.findElement(By.xpath(
				"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input"))
				.sendKeys("tutorial");
		System.out.println("Executed through HtmlUnit Driver");

	}

}
