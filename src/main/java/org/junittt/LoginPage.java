package org.junittt;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.base.BaseClass;

public class LoginPage extends BaseClass {
	public LoginPage() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="email")
	private WebElement txtuser;
    @FindBy(id="pass")	
    private WebElement txtpassword;
    @FindBy(name="login")	
    private WebElement login;
    
    
	public WebElement getTxtuser() {
		return txtuser;
	}
	public WebElement getTxtpassword() {
		return txtpassword;
	}
	public WebElement btnLogin() {
		return login;
	}	
    
    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
