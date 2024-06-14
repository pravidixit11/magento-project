package com.magneto.testcase;
import java.io.IOException;
import org.testng.annotations.Test;
import com.magneto.utilities.ConstantUtils;
import com.magneto.utilities.GlobalHooks;
import com.magneto.utilities.Utils;
import com.magnetopageObjects.LoginPage;
import com.magnetopageObjects.MenPage;
public class TC_MenPage_005 extends GlobalHooks {

	@Test(description = "Verify Mens Bottom product add to cart ")
	public void mensBottomProductAddToCarttest()throws IOException, InterruptedException {

		       logger.info("Url Is opened");
		       LoginPage loginpage = new LoginPage(driver);
				loginpage.clickonsignInLink();
				
				logger.info("Entered CustomerEmailID");
				loginpage.enteremail(ConstantUtils.CUSTOMER_EMAIL);
				
				logger.info("Entered CustomerPassword");
				loginpage.enterpassword(ConstantUtils.CUSTOMER_PASSWORD);
				
				loginpage.clickonsignInbtn();
				logger.info("Customer loogged in successfully");
		       
				MenPage menPage  = new MenPage(driver);
		       
			 menPage.clickOnmen();
				       
			 menPage.clickOnbottom();
			 logger.info("clicked on bottom");
			 menPage.clickOnmodeList();
			 logger.info("clicked on modeList");
			 
			 menPage.clickOnselectSize();
			 logger.info("Size select");
			 menPage.clickOnselectColour();
			 logger.info("Colour select");
			 menPage.clickOnaddtoCart();
			 logger.info("Product added to cart");
     							 
	Utils.assertTrue(driver, "Mens Bottom product added in cart test","Mens Bottom product added in cart successsfully","Mens Bottom product add to cart failed", menPage.getitemAddedSuccesstext().contains("You added Pierce Gym Short to your shopping cart."));
			 
	}	
	
	@Test(description = "Verify Mens Bottom product add to wishlist ")
	public void mensBottomProductwishlisttest()throws IOException, InterruptedException {

		       logger.info("Url Is opened");
		       LoginPage loginpage = new LoginPage(driver);
				loginpage.clickonsignInLink();
				
				logger.info("Entered CustomerEmailID");
				loginpage.enteremail(ConstantUtils.CUSTOMER_EMAIL);
				
				logger.info("Entered CustomerPassword");
				loginpage.enterpassword(ConstantUtils.CUSTOMER_PASSWORD);
				
				loginpage.clickonsignInbtn();
				logger.info("Customer loogged in successfully");
		       
				MenPage menPage  = new MenPage(driver);
		       
			 menPage.clickOnmen();
				       
			 menPage.clickOnbottom();
			 logger.info("clicked on bottom");
			 menPage.clickOnmodeList();
			 logger.info("clicked on modeList");
			 
			 menPage.clickOnselectSize();
			 logger.info("Size select");
			 menPage.clickOnselectColour();
			 logger.info("Colour select");
			 menPage.clickOnwishlist();
			 logger.info("Product added to wishlist");
     							 
	Utils.assertTrue(driver, "Mens Bottom product wishlist test","Mens Bottom product added in wishlist successsfully","Mens Bottom product add to wishlist failed", menPage.getWishlistSuccesstext().contains("Pierce Gym Short has been added to your Wish List. Click here to continue shopping."));
			 
	}	
	
	@Test(description = "Verify Mens Bottom addtoCompare ")
	public void mensBottomaddtoComparetest()throws IOException, InterruptedException {

		       logger.info("Url Is opened");
		       LoginPage loginpage = new LoginPage(driver);
				loginpage.clickonsignInLink();
				
				logger.info("Entered CustomerEmailID");
				loginpage.enteremail(ConstantUtils.CUSTOMER_EMAIL);
				
				logger.info("Entered CustomerPassword");
				loginpage.enterpassword(ConstantUtils.CUSTOMER_PASSWORD);
				
				loginpage.clickonsignInbtn();
				logger.info("Customer loogged in successfully");
		       
				MenPage menPage  = new MenPage(driver);
		       
			 menPage.clickOnmen();
				       
			 menPage.clickOnbottom();
			 logger.info("clicked on bottom");
			 menPage.clickOnmodeList();
			 logger.info("clicked on modeList");
			 
			 menPage.clickOnselectSize();
			 logger.info("Size select");
			 menPage.clickOnselectColour();
			 logger.info("Colour select");
			 menPage.clickOnaddtoCompare();
			 logger.info("Product added to Compare");
     							 
	Utils.assertTrue(driver, "Mens Bottom product addtoCompare test","Mens Bottom product addtoCompare successsfully","Mens Bottom product addtoCompare failed", menPage.getaddtoCompareSuccesstext().contains("You added product Pierce Gym Short to the comparison list."));
			 
	}	
}
