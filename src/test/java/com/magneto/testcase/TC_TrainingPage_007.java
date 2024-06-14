package com.magneto.testcase;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.magneto.utilities.ConstantUtils;
import com.magneto.utilities.GlobalHooks;
import com.magneto.utilities.Utils;
import com.magnetopageObjects.GearPage;
import com.magnetopageObjects.LoginPage;
import com.magnetopageObjects.TrainingPage;

public class TC_TrainingPage_007 extends GlobalHooks{
	
	    
	    @Test(description = "Verify Training Page title ")
		public void titleverifiedtest()throws IOException, InterruptedException {

			       logger.info("Url Is opened");
			       LoginPage loginpage = new LoginPage(driver);
					loginpage.clickonsignInLink();
					
					logger.info("Entered CustomerEmailID");
					loginpage.enteremail(ConstantUtils.CUSTOMER_EMAIL);
					
					logger.info("Entered CustomerPassword");
					loginpage.enterpassword(ConstantUtils.CUSTOMER_PASSWORD);
					
					loginpage.clickonsignInbtn();
					logger.info("Customer loogeed in successfully");
			       
					TrainingPage trainingPage  = new TrainingPage(driver);
			       		     
					trainingPage.clickOntraining();
					logger.info("training Page opened successfully");
					
				   					
	Utils.assertTrue(driver, "Training Page title verified test","Training Page title verified successsfully","Training Page title verified failed", trainingPage.getTitle().equals("Training"));

       }
}