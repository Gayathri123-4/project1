package org.test.base;

import java.io.File;
import java.sql.Driver;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	
	//--------------------------------browserlaunch-----------------------1
	
	public static  WebDriver chromeLaunch() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		return driver;	
		

	}
	//---------------------------Edgelaunch------------------------2//
	public static WebDriver edgelaunch() {
	WebDriverManager.edgedriver().setup();
	driver=new EdgeDriver();
	return driver;
	

	}
	public static void browserlauncher(String browsername) {
		if (browsername.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			
		} else if(browsername.equalsIgnoreCase("edge"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new EdgeDriver();

		}
	}
	
	
	//----------------------------url-----------------------------------------3
	public static void urlLaunch(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		

	}
	
	//-------------------impwait-----------------------4
	public static void impwait(int sec) {
	driver.manage().timeouts().implicitlyWait(sec,TimeUnit.SECONDS );
	
	}
	public  static void quit() {
		// TODO Auto-generated method stub
driver.quit();
	}
	
	//-------------------------sendkey-------------------5
	public static void sendkeys(WebElement e, String data) {
		e.sendKeys(data);

	}
	
	
	//-------------------------click-----------------6
	public static void Click(WebElement e) {
		e.click();

	}
	
	
	//------------------------GetAtttribute---------------------7
	public static String GetAttrtibute(WebElement e) {
		String title = e.getAttribute("value");
		return title;

	}
	
	//--------------------gettitle-------------------------8
	public static String gettitle() {
		String title = driver.getTitle();
		return title;	
	}
	
	//---------------------------Action---------------------9
	public static void draganddrop(WebElement to, WebElement from) {
		Actions a=new Actions(driver);
		a.dragAndDrop(from, to);
	}
	
	//-------------------click-------------------10
	public static void clickaction() {
		Actions a=new Actions(driver);
		a.click();

	}
	//--------------------------select-------------------------11
	public static void selectbyindex(WebElement e, int index) {
		Select s=new Select(e);
		s.selectByIndex(index);

	}
	
	//-------------------------------frame--------------------------12
	public static void frame(int index) {
		driver.switchTo().frame(index);

	}
	
	//----------------------------simple--------------------------------//13
	public static   void simple() {
		Alert alert = driver.switchTo().alert();
		alert.accept();

	}
//---------------------doubleclick-------------------------//14
	public static void doubleclick() {
		Actions a=new Actions(driver);
		a.doubleClick().perform();
		

	}
	//-----------------------context click-----------------------------//15
	public static void contextclick() {
		Actions a=new Actions(driver);
		a.contextClick().perform();
		

	}
	//-------------------------selectbyvalue------------------------16
	public static void selectbyvalue(WebElement e, String value) {
		Select s=new Select(e);
		s.selectByValue(value);

	}
	
	//------------------------SELECTBY VISIBLETEXT--------------------------//17
public static  void selectbyvisibletext(WebElement e, String text) {
	Select s=new Select(e);
s.selectByValue(text);
	

}
//----------------------ISMULTIPLE-------------------//18
public static String ismultiple(WebElement e){
	Select s=new Select(e);
boolean multiple = s.isMultiple();
	return null;
	

	
}
	//---------------------DESELECT BY VALUEE--------------------------//19
public static void deselectbyvalue(WebElement e, String value) {
	Select s=new Select(e);
	s.deselectByValue(value);

}
	//------------------DESELECT BY INDEX---------------------------//20
public static  void deselectbyindex(WebElement e, int index) {
	Select s=new Select(e);
	s.deselectByIndex(index);
	

}
	//--------------------------DESELECT BY VISIBLETEXT-------------------//21
public static void delectbyvisibletext(WebElement e, String value) {
	Select s=new Select(e);
	s.deselectByVisibleText(value);
	

}
	//----------------------------DESELECT ALL--------------------------//22
public static void deselectbyall(WebElement e) {
	Select s=new Select(e);
	s.deselectAll();
	
}

	//-------------------------------GETALLSELECTED OPTIONS---------------------//23
//public static String allselectedoptions(WebElement e) {
//	Select s=new Select(e);
	//List<WebElement> String = s.getAllSelectedOptions();
	


//-------------------------CONFIRM ALERT---------------------------------//24	
public static void confirmalert() {
	Alert a=driver.switchTo().alert();
	a.accept();
	a.dismiss();
	

}	
	//------------------------SCREENSHOT---------------------------//25
public static void screenshot(String File) {
	TakesScreenshot ts=(TakesScreenshot)driver;
	File from = ts.getScreenshotAs(OutputType.FILE );
	File to = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Selenium2022\\ScreenShot\\"+File +".png");
}
	
	
	//-----------------------------COMMON METHOD TO CLICK ON ANY ELEMENT------------------//26
public static void clickelement(String Xpathvalue) {
	driver.findElement(By.xpath(Xpathvalue)).click();
	

}
	
	//--------------------GETOPTION--------------------//27
//private void getoptions() {
	

//}
//	Select s=new Select(e);
	//List<WebElement> options = s.getOptions();
	
	



	//---------------FRAME DROPDOWM-------------------------//28
	public static void framedropdown(int index, WebElement e) {
		driver.switchTo().frame(index);
		Select s=new Select(e);
		driver.switchTo().defaultContent();
		

	}

//------------------FRAMECHECKBOX-----------------------------29
	public static void framecheckbox(int index, String value) {
		driver.switchTo().frame(index);
		driver.switchTo().frame(value);
		
		

	}
	
	//---------------------WINDOW HANDLING---------------------//30
//	public static void windowhandle() {
	
	//	String oneid= driver.getWindowHandle();
		

	//}
	//--------------------WINDOWHANDLES----------------------------//31
	//public static void windowhandles() {
		
		//Set<String> allid= driver.getWindowHandles();
		

//	}
		
	
	//--------------------JAVASCRIPT EXECUTOR FOR TXTUSERNAME-----------------//32
	public static void javascript(WebElement txtuser) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[1].setAttribute('value')", txtuser);
		

	}
	
//--------------JAVASCRIPTEXECUTOR FOR TXTPASSWORD---------------//33
	public static void javascripttxtpass(WebElement txtpass) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("argument[1].setAttribute('pass')", txtpass);
		

	}
	
	//-------------JAVASCRIPTEXECUTOR FOR BUTTON CLICK---------------//34
	public static void javascriptclick(WebElement  btnlogin) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("argument[0].click", btnlogin);
		

	}
	
	//-----------------JAVASCRIPTEXECUTOR GETATTRIBUTE------------------//36
	public static void jsgetattribute( WebElement s) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String st = s.toString();
		

	}
	
	//--------------------JAVASCRIPTEXECUTOR  FOR SCROLLDOWM--------------------------//37
	public static void jsscrolldown( WebElement down) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("argument[0].scrollIntoView(boolean)", down);
		

	}
	
	//------------------GETCURRENTURL---------------------------//39
	public static String getcurrenturl() {
		String current =  driver.getCurrentUrl();
		return current;
	

	}
	
	
	
	}
	
	
	
	



	
	
	
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


