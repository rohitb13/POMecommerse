package com.pom.ecommerce.implementation;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ImplementationAction {
	
	public void click(WebElement element)
	{
		element.click();
	}
	
	public void setText(WebElement element, String txt)
	{
		element.sendKeys(txt);
	}
	
	public void clear(WebElement element)
	{
		element.clear();
	}
	
	public void selectVisibleText(WebElement selectquantity, String quantity)
	{
		Select s = new Select(selectquantity);
		s.selectByValue(quantity);
		
	}
	
	public void enter(WebElement element)
	{
		element.sendKeys(Keys.ENTER); 
	}
	
	public void refresh(WebDriver driver)
	{
		driver.navigate().refresh();
	}
	
	
	
	public boolean validateText(WebDriver driver, WebElement element, String expectedText)
	{
		String cartvalue=element.getText();
		if(cartvalue.equals(expectedText))
		{
			return true;
		}
		return false;
		
	}

}
