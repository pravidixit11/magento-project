package com.magneto.utilities;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class GlobalHooks {
	
	ReadConfig readconfig = new ReadConfig();
	
	public String baseURL= readconfig.getApplicationURL();
	
	public static WebDriver driver;
	public static Logger logger;
	
	@BeforeMethod
	public void setup() {
		 driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.get(baseURL);
		
		logger =Logger.getLogger("MagnetoProject");
		PropertyConfigurator.configure("Log4j.properties");
	}

	@AfterMethod
	public void tearDown() {
	//	driver.close();
	}

	public static void captureScreen( WebDriver driver,String tname) throws IOException{
	  TakesScreenshot ts = (TakesScreenshot)driver;
	  File  src = ts.getScreenshotAs(OutputType.FILE);
	 // File dst = new File("C:\\Users\\USER\\Desktop\\Selenium\\ScreenShot\\ScreenShot.jpeg");
	  File dst = new File("./screenshots/" + tname + ".png");
	  FileHandler.copy(src, dst);
	  System.out.println("Screenshot taken");
	}
}
