package com.magneto.testcase;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.magneto.utilities.ConstantUtils;
import com.magneto.utilities.GlobalHooks;
import com.magneto.utilities.Utils;
import com.magnetopageObjects.ForgotPasswordPage;
import com.magnetopageObjects.HomePage;
import com.magnetopageObjects.LoginPage;

public class TC_LoginPage_003 extends GlobalHooks { 

	@Test(description = "Verify customer logged in successfully")
	public void LoginPagetest()throws IOException {

		logger.info("Url Is opened");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.clickonsignInLink();
		
		logger.info("Entered CustomerEmailID");
		loginpage.enteremail(ConstantUtils.CUSTOMER_EMAIL);
		
		logger.info("Entered CustomerPassword");
		loginpage.enterpassword(ConstantUtils.CUSTOMER_PASSWORD);
		
		loginpage.clickonsignInbtn();
		
		HomePage homePage = new HomePage(driver);
		Utils.assertTrue(driver, "LoginPagetest","User logged in successful","User logged in failed", homePage.getWelcomeLablelText().equals(ConstantUtils.WELCOME_USER_TEST));
   }
			
	
	@Test(description = "Verify customer logged with required emailAddress")
	public void LoginPagetestwithoutEmail()throws IOException {

		logger.info("Url Is opened");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.clickonsignInLink();
				
		logger.info("Entered CustomerPassword");
		loginpage.enterpassword(ConstantUtils.CUSTOMER_PASSWORD);
		
		loginpage.clickonsignInbtn();
		
		HomePage homePage = new HomePage(driver);
		Utils.assertTrue(driver, "Required Email Logintest","Please Enter email address","User logged in failed", homePage.getRequiredEmailText().equals("This is a required field."));
   }
	
	@Test(description = "Verify customer logged with required Password")
	public void LoginPagetestWithoutPassword()throws IOException {

		logger.info("Url Is opened");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.clickonsignInLink();
				
		logger.info("Entered CustomerEmailID");
		loginpage.enteremail(ConstantUtils.CUSTOMER_EMAIL);
		
		loginpage.clickonsignInbtn();
		
		HomePage homePage = new HomePage(driver);
		Utils.assertTrue(driver, "Required Password Logintest","Please Enter Password","User logged in failed", homePage.getRequiredPwdText().equals("This is a required field."));
   }
	
	@Test(description = "Verify customer logged with required Email and Password")
	public void LoginPagetestWithoutEmailandPassword()throws IOException {

		logger.info("Url Is opened");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.clickonsignInLink();
							
		loginpage.clickonsignInbtn();
		HomePage homePage = new HomePage(driver);
		boolean result = homePage.getRequiredEmailText().equals("This is a required field.") && homePage.getRequiredPwdText().equals("This is a required field.");
		Utils.assertTrue(driver, "Required Email and Password Logintest","Please Enter email address and Password","User logged in failed", result);
   }
	
		
	@Test(dataProvider="LoginData",description = "Verify customer logged in with multiple valid data")
	public void LoginDDt(String uemail, String upassword)throws IOException {

		logger.info("Url Is opened");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.clickonsignInLink();
		
		logger.info("User email provided");
		loginpage.enteremail(uemail);
		
		logger.info("User Password provided");
		loginpage.enterpassword(upassword);
		
		loginpage.clickonsignInbtn();
		logger.info("User logged in successful");
		
		HomePage homePage = new HomePage(driver);
		homePage.clickondropdown();
		logger.info("clicked on dropdown");
		homePage.clickonsignout();
		logger.info("Clicked on signout");
		   		//Utils.assertTrue(driver, "WelcomeUserTextData","User logged in successful","User logged in failed", homePage.getWelcomeUserText().equals("Welcome, "));
	}
	@DataProvider(name="LoginData")
	String [][] getData() throws IOException{
		
		String filepath= System.getProperty("user.dir")+"/src/main/resources/com/magnetoTestdata/LoginData.xlsx";
		
		int rownum = Utils.getRowCount(filepath,"Login");
		int colcount = Utils.getCellCount(filepath,"Login",1);
		
		String logindata[][]=new String[rownum][colcount];
		
		for (int i=1;i<=rownum;i++) 
		{
	    	for(int j=0;j<colcount;j++) 
	    	{
	    		logindata[i-1][j]=	Utils.getCellData(filepath,"Login",i,j);
	    	}
		}
		return logindata;
	}
		
	
	@Test(description = "Forgot passowrd")
	public void ForgotPwdtest()throws IOException {

		logger.info("Url Is opened");
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.clickonsignInLink();
		
		ForgotPasswordPage forgotPwd = new ForgotPasswordPage(driver);
		forgotPwd.clickonforgottbtn();
		
		logger.info("Entered UserEmailID");
		forgotPwd.useremailid(ConstantUtils.CUSTOMER_EMAIL);
		
		forgotPwd.clickonresetbtn();
				
		Utils.assertTrue(driver, "Forgot passowrd test","Forgot passowrd reset successfully","Forgot passowrd reset failed", forgotPwd.getforgotpwdText().equals("If there is an account associated with pravi@gmail.com you will receive an email with a link to reset your password."));
	}	
		
	@Test(description = "Forgot passowrd email address required")
	public void ForgotPwdRequired()throws IOException {

		logger.info("Url Is opened");
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.clickonsignInLink();
		
		ForgotPasswordPage forgotPwd = new ForgotPasswordPage(driver);
		forgotPwd.clickonforgottbtn();
						
		forgotPwd.clickonresetbtn();
				
		Utils.assertTrue(driver, "Required Forgot passowrd test1","Please Enter email address","Forgot passowrd test failed", forgotPwd.getforgotEmailRequiredText().equals("This is a required field."));
	}	
}
