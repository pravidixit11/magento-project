package com.magnetopageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPage {

	WebDriver driver;

	public ForgotPasswordPage(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	    @FindBy(xpath =("//a[@class='action remind']"))
	     WebElement forgotlink;
	
		@FindBy(id = ("email_address"))
	    WebElement custemail;
		
		@FindBy(xpath =("//button[@class='action submit primary']"))
		 WebElement resetpwd;
		
		 @FindBy(xpath = ("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']"))
		    WebElement forgotpwdText;
		
		 @FindBy(xpath = ("//div[@id='email_address-error']"))
		 WebElement forgotEmailReqText;
		 
		public void clickonforgottbtn() {
			forgotlink.click();
		}
		
		 public void useremailid(String customeremail) {
			 custemail.sendKeys(customeremail);
			}
		
		public void clickonresetbtn() {
			resetpwd.click();
		}
		
		public String getforgotpwdText() {
			String text= forgotpwdText.getText();
			return text;
		}
		
		public String getforgotEmailRequiredText() {
			String text= forgotEmailReqText.getText();
			return text;
		}
}
