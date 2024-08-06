package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Readconfig {
	//create object for properties
	Properties pro; // pro is the object for property file
	//create constructor to load the file
	public Readconfig(){      // use java read properties 
		File src = new File ("./Configuration/config.properties"); 
		//src is a variable referring to config properties. "./ "--> refers the home directory
		try { // if the file doesnt have any data or there is a mismatch, there will be exception, so giving in try catch method.
			FileInputStream fis =new FileInputStream(src); // read the file in readmode from conf property file, so inputstream is used
			pro = new Properties();// initiated the pro object
			pro.load(fis);// load is the method where it will all the config properties
		}
		catch (Exception e) {
				System.out.println("Exception is" + e.getMessage());	
			}
	}
	// create method for each variable in the config file and read the data from conf file
		public String getApplicationURL()
		{
			String url = pro.getProperty("baseurl");
			return url;
		}
		public String getEmail()
		{
			String Email = pro.getProperty("Email");
			return Email;
		}
		public String getpassword()
		{
			String password=pro.getProperty("password");
			return password;
		}
		public String getChromedriver()
		{
			String Chromedriver=pro.getProperty("Chromedriver");
			return Chromedriver;
		}
		public String getFirefoxdriver()
		{
			String Firefoxdriver=pro.getProperty("Firefoxdriver");
			return Firefoxdriver;
		}
				
		public String getEdgedriver()
		{
			String Edgedriver=pro.getProperty("Edgedriver");
					return Edgedriver;
		}
	}

