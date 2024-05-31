package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class women {
WebDriver driver;
women(WebDriver driver)
{
	this.driver=driver;
}

//locators

By womn=By.xpath("//ul[@id='ui-id-2']/li[2]/a/span[2]");
By top=By.xpath("//a[@id='ui-id-9']");
By bottom=By.xpath("//a[@id='ui-id-10']//span[contains(text(),'Bottoms')]");
By jakt=By.xpath("//a[@id='ui-id-11']");

//Action method

public void ww()
{
	driver.findElement(womn).click();
}
	
public void ww1()
{
	driver.findElement(top).click();
}
public void ww2()
{
	driver.findElement(jakt).click();
}
public void ww3()
{
	driver.findElement(bottom).click();
}
}
