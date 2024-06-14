package com.magneto.testcase;

import java.io.IOException;

import org.testng.annotations.Test;

import com.magneto.utilities.ConstantUtils;
import com.magneto.utilities.GlobalHooks;
import com.magneto.utilities.Utils;
import com.magnetopageObjects.LoginPage;
import com.magnetopageObjects.WhatsNewPage;


public class TC_WhatsNewPage_009 extends GlobalHooks {

	@Test(description = "Verify whatsnewPage and review submitted ")
	public void whatsNewtReviewSubmittest()throws IOException, InterruptedException {

		       logger.info("Url Is opened");
		       LoginPage loginpage = new LoginPage(driver);
				loginpage.clickonsignInLink();
				
				logger.info("Entered CustomerEmailID");
				loginpage.enteremail(ConstantUtils.CUSTOMER_EMAIL);
				
				logger.info("Entered CustomerPassword");
				loginpage.enterpassword(ConstantUtils.CUSTOMER_PASSWORD);
				
				loginpage.clickonsignInbtn();
				logger.info("Customer loogged in successfully");
		       
				WhatsNewPage whatsNewPage  = new WhatsNewPage(driver);
		       
				whatsNewPage.clickOnwhatsNew();
				whatsNewPage.clickOnshopNewYoga();
				whatsNewPage.clickOneTeesProduct();
				
				whatsNewPage.clickOndetailsTab();
				logger.info("Cliked on detailsTab");
				whatsNewPage.clickOnmoreinformationTab();
				logger.info("Cliked on nformationTab");
				whatsNewPage.clickOnreviewstab();
				logger.info("Cliked on RewiewTab");				
				whatsNewPage.clickOnnickname();
				logger.info("Cliked on Name");
				
				whatsNewPage.clickOnrating();
				logger.info("Cliked on rating");
				
				whatsNewPage.clickOnsummary();
				logger.info("Cliked on summary");
				whatsNewPage.clickOnreview();
				logger.info("Cliked on Rewiew");
				whatsNewPage.clickOnsubmitReview();
				logger.info("Cliked on submitbtn");
				
	Utils.assertTrue(driver, "whatsnewPage and review submitted","review submitted successsfully","review submitted failed", whatsNewPage.getReviewSuccesstext().contains("You submitted your review for moderation."));

				
      }
	
}
