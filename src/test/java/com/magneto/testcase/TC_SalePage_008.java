package com.magneto.testcase;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.magneto.utilities.ConstantUtils;
import com.magneto.utilities.GlobalHooks;
import com.magneto.utilities.Utils;
import com.magnetopageObjects.LoginPage;
import com.magnetopageObjects.SalePage;


public class TC_SalePage_008 extends GlobalHooks {

	  
    @Test(description = "Verify Sale Page title ")
	public void titleVerifiedtest()throws IOException, InterruptedException {

		       logger.info("Url Is opened");
		       LoginPage loginpage = new LoginPage(driver);
				loginpage.clickonsignInLink();
				
				logger.info("Entered CustomerEmailID");
				loginpage.enteremail(ConstantUtils.CUSTOMER_EMAIL);
				
				logger.info("Entered CustomerPassword");
				loginpage.enterpassword(ConstantUtils.CUSTOMER_PASSWORD);
				
				loginpage.clickonsignInbtn();
				logger.info("Customer loogeed in successfully");
		       
				SalePage salePage  = new SalePage(driver);
		       	  			salePage.clickOnSale();
						   					
            Utils.assertTrue(driver, "SalePage verified test","SalePage verified successsfully","SalePage verified failed", salePage.getTitle().equals("Sale"));

   }
        
    @Test(description = "Verify navigation nextbutton functionality ")
  	public void navigationButtontest()throws IOException, InterruptedException {

  		       logger.info("Url Is opened");
  		       LoginPage loginpage = new LoginPage(driver);
  				loginpage.clickonsignInLink();
  				
  				logger.info("Entered CustomerEmailID");
  				loginpage.enteremail(ConstantUtils.CUSTOMER_EMAIL);
  				
  				logger.info("Entered CustomerPassword");
  				loginpage.enterpassword(ConstantUtils.CUSTOMER_PASSWORD);
  				
  				loginpage.clickonsignInbtn();
  				logger.info("Customer loogeed in successfully");
  		       
  				SalePage salePage  = new SalePage(driver);  	
  				logger.info("Clicking on Sale");
  				salePage.clickOnSale();
  							  			   	
  				logger.info("Navigating to women sale page");
                salePage.clickOnsaleWomensDeal();
                
                logger.info("Clicking on next button");
                salePage.clickOnnextbtn(driver); 
                
                Utils.assertTrue(driver, "Next navigation is displayed","Next navigation is not displayed","SalePage verified failed",  salePage.isNextButtonIsPresent());
               
               
                
                  
 //  Utils.assertTrue(driver, "navigation nextbutton functionality test","navigation nextbutton verified successsfully","navigation nextbutton verified failed", salePage.getitemAddedSuccesstext().contains("You a"));

     }
}
