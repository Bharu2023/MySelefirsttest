package Testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.PO_loginpage;
import pageObject.PageObj_loginpage;



public class TC_002_Loginpage extends baseclass{ 
	
	PageObj_loginpage lp = new PageObj_loginpage(driver); // to call the method from Page object, we need to create a object and call the methods

	
@Test
public void logintest() throws InterruptedException {     // 
	
	driver.get(baseurl);
	lp.setEmail(username); // now calling methods form page object and giving the variables name from base class
	lp.setpasswrd(password);
	lp.clicklgnbtn();
	
	
//	if(driver.getTitle().equals("Welcome to Andromeda"))
//			Assert.assertTrue(true); //assertion are to verify text from the application
//	else {
//	Assert.assertTrue(false);
//	}
}
}


