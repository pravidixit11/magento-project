package com.magneto.testcase;

import java.io.IOException;

import org.testng.annotations.Test;

import com.magneto.utilities.ConstantUtils;
import com.magneto.utilities.GlobalHooks;
import com.magneto.utilities.Utils;
import com.magnetopageObjects.GearPage;
import com.magnetopageObjects.LoginPage;


public class TC_GearPage_006 extends GlobalHooks {

	@Test(description = "Verify filter options ")
	public void filteroptiontest()throws IOException, InterruptedException {

		       logger.info("Url Is opened");
		       LoginPage loginpage = new LoginPage(driver);
				loginpage.clickonsignInLink();
				
				logger.info("Entered CustomerEmailID");
				loginpage.enteremail(ConstantUtils.CUSTOMER_EMAIL);
				
				logger.info("Entered CustomerPassword");
				loginpage.enterpassword(ConstantUtils.CUSTOMER_PASSWORD);
				
				loginpage.clickonsignInbtn();
				logger.info("Customer loogeed in successfully");
		       
				GearPage gearPage  = new GearPage(driver);
		       		     
				gearPage.clickOngear();
		
				gearPage.clickOnfitnessEquipment();
			      logger.info("clicked on fitnessEquipment");
			
			    gearPage.clickOncategory();
			      logger.info("clicked oncategory");
     		 
			    gearPage.clickOncardio();
			      logger.info("clicked on cardio");
			      
			     boolean result = gearPage.getCategorytext().equals("Category") && gearPage.getCardiotext().equals("Cardio");
				 Utils.assertTrue(driver, "Filter option verified test1","Cardio filter applied successfully","Cardio filter apply failed", result);
			      
			    gearPage.clickOnactivity();
			      logger.info("clicked on activity");
			      
			     gearPage.clickOnsports();
			      logger.info("clicked on sports");
			 
			     boolean result1 = gearPage.getaAtivitytext().equals("Activity") && gearPage.getSportstext().equals("Sports");
				 Utils.assertTrue(driver, "Filter option verified test2","Sports filter applied successfully","Sports filter apply failed", result1);
			
	    }
	
	@Test(description = "Verify Add to cart product using filter ")
	public void Addproductthroughfiltertest()throws IOException, InterruptedException {

		       logger.info("Url Is opened");
		       LoginPage loginpage = new LoginPage(driver);
				loginpage.clickonsignInLink();
				
				logger.info("Entered CustomerEmailID");
				loginpage.enteremail(ConstantUtils.CUSTOMER_EMAIL);
				
				logger.info("Entered CustomerPassword");
				loginpage.enterpassword(ConstantUtils.CUSTOMER_PASSWORD);
				
				loginpage.clickonsignInbtn();
				logger.info("Customer loogeed in successfully");
		       
				GearPage gearPage  = new GearPage(driver);
		       		     
				gearPage.clickOngear();
		
				gearPage.clickOnfitnessEquipment();
			      logger.info("clicked on fitnessEquipment");
			
			    gearPage.clickOncategory();
			      logger.info("clicked oncategory");
     		 
			    gearPage.clickOncardio();
			      logger.info("clicked on cardio");
			      
			     boolean result = gearPage.getCategorytext().equals("Category") && gearPage.getCardiotext().equals("Cardio");
				 Utils.assertTrue(driver, "Filter verified test1","Cardio filter applied successfully","Cardio filter apply failed", result);
			      
			    gearPage.clickOnactivity();
			      logger.info("clicked on activity");
			      
			     gearPage.clickOnsports();
			      logger.info("clicked on sports");
			 
			     boolean result1 = gearPage.getaAtivitytext().equals("Activity") && gearPage.getSportstext().equals("Sports");
				 Utils.assertTrue(driver, "Filter verified test2","Sports filter applied successfully","Sports filter apply failed", result1);
		
				 gearPage.clickOncardioBall();
				 logger.info("clicked on cardioBall");
				 gearPage.clickOnaddtoCart();
			      logger.info("clicked on add to cart");
			      
  Utils.assertTrue(driver, "add product through filter test","product added to cart successsfully","product added to cart failed", gearPage.getaddedSuccesstext().contains("You added Dual Handle Cardio Ball to your shopping cart."));
  			 
  }
	
	@Test(description = "Verify wishlist product using filter ")
	public void wishlistProductthroughfiltertest()throws IOException, InterruptedException {

		       logger.info("Url Is opened");
		       LoginPage loginpage = new LoginPage(driver);
				loginpage.clickonsignInLink();
				
				logger.info("Entered CustomerEmailID");
				loginpage.enteremail(ConstantUtils.CUSTOMER_EMAIL);
				
				logger.info("Entered CustomerPassword");
				loginpage.enterpassword(ConstantUtils.CUSTOMER_PASSWORD);
				
				loginpage.clickonsignInbtn();
				logger.info("Customer loogeed in successfully");
		       
				GearPage gearPage  = new GearPage(driver);
		       		     
				gearPage.clickOngear();
		
				gearPage.clickOnfitnessEquipment();
			      logger.info("clicked on fitnessEquipment");
			
			    gearPage.clickOncategory();
			      logger.info("clicked oncategory");
     		 
			    gearPage.clickOncardio();
			      logger.info("clicked on cardio");
			      
			     boolean result = gearPage.getCategorytext().equals("Category") && gearPage.getCardiotext().equals("Cardio");
				 Utils.assertTrue(driver, "Filter verified test1","Cardio filter applied successfully","Cardio filter apply failed", result);
			      
			    gearPage.clickOnactivity();
			      logger.info("clicked on activity");
			      
			     gearPage.clickOnsports();
			      logger.info("clicked on sports");
			 
			     boolean result1 = gearPage.getaAtivitytext().equals("Activity") && gearPage.getSportstext().equals("Sports");
				 Utils.assertTrue(driver, "Filter verified test2","Sports filter applied successfully","Sports filter apply failed", result1);
		
				 gearPage.clickOncardioBall();
				 logger.info("clicked on cardioBall");
				 gearPage.clickOnwishlist();
			      logger.info("clicked on wishlist");
			      
  Utils.assertTrue(driver, "wishlist product through filter test","product wishlist successsfully","product wishlist failed", gearPage.getwishlistSuccesstext().contains("Dual Handle Cardio Ball has been added to your Wish List. Click here to continue shopping."));
  			 
  }
	
	@Test(description = "Verify addtoCompare product using filter ")
	public void addtoComparethroughfiltertest()throws IOException, InterruptedException {

		       logger.info("Url Is opened");
		       LoginPage loginpage = new LoginPage(driver);
				loginpage.clickonsignInLink();
				
				logger.info("Entered CustomerEmailID");
				loginpage.enteremail(ConstantUtils.CUSTOMER_EMAIL);
				
				logger.info("Entered CustomerPassword");
				loginpage.enterpassword(ConstantUtils.CUSTOMER_PASSWORD);
				
				loginpage.clickonsignInbtn();
				logger.info("Customer loogeed in successfully");
		       
				GearPage gearPage  = new GearPage(driver);
		       		     
				gearPage.clickOngear();
		
				gearPage.clickOnfitnessEquipment();
			      logger.info("clicked on fitnessEquipment");
			
			    gearPage.clickOncategory();
			      logger.info("clicked oncategory");
     		 
			    gearPage.clickOncardio();
			      logger.info("clicked on cardio");
			      
			     boolean result = gearPage.getCategorytext().equals("Category") && gearPage.getCardiotext().equals("Cardio");
				 Utils.assertTrue(driver, "Filter verified test1","Cardio filter applied successfully","Cardio filter apply failed", result);
			      
			    gearPage.clickOnactivity();
			      logger.info("clicked on activity");
			      
			     gearPage.clickOnsports();
			      logger.info("clicked on sports");
			 
			     boolean result1 = gearPage.getaAtivitytext().equals("Activity") && gearPage.getSportstext().equals("Sports");
				 Utils.assertTrue(driver, "Filter verified test2","Sports filter applied successfully","Sports filter apply failed", result1);
		
				 gearPage.clickOncardioBall();
				 logger.info("clicked on cardioBall");
				 gearPage.clickOnaddtoCompare();
			      logger.info("clicked on addtoCompare");
			      
			     Utils.assertTrue(driver, "addtoCompare product through filter test","product addtoCompare successsfully","product addtoCompare failed", gearPage.getaddtoCompareSuccesstext().contains("You added product Dual Handle Cardio Ball to the comparison list."));
  			 
  }
}