package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.JavascriptExecutor;

//by locators
//methods or actions

public class PageObj_Signup {
	
	WebDriver driver; // this is class variable
	
	public PageObj_Signup(WebDriver driver){     //constructor and variable driver parameter is passed
		this.driver=driver; //so class and locall variable has the same name so "this"keyword is used. 
		PageFactory.initElements(driver, this);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollTo(0, document.body.scrollHeight)");// initilising page factory
	}
	
	@FindBy(xpath="//a[normalize-space()='Sign In']")// page factory method - by locators
	WebElement signin;
	@FindBy(xpath="//*[@id=\"page\"]/div[2]/div/div/div/div/form/div[5]/div[3]/a")
	WebElement signup;
	
	@FindBy(xpath="//input[@placeholder='First Name']")// page factory method - by locators
	WebElement Firstname; // webelement is named as username
	
	@FindBy(xpath="//input[@placeholder='Last Name']")
	WebElement Lastname;
	
	@FindBy(xpath="//input[@placeholder='Email Address']")
	WebElement EmailAddress;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement Password;
	
	@FindBy(xpath="//input[@placeholder='Confirm Password']")
	WebElement CFPassword;
	
	@FindBy(xpath="/html/body/div[2]/div[3]/div[2]/div/label[1][@id=\"recaptcha-anchor-label\"]rd']")
	WebElement recaptcha;
	
	@FindBy(linkText="By clicking Sign up, you agree to our Terms and Conditions")
	WebElement linkText;
	
	@FindBy(xpath="//input[@value='Sign Up']")
	WebElement signupbtn;
	
public void setsignin() {   //parametrized method, setting name for username
		signin.click();
	}

public void setsignup() {   //parametrized method, setting name for username
	signup.click();
}
	//setup Actions or method create
public void setfirstname(String fname) {   //parametrized method, setting name for username
	Firstname.sendKeys(fname);
}
public void setlastname(String lname) {   //parametrized method
	Lastname.sendKeys(lname);
}
public void setemailaddress(String email) {   //parametrized method
	EmailAddress.sendKeys(email);
}
public void setpassword(String pwd) {   //parametrized method
	Password.sendKeys(pwd);
}
public void setcfrmpwd(String cfpwd) {   //parametrized method
	CFPassword.sendKeys(cfpwd);
}
public void setrecaptcha() {   //parametrized method
	CFPassword.click();
}
public void setlinkedtext() {   //parametrized method
	linkText.click();
}
public void setsignupbtn() {   //parametrized method
	signupbtn.click();
}



