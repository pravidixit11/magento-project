package com.magneto.testcase;
import java.io.IOException;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;
import com.magneto.utilities.GlobalHooks;
import com.magneto.utilities.Utils;
import com.magnetopageObjects.CreateAnAccountPage;
import com.magnetopageObjects.HomePage;

public class TC_CreateACC_001 extends GlobalHooks {
	
	private static String firstName = "Admin";
	private static String lastName = "Dixit";
	private static String emailId="@gmail.com";

	@Test(description = "Verify that account gets created with different data")
	public void CreateAccountTest()throws IOException {

		logger.info("Url Is opened");
		CreateAnAccountPage ca = new CreateAnAccountPage(driver);
		ca.clickoncreateaccount();

		logger.info("Entered firstname");
		ca.enterfirstname(firstName+RandomStringUtils.randomAlphabetic(2));

		logger.info("Entered lastname");
		ca.enterlastname(lastName+RandomStringUtils.randomAlphabetic(2));
		
		logger.info("Entered Email");
		ca.enteremail(firstName+RandomStringUtils.randomAlphanumeric(3)+emailId);
	
		String passwordValue = "Password@"+RandomStringUtils.randomAlphanumeric(3);
		
		logger.info("Entered password");
		ca.enterpassword(passwordValue);

		logger.info("Entered cnfpwd");
		ca.entercnfpassword(passwordValue);
		
		ca.clickaccbtn();

		Utils.assertTrue(driver, "Accounttest","Account creation successful","Account creation failed", driver.getTitle().equals("My Account"));
				
		

	}
}

