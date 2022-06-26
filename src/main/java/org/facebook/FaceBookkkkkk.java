package org.facebook;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junittt.LoginPage;
import org.test.base.BaseClass;



public class FaceBookkkkkk extends BaseClass {
	
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
	public void test1() throws InterruptedException {
		LoginPage l=new LoginPage();
		
		urlLaunch("https://www.facebook.com/");

		
		
		Assert.assertTrue("verify url",getcurrenturl().contains("facebook"));

		
		//------------------VERIFY USER NAME ASSERT-------------------//
		sendkeys(l.getTxtuser(), "gayathri");
		Assert.assertEquals("verify username","gayathri",GetAttrtibute(l.getTxtuser()));
		
		//--------------verify password assert---------------//
		sendkeys(l.getTxtpassword(), "9840106846");
		Assert.assertEquals("verify password","9840106846",GetAttrtibute(l.getTxtpassword()));
		
		//------------------after login---------------//
		Click(l.btnLogin());
		Thread.sleep(5000);
		
		Assert.assertTrue("after loginbtn",getcurrenturl().contains(""));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
