package com.magnetopageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrainingPage {

	WebDriver driver;

	public TrainingPage(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
		

	    @FindBy(xpath = ("//a[@id='ui-id-7']//span[contains(text(),'Training')]"))
         WebElement training;
	 
	    public void clickOntraining()  {
	    	training.click();
		      }	
	    public String getTitle() {
	    	 String title = driver.getTitle();
	    	 return title;
	    }
	    
}
