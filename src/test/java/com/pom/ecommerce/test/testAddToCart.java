package com.pom.ecommerce.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pom.ecommerce.pageobject.PageobjectsAddToCart;
import com.pom.ecommerce.testbase.testBase;

import junit.framework.Assert;

public class testAddToCart extends testBase {
	
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		addtocart=new PageobjectsAddToCart(driver);
	}
	
	@Test
	public void validateAddToCart() throws InterruptedException
	{
		Assert.assertTrue(addtocart.validateAddToCart(driver, searchText, quantity));
	}
	
	@Test
	public void validateAddToCart1() throws InterruptedException
	{
		Assert.assertTrue(addtocart.validateAddToCart(driver, searchText, quantity));
	}
	
	@AfterMethod
	public void tearDownDriver()
	{
		driver.quit();
	}

}
