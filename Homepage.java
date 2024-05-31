package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage extends BasePage{
	WebDriver driver;
	public Homepage(WebDriver driver)
	{
		super(driver);
	}
	
	//Locators
By	search=By.id("search");
By what=By.xpath("//ul[@id='ui-id-2']/li[1]/a/span");
By women=By.xpath("//ul[@id='ui-id-2']/li[2]/a/span[2]");
By men=By.xpath("//ul[@id='ui-id-2']/li[3]/a/span[2]");
By gear=By.xpath("//ul[@id='ui-id-2']/li[4]/a/span[2]");
	
	//action method
public void hom1()
{
	driver.findElement(search).click();
}
public void hom2()
{
	driver.findElement(men).click();
}
public void hom3() {
	driver.findElement(women).click();
}
public void hom4() {
	driver.findElement(what).click();
}
public void hom5() {
	driver.findElement(gear).click();
}
	
	

}
