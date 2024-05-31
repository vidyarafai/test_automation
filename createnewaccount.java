package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class createnewaccount {

	
	WebDriver driver;
	createnewaccount(WebDriver driver)
	{
		this.driver=driver;
	}
	//Locators
	
	By firsnm=By.id("firstname");
	By lastnm=By.id("lastname");
	By email=By.name("email");
	By pass=By.id("password");
	By confpass=By.id("password-confirmation");
	By creatacc=By.xpath("//button[@title='Create an Account']//span[contains(text(),'Create an Account')]");
	
	//Action method
	public void crt1()
	{
		driver.findElement(firsnm).sendKeys("abcd");
		driver.findElement(firsnm).sendKeys("invali");
	}
		
		public void crt2()
		{
			driver.findElement(lastnm).sendKeys("cccvxvxc");
		}
		public void crt3()
		{
			driver.findElement(email).sendKeys("asdf@gmail.com");	
			
		}
		public void crt4()
		{
			driver.findElement(pass).sendKeys("tytr545454");
			
		}
		
		public void crt5()
		{
			driver.findElement(confpass).sendKeys("tytr545454");
		}
		public void crt6()
		{
			driver.findElement(creatacc).click();
		}
		
		
	}
			
	
	
	
	
	
	
	
	





