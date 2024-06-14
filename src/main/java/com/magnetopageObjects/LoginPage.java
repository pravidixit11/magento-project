package com.magnetopageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
		@FindBy(xpath = ("//li[@class='authorization-link']//a"))
	    WebElement signInlink;
		@FindBy(name=("login[username]"))
		WebElement custemail;
		@FindBy(name=("login[password]"))
		WebElement custpassword;
		@FindBy(xpath=("//button[@class='action login primary']"))
		WebElement signInbtn;
			
		 public void clickonsignInLink()  {
			 signInlink.click();
	      }		
			
		 public void enteremail(String customeremail) {
			 custemail.sendKeys(customeremail);
			}
			
			public void enterpassword(String customerpwd) {
				custpassword.sendKeys(customerpwd);
			}
		
		 public void clickonsignInbtn()  {
			 signInbtn.click();
	      }	
}
