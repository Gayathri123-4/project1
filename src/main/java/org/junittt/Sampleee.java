package org.junittt;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sampleee {
	
static WebDriver driver;

@BeforeClass
public static void beforeclass() {
WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();

}
 
@AfterClass
public static void afterclass() {
driver.quit();
	
	

}

	@Before
	public void before() {
		
		
		Date d=new Date();
		
		
		System.out.println("Before Time---------------"+d);
		

	}
	
	@After
	public void after() {
		
		
		Date d=new Date();
		System.out.println("After Time-----------------"+d);

	}
	
	@Test  //valid username and password
	public void test1() {
		driver.get("http:www.facebook.com/");
		WebElement txtuser = driver.findElement(By.id("email"));
		txtuser.sendKeys("gayurey0606@gmail.com");
		
	WebElement txtpass = driver.findElement(By.id("pass"));
	txtpass.sendKeys("8667466764");

	WebElement btnclick = driver.findElement(By.name("login"));
	btnclick.click();
	
	
	}
	
	@Test  //invalid username and password
	public void test3() {
		driver.get("http://www.facebook.com/");
		WebElement txtuser1 = driver.findElement(By.id("fffff"));
		txtuser1.sendKeys("chennai");
		
		
		WebElement txtpass2 = driver.findElement(By.id("pass"));
	txtpass2.sendKeys("234567");
	
	WebElement btnclick2 = driver.findElement(By.id("login"));
	btnclick2.click();
	

	}
	@Ignore
	@Test
	public void test2() {
		System.out.println("Test2");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
