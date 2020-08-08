package com.pom.ecommerce.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pom.ecommerce.implementation.ImplementationAction;



public class PageobjectsAddToCart {
	
	ImplementationAction action;
	public PageobjectsAddToCart(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		action=new ImplementationAction();
	}
	
	@FindBy(xpath="//*[@id=\"twotabsearchtextbox\"]")
	WebElement searchbox;
	
	@FindBy(xpath="//*[@id=\"nav-search-submit-text\"]/input")
	WebElement searchbutton;
	
	@FindBy(xpath="//img[contains(@src,\"https://m.media-amazon.com/images/I/81sXUUDmoRL._AC_UL320_.jpg\")]")
	WebElement selectmask;
	
	@FindBy(xpath="//*[@id=\"quantity\"]")
	WebElement selectquantity;
	
	@FindBy(xpath="//*[@id=\"add-to-cart-button\"]")
	WebElement addcartbutton;
	
	@FindBy(xpath="//*[@id=\"nav-cart-count\"]")
	WebElement cart;
	
	public boolean validateAddToCart(WebDriver driver,String searchtext, String quantity) throws InterruptedException
	{
		action.setText(searchbox, searchtext);
		action.enter(searchbox);
		action.click(selectmask);
		action.selectVisibleText(selectquantity, quantity);
		action.click(addcartbutton);
		action.click(cart);
		Thread.sleep(2000);
		return action.validateText(driver, cart, "2");
		
	}
	

}
