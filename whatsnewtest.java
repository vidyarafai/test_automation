package testBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageobject.whatsnew;

public class whatsnewtest {
	WebDriver driver;
	whatsnew wht;
	@BeforeClass
	void setup()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://magento.softwaretestingboard.com/");
	}
	
	@Test
	void test()
	{
		wht.wht();
	}
	@Test
	void test1()
	{
		wht.prdt();
	}
}
