package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class whatsnew {

	WebDriver driver;
	whatsnew(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//Locators
	
	By whtnew=By.xpath("//ul[@id='ui-id-2']/li[1]/a/span");
	By prdct=By.id("product-addtocart-button");
	By moreinfo=By.xpath("//a[@id='tab-label-additional-title']");
	By Reviews=By.xpath("//a[@id='tab-label-reviews-title']");
	
	//methods
	public void wht()
	{
		driver.findElement(whtnew).click();
	}
	public void prdt()
	{
		driver.findElement(prdct).click();
	}
	public void moreinfo()
	{
		driver.findElement(moreinfo).click();
	}
	
	public void review()
	{
		driver.findElement(Reviews).click();
	}
	
	
	
	
	
	
	
	
	
}
