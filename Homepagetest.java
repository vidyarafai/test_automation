package testBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageobject.Homepage;

public class Homepagetest {

	
	WebDriver driver;
	Homepage hm;
	@BeforeClass
	void setup()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://magento.softwaretestingboard.com/");
}
	
	@Test
	void clk()
	{
		hm.hom1();
	}
	@Test
	void clk1()
	{
	hm.hom2();
	}
	@Test
	void clk2()
	{
		hm.hom3();
	}
	@Test
	void clk3()
	{
		hm.hom4();
	}
	
	@AfterClass
	void close()
	{
		driver.close();
	}
	
}