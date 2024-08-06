package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Testcases.baseclass;


//by locators
//methods or actions

public class PageObj_loginpage {
	
	WebDriver driver;
	
	public PageObj_loginpage(WebDriver driver){     //constructor
		this.driver=driver; // assign value to the driver
		PageFactory.initElements(driver, this); // initilising page factory
	}
		
	@FindBy(id="email")// page factory method - by locators
	WebElement email; // webelement is named as username
	
	@FindBy(name="password")
	WebElement pwd;
	
	@FindBy(xpath="//input[@value='Sign Up']")
	WebElement loginbtn;
	
	//setup Actions or method create
public void setEmail(String uname) {   //parametrized method, setting name for username
	email.sendKeys(uname);
}
public void setpasswrd(String pswd) {   //parametrized method
	pwd.sendKeys(pswd);
}
public void clicklgnbtn() {   //parametrized method
	loginbtn.click();
}
}



