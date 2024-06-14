package com.magnetopageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.magneto.utilities.Utils;

public class SalePage {

	WebDriver driver;

	public SalePage(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	    @FindBy(xpath = ("//a[@id='ui-id-8']//span[contains(text(),'Sale')]"))
         WebElement sale;
	    @FindBy(xpath = ("//img[@src='https://magento.softwaretestingboard.com/pub/media/wysiwyg/sale/sale-main.jpg']"))
        WebElement saleWomensDeal;
	    @FindBy(xpath = ("(//a[@class='action  next'])[2]"))
        WebElement nextbtn;
	  
	    public void clickOnSale()  {
	    	sale.click();
		      }	
	    public String getTitle() {
	    	 String title = driver.getTitle();
	    	 return title;
	    }	        
	    //2nd testcase
	    public void clickOnsaleWomensDeal(){
	    		   saleWomensDeal.click();
		      }	
	    
	    public void clickOnnextbtn(WebDriver driver) throws InterruptedException{
	    	Utils.waitForElementVisibility(driver, nextbtn, 5);
	    	Thread.sleep(3);
	    	nextbtn.click();
          }	
	    
	    public boolean isNextButtonIsPresent() {
	    	return Utils.waitForElementInvisibility(driver, nextbtn, 0);
	    }
	  
}
