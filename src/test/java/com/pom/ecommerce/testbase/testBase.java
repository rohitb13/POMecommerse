package com.pom.ecommerce.testbase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

import com.pom.ecommerce.pageobject.PageobjectsAddToCart;
import com.pom.ecommerce.utility.PropertyFileReader;


public class testBase {
	
	protected PropertyFileReader propFile;
	protected String url;
	protected String searchText;
	protected String quantity;

	protected WebDriver driver;
	protected PageobjectsAddToCart addtocart ;
	
	@BeforeTest
	public void setupTest()
	{
			propFile=new PropertyFileReader("qa.properties");
			url=propFile.getValue("url");
			searchText=propFile.getValue("SearchText");
			quantity=propFile.getValue("quantity");
	}
}
