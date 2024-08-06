package Testcases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Utilities.Readconfig;


//base class will have setup and tear down method. test method will be in test case
// use setup and tear down method

public class baseclass { // declaring the variables

	WebDriver driver;
	Readconfig readconfig = new Readconfig(); // to create readconfig obejct to get data from readconfig file
	String baseurl= readconfig.getApplicationURL();
	String username = readconfig.getEmail();
	String password = readconfig.getpassword();
	// webdriver initilising
	@BeforeClass
	public void setup() {  // this method will be a part of testcase, but taking constants or reusuable values in base class
		
		//to set the path of the driver for the respective browser, you will need the system.setProperty
		//With the help of setProperty method, server communication can be achieved
		System.setProperty("Webdriver.chrome.driver",readconfig.getChromedriver());
		//setProperty has two attributes:Name of the property, & property value.Webdriver.chrome.driver is the name of the property
		driver=new ChromeDriver(); //// Creating an object to instantiate the browser driver
		//As soon as you set the system properties, you need to initialize a browser.
	}
		@AfterClass
	public void tearDown() { // this method will be a part of testcase, but taking constants or reusuable values in base class
		driver.quit();
}
}
