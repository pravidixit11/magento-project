package com.magnetopageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

              WebDriver driver;
              
       
       @FindBy(xpath = ("//*[@class='action switch']"))
          WebElement dropdown;
	   @FindBy(xpath=("//li[@class='authorization-link']/a"))
	      WebElement signout;
	   @FindBy(xpath=("//span[@class='base']"))
	      WebElement successSignoutText;
	   
	   @FindBy(xpath = ("//div[@id='email-error']"))
	    WebElement emailRequiredtext;
	   @FindBy(xpath = ("//div[@id='pass-error']"))
	    WebElement pwdRequiredtext;
	   @FindBy(xpath = ("//span[@class=\"logged-in\"][1]"))
	    WebElement welcomeuserlabel;
	
	   @FindBy(xpath = ("//span[@class='base']"))
	    WebElement searchvalueText;
	 
	    @FindBy(xpath = ("//div[@class='control']//input[@id='search']"))
	    WebElement searchbtn;
	    
	    @FindBy(xpath = ("//span[@class='action more button']"))
	    WebElement shopYogabtn;
	    
	    @FindBy(xpath = ("//span[@class='base']"))
	    WebElement shopYoga;
	    
	    
	   public HomePage(WebDriver rdriver) {
		   driver=rdriver;
		   PageFactory.initElements(rdriver, this);
	   }
				     
	     public String getTitle() {
	    	 String title = driver.getTitle();
	    	 return title;
	    }

	     public String getRequiredEmailText() {
			  String text= emailRequiredtext.getText();
			  return text;
		    } 
	     	    
	     public String getRequiredPwdText() {
	    	 String text= pwdRequiredtext.getText();
			  return text;
	     }
	    	     
	    public String getWelcomeLablelText() {
		  String text= welcomeuserlabel.getText();
		  return text;
	    }
 
		 public void clickondropdown()  {
			 dropdown.click();
	      }
		 public void clickonsignout()  {
			 signout.click();
	      }
		 public String getsuccessSignoutText() {
			  String text= successSignoutText.getText();
			  return text;
		    }		 
		 
						
			public void clickonsearchbtn() 
			{
				searchbtn.click();
			}
			public void entervalue(String searchValue) {
				searchbtn.sendKeys(searchValue);
			}
			public void enterclick() 
			{
				searchbtn.sendKeys(Keys.ENTER);
			}
			
									
			public String getSearchvalueText() {
				String text= searchvalueText.getText();
				return text;
			}
										
			public void clickonshopyoga() 
			{
				shopYogabtn.click();
			}
			
			public String getshopyogaText() {
				String text= shopYoga.getText();
				return text;
			}
	
}


