package org.test;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Addactin {
	static WebDriver driver;
	@BeforeClass
	public static void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saravanan\\Desktop\\Selenium Tasks\\Selenium\\Drivers\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("http://www.adactin.com/HotelApp/");
	    driver.manage().window().maximize();
	}
	@AfterClass
	public static void afterClass() {
		driver.quit();
	}
	@Before
	public void before() {
		Date date=new Date();
		System.out.println(date);
	}
	@After
	public void after() {
		Date date=new Date();
		System.out.println(date);
	}
	@Test
	public void test () {
		Assert.assertTrue("verify url", driver.getCurrentUrl().contains("adactin"));
		Assert.assertTrue("verify Title", driver.getTitle().contains("Hotel Reservation System"));
		
		 WebElement username = driver.findElement(By.id("username"));
			username.sendKeys("manoj1995");
		Assert.assertEquals("verify loginid", "manoj1995", username.getAttribute("value"));
		
			
			WebElement pass = driver.findElement(By.id("password"));
			pass.sendKeys("77ABC8");
			Assert.assertEquals("verify password", "77ABC8", pass.getAttribute("value"));
			
			WebElement login = driver.findElement(By.id("login"));
			login.click();
			Assert.assertTrue("verify login or not", driver.getCurrentUrl().contains("SearchHotel"));
	}
 private void empName() {
	System.out.println("mk");

}
}
