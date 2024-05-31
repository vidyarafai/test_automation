package testBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageobject.Homepage;
import pageobject.createnewaccount;

public class createacctest {

	
	WebDriver driver;
	createnewaccount crt;
	@BeforeClass
	void setup()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://magento.softwaretestingboard.com/");
}
	@Test
	void creat()
	{
		crt.crt1();
		crt.crt2();
		crt.crt3();
		crt.crt4();
		crt.crt5();
		crt.crt6();
	}
	
	
	
}
