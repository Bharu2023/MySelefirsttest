package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Readconfig {
	//create object for prpeerties
	Properties pro; // pro is the object for property file
	//create constructor
	public Readconfig(){      // use java read properties 
		File src = new File ("/Users/bharathinavaneethakrishnan/eclipse-workspace/Webdriverpractice/Configuration/config.properties"); 
		try {
			FileInputStream fis =new FileInputStream(src); // read date in readmode from conf property file
			pro = new Properties();// initiated the pro object
			
			
			
		}
		catch (Exception e) {
				System.out.println();
				
				
			}
			
				
	}

}
