package org.maven.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MavenClass {
	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");



WebElement txtpass = driver.findElement(By.id("email"));
txtpass.sendKeys("gayathri");


 WebElement txtid = driver.findElement(By.id("pass"));
txtid.sendKeys("4678776468647");
 System.out.println("done");
		
	}
	
	
	
	
	
	

}
