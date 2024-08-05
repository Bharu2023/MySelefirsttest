package Testcases;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


//base class will have setup and tear down method. test method will be in test case
// use setup and tear down method

public class baseclass { // declaring the variables

	WebDriver driver;
	String baseurl="https://k8s-qa-ai3-b2bf8273a3-862670456.ap-south-1.elb.amazonaws.com/signin";
	String username = "navaneeth+aadmin@akitra.com";
	String password = "Akitra@123";
	
	
	// webdriver initilising
	@BeforeClass
	public void setup() {  // this method will be a part of testcase, but taking constants or reusuable values in base class
		
		//to set the path of the driver for the respective browser, you will need the system.setProperty
		//With the help of setProperty method, server communication can be achieved
		System.setProperty("Webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		//setProperty has two attributes:Name of the property, & property value.Webdriver.chrome.driver is the name of the property
		driver=new ChromeDriver(); //// Creating an object to instantiate the browser driver
		//As soon as you set the system properties, you need to initialize a browser.
	}
		@AfterClass
	public void tearDown() { // this method will be a part of testcase, but taking constants or reusuable values in base class
		driver.quit();
}
}
