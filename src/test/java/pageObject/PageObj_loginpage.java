package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


//by locators
//methods or actions

public class PageObj_loginpage {
	
	WebDriver driver;
	
	public PageObj_loginpage(WebDriver driver){     //constructor
		this.driver=driver; // assign value to the driver
		PageFactory.initElements(driver, this); // initilising page factory
	}
		
	@FindBy(id="loginusernameID")// page factory method - by locators
	WebElement username; // webelement is named as username
	
	@FindBy(id="loginpasswordID")
	WebElement pwd;
	
	@FindBy(xpath="//button[contains(@class,'rounded')]")
	WebElement loginbtn;
	
	//setup Actions or method create
public void setUname(String uname) {   //parametrized method, setting name for username
	username.sendKeys(uname);
}
public void setpasswrd(String pswrd) {   //parametrized method
	pwd.sendKeys(pswrd);
}
public void clicklgnbtn() {   //parametrized method
	loginbtn.click();
}
}



