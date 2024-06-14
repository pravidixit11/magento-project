package com.magnetopageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAnAccountPage {

	WebDriver driver;

	public CreateAnAccountPage(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	//repository of web elements
	   @FindBy(xpath = ("//div[@class='panel header']//a[text()='Create an Account']"))
	    WebElement createacountlink;
		@FindBy(xpath=("//input[@id='firstname']"))
		WebElement firstname;
		@FindBy(xpath=("//input[@id='lastname']"))
		WebElement lastname;
		@FindBy(xpath=("//input[@name='email']"))
		WebElement email;
		@FindBy(xpath=("//input[@id='password']"))
		WebElement password;
		@FindBy(xpath=("//input[@id='password-confirmation']"))
		WebElement cnfpassword;
		@FindBy(xpath=("//button[@title='Create an Account']"))
		WebElement createaccbtn;
			
		 public void clickoncreateaccount()  {
	    	  createacountlink.click();
	      }		
			
		public void enterfirstname(String fname) {
			firstname.sendKeys(fname);
		}

		public void enterlastname(String lname) {
			lastname.sendKeys(lname);
		}
		
		public void enteremail(String uemail) {
			email.sendKeys(uemail);
		}
		
		public void enterpassword(String upwd) {
			password.sendKeys(upwd);
		}
		
		public void entercnfpassword(String ucnfpwd) {
			cnfpassword.sendKeys(ucnfpwd);
		}
		
		public void clickaccbtn() {
			createaccbtn.click();
		}
	
}
