package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
WebDriver driver;
	Login(WebDriver driver)
	
	{
		this.driver=driver;
	}
	//Locators
	
By sign=	By.xpath("//div[@class='panel header']/ul/li[2]/a");
//login[username]
By username=By.name("login[username]");
//login[password]
By pass=By.name("login[password]");
//send
By submit=By.name("send");
//button[@title='Create an Account']//span[contains(text(),'Create an Account')]
By createaccount=By.xpath("//button[@title='Create an Account']//span[contains(text(),'Create an Account')]");
	

//action method
public void signpage() {
	driver.findElement(sign).click();
}
public void loginpage(String newusername)
{
	driver.findElement(username).sendKeys(newusername);
}
public void loginpage1(String newpass)
{
	driver.findElement(pass).sendKeys(newpass);
}
public void signin1()
{
	driver.findElement(submit).click();
}
}
