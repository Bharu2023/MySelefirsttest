package Testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.PO_loginpage;



public class TC_001_Loginpage extends baseclass{ 
	
@Test
public void logintest() throws InterruptedException {     // 
	
	driver.get(baseurl);
	driver.findElement(By.xpath("//button[@id='details-button']")).click();
	driver.findElement(By.xpath("//a[@id='proceed-link']")).click();
	PO_loginpage lp = new PO_loginpage(driver); // to call the method from Page object, we need to create a object and call the methods
	Thread.sleep(5000);
	lp.setUname(username); // now calling methods form page object and giving the variables name from base class
	lp.setpasswrd(password);
	lp.clicklgnbtn();
	
	if(driver.getTitle().equals("Welcome to Andromeda"))
			Assert.assertTrue(true); //assertion are to verify text from the application
	else {
	Assert.assertTrue(false);
	}
}
}


