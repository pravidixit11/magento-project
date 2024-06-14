package com.magneto.testcase;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.Test;

import com.magneto.utilities.ConstantUtils;
import com.magneto.utilities.GlobalHooks;
import com.magneto.utilities.Utils;
import com.magnetopageObjects.CreateAnAccountPage;
import com.magnetopageObjects.HomePage;
import com.magnetopageObjects.LoginPage;
import com.magnetopageObjects.MenPage;

public class TC_HomePage_002 extends GlobalHooks{
	
	private static String searchValue = "tops";
	
	@Test(description = "Verify homePage title")
	public void HomePageverify() {

		logger.info("Url Is opened");
		HomePage homePage = new HomePage(driver);
		logger.info("title verified");
	    assertEquals(homePage.getTitle(), "Home Page");
	}
		
	
	@Test(description = "Verify SignOut")
	public void SignOutVerify() throws IOException{

		  logger.info("Url Is opened");
	       LoginPage loginpage = new LoginPage(driver);
			loginpage.clickonsignInLink();
			
			logger.info("Entered CustomerEmailID");
			loginpage.enteremail(ConstantUtils.CUSTOMER_EMAIL);
			
			logger.info("Entered CustomerPassword");
			loginpage.enterpassword(ConstantUtils.CUSTOMER_PASSWORD);
			
			loginpage.clickonsignInbtn();
			logger.info("Customer loogged in successfully");
	       			       
			HomePage homePage = new HomePage(driver);
			homePage.clickondropdown();
			logger.info("clicked on dropdown");
			homePage.clickonsignout();
			logger.info("Clicked on signout");
		
Utils.assertTrue(driver, "SignOut Verification test","SignOut Verification successfully","SignOut Verification failed", homePage.getsuccessSignoutText().equals("You are signed out"));

	}
	
	
	@Test(description = "Verify search entire store here")
	public void SearchEntireStorebtn()throws IOException {
		
		logger.info("Url Is opened");
		HomePage homePage = new HomePage(driver);
		homePage.clickonsearchbtn();
		logger.info("Entered searchValue");
		homePage.entervalue(searchValue);
		homePage.enterclick();
			
		Utils.assertTrue(driver, "search entire store here test","Getting Search value successfully","Search value failed", homePage.getSearchvalueText().equals("Search results for: 'tops'"));
	}

	@Test(description = "Verify ShopNewYogaButton")
	public void ShopNewYogabtn()throws IOException {
		
		logger.info("Url Is opened");
		HomePage homePage = new HomePage(driver);
		homePage.clickonshopyoga();
			
		Utils.assertTrue(driver, "Shop New Yoga Button test","New Yoga collection page open successfully","New Yoga collection page open failed", homePage.getshopyogaText().equals("New Luma Yoga Collection"));
	}
}