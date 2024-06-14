package com.magneto.testcase;

import java.io.IOException;
import org.testng.annotations.Test;

import com.magneto.utilities.ConstantUtils;
import com.magneto.utilities.GlobalHooks;
import com.magneto.utilities.Utils;
import com.magnetopageObjects.HomePage;
import com.magnetopageObjects.LoginPage;
import com.magnetopageObjects.WomenPage;


public class TC_WomenPage_004 extends GlobalHooks {
		
	
	@Test(description = "Verify women jacket Product added to cart")
	public void WomenjacketaddtoCartest()throws IOException, InterruptedException {

		       logger.info("Url Is opened");
		       WomenPage womenpage  = new WomenPage(driver);
		       
		       womenpage.hoverOnWomen();
		       Thread.sleep(2000);
		       womenpage.hoverOnWomenTop();
		       womenpage.clickOnwomenJackets();
		
			Utils.assertTrue(driver, "Jacket Women test","title verified successsfully","title verified failed", womenpage.getTitleText().equals("Jackets - Tops - Women"));
		       
			womenpage.clickOnOliviaJackets();
			 logger.info("Jacket page  opened");
			womenpage.clickOnselectSize();
			 logger.info("Size select");
			womenpage.clickOnselectColour();
			 logger.info("Colour select");
			womenpage.clickOnselectQuantity();
			 logger.info("Quantity select");
			womenpage.clickOnaddtoCartbtn();
			 logger.info("Product added to cart");
     	
 Utils.assertTrue(driver, "women jacket Product add to cart test","Product is added to cart successfully","Product is not added to cart", womenpage.getproductaddedSucceesText().equals("You added Olivia 1/4 Zip Light Jacket to your shopping cart."));

   	}	
	
	@Test(description = "Verify User ordered product ")
	public void UserOrderProducttest()throws IOException, InterruptedException {

		       logger.info("Url Is opened");
		       LoginPage loginpage = new LoginPage(driver);
				loginpage.clickonsignInLink();
				
				logger.info("Entered CustomerEmailID");
				loginpage.enteremail(ConstantUtils.CUSTOMER_EMAIL);
				
				logger.info("Entered CustomerPassword");
				loginpage.enterpassword(ConstantUtils.CUSTOMER_PASSWORD);
				
				loginpage.clickonsignInbtn();
				logger.info("Customer loogeed in successfully");
		       
		       WomenPage womenpage  = new WomenPage(driver);
		       
		       womenpage.hoverOnWomen();
		       womenpage.hoverOnWomenTop();
		       womenpage.clickOnwomenJackets();
		
		       
			womenpage.clickOnOliviaJackets();
			 logger.info("clicked on olivia jacket");
			womenpage.clickOnselectSize();
			 logger.info("Size select");
			womenpage.clickOnselectColour();
			 logger.info("Colour select");
			womenpage.clickOnselectQuantity();
			 logger.info("Quantity select");
			womenpage.clickOnaddtoCartbtn();
			 logger.info("Product added to cart");
     		
			 womenpage.clickOnaddtoCartlogo();
			
			 logger.info("Clicked on added to cart Logo");
			 womenpage.clickOnProceedtoCheckoutbtn();
			 logger.info("Clicked on ProceedtoCheckout");
			 
			 womenpage.clickOnNextbtn();
			
			 logger.info("Clicked on Nextbtn");
			 womenpage.clickOnplaceOrderbtn();
			 logger.info("Clicked on placeOrder");
			 
	Utils.assertTrue(driver, "User ordered product suceesfully test","product ordered successsfully","product ordered failed", womenpage.getOrderNumbertext().contains("Your order number is: "));
			 
	}	
	
	@Test(description = "Verify product add to wishlist ")
	public void WishlistProducttest()throws IOException, InterruptedException {

		       logger.info("Url Is opened");
		       LoginPage loginpage = new LoginPage(driver);
				loginpage.clickonsignInLink();
				
				logger.info("Entered CustomerEmailID");
				loginpage.enteremail(ConstantUtils.CUSTOMER_EMAIL);
				
				logger.info("Entered CustomerPassword");
				loginpage.enterpassword(ConstantUtils.CUSTOMER_PASSWORD);
				
				loginpage.clickonsignInbtn();
				logger.info("Customer loogeed in successfully");
		       
		       WomenPage womenpage  = new WomenPage(driver);
		       
		       womenpage.hoverOnWomen();
		       womenpage.hoverOnWomenTop();
		       womenpage.clickOnwomenJackets();
		
		       	womenpage.clickOnOliviaJackets();
			 logger.info("clicked on olivia jacket");
			
			womenpage.clickOnaddtowishlistbtn();
			 logger.info("Product added to wishlist");
     		 
			 
	Utils.assertTrue(driver, "product add to wishlist test","product add to wishlist successsfully","product add to wishlist failed", womenpage.getwishlistSuccesstext().contains("Olivia 1/4 Zip Light Jacket has been added to your Wish List. Click here to continue shopping."));
		 
  }		 	
	
	@Test(description = "Verify product add to compare ")
	public void addtoComparetest()throws IOException, InterruptedException {

		       logger.info("Url Is opened");
		       LoginPage loginpage = new LoginPage(driver);
				loginpage.clickonsignInLink();
				
				logger.info("Entered CustomerEmailID");
				loginpage.enteremail(ConstantUtils.CUSTOMER_EMAIL);
				
				logger.info("Entered CustomerPassword");
				loginpage.enterpassword(ConstantUtils.CUSTOMER_PASSWORD);
				
				loginpage.clickonsignInbtn();
				logger.info("Customer logged in successfully");
		       
		       WomenPage womenpage  = new WomenPage(driver);
		       
		       womenpage.hoverOnWomen();
		       womenpage.hoverOnWomenTop();
		       womenpage.clickOnwomenJackets();
		
		       	womenpage.clickOnOliviaJackets();
			 logger.info("clicked on olivia jacket");
			
			womenpage.clickOnaddtoComparebtn();
			 logger.info("Product added to compare");
     		 
			 
	Utils.assertTrue(driver, "product add to compare test","product add to compare successsfully","product add to compare failed", womenpage.getaddtoComparSuccesstext().contains("You added product Olivia 1/4 Zip Light Jacket to the "));
		 
  }		
	
	
}
