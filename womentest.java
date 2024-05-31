package testBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageobject.women;

public class womentest {
WebDriver driver;
women wm;
@BeforeClass
void setup()
{
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://magento.softwaretestingboard.com/");
}
	@Test
	void test1()
	{
		wm.ww();
	}
	@Test
	void test2()
	{
		wm.ww1();
	}
	@Test
	void test4()
	{
		wm.ww2();
	}
	@AfterClass
	void test3()
	{
		wm.ww3();
	}
}
