package testBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageobject.Login;

public class Signtest {
	
	WebDriver driver;
	Login lp;
@BeforeClass
	void setup()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://magento.softwaretestingboard.com/");
	}

	
	@Test
	void testsign()
	{
		lp.signpage();
		lp.loginpage("xyz");
		lp.loginpage1("123");
		lp.signin1();
	}
	@AfterClass
	void close()
	{
		driver.close();
	}
	
	
	
	
}
