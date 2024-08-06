package Testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.PO_loginpage;
import pageObject.PageObj_Signup;
import pageObject.PageObj_loginpage;



public class TC_001_Signup extends baseclass{ 
	
@Test
public void Signup() throws InterruptedException {     // 
	
	driver.get(baseurl);
	PageObj_Signup SU = new PageObj_Signup(driver);
	SU.setsignin();
	SU.setsignup();
	SU.setfirstname("Bharathi");
	SU.setlastname("Maduraiveeran");
	SU.setemailaddress("maduraiveeran.bharathi@gmail.com");
	SU.setpassword("Testcheck001");
	SU.setcfrmpwd("Testcheck001");
	SU.setrecaptcha();
	SU.setlinkedtext();
	SU.setsignupbtn();
}
}


