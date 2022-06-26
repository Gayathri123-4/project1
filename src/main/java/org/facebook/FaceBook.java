package org.facebook;


import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junittt.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SendKeysAction;
import org.test.base.BaseClass;

public class FaceBook extends BaseClass{
	
@BeforeClass
public static void beforeclass() {
	chromeLaunch();
	impwait(20);
	
	

}
	
@AfterClass
public  static void afterclass() {
	quit();
	
}
	
@Before
public void before() {
	Date d=new Date();
	System.out.println("BEFORE TIME-----------------"+d);


}
@After
public  void after() {
	Date d=new Date();
	System.out.println("AFTER TIME-------------------"+d);

}
@Test
public void test1( )  {
	LoginPage l=new LoginPage();
	urlLaunch("https://www.facebook.com/");
	sendkeys(l.getTxtuser(), "Gayathri");
	sendkeys(l.getTxtpassword(), "9840106846");
Click(l.btnLogin());
	
}

@Ignore
@Test
public void test2() {
	System.out.println("Test2");

}




















	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
