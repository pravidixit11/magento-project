package com.magnetopageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.magneto.utilities.Utils;

public class WomenPage {
	WebDriver driver;

	public WomenPage(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	//repository of web elements
	   @FindBy(xpath = ("//*[@id='ui-id-4']"))
        WebElement women;
	   @FindBy(xpath = ("//a[@id='ui-id-9']"))
	    WebElement womentop;
	    @FindBy(xpath = ("//a[@id='ui-id-11']//span[contains(text(),'Jackets')]"))
       WebElement womenjackets;
	   
	    @FindBy(xpath = ("//div[@class='column main']//li[1]//div[1]//a[1]//span[1]//span[1]//img[1]"))
	       WebElement oliviaJackets;
	    @FindBy(xpath = ("//div[@id='option-label-size-143-item-167']"))
	       WebElement selectSize;
	    @FindBy(xpath = ("//div[@id='option-label-color-93-item-50']"))
	       WebElement selectColour;
	    @FindBy(xpath = ("//input[@id='qty']"))
	       WebElement selectQuantity;
	    @FindBy(xpath = ("//button[@id='product-addtocart-button']"))
	       WebElement addtoCartbtn;
	    @FindBy(xpath = ("//a[@class='action showcart']"))
	       WebElement addtoCartLogo;
	    @FindBy(xpath = ("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']"))
	       WebElement productaddedSucceesText;
	    
	    //2nd testcase
	    @FindBy(xpath = ("//button[@id='top-cart-btn-checkout']"))
	       WebElement ProceedtoCheckoutbtn;
	   
	     @FindBy(xpath = ("//span[normalize-space()='Place Order']"))
	       WebElement placeOrderbtn;
	     @FindBy(xpath = (" //div[@class='page-wrapper']//p[1]"))
	       WebElement OrderNumber;
	     @FindBy(xpath = ("//span[normalize-space()='Next']/.."))
	       WebElement nexttbtn;
	     
	     //3rd testcase
	     @FindBy(xpath = ("//div[@class='product-addto-links']//span[contains(text(),'Add to Wish List')]"))
	       WebElement wishlist;	    
	     @FindBy(xpath = ("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']"))
	       WebElement wishlistSuccessText; 
	     
	   //4th testcase
	     @FindBy(xpath = ("//div[@class='product-addto-links']//span[contains(text(),'Add to Compare')]"))
	       WebElement addToCompare;	     
	     @FindBy(xpath = ("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']"))
	       WebElement addToCompareSuccessText; 
	   
	    
	   public void hoverOnWomen()  {
		   Actions actions = new Actions(driver);
		    actions.moveToElement(women).build().perform();
	      }	
	   
 	   public void hoverOnWomenTop()  {
 		  Utils.waitForElementVisibility(driver, womentop, 3);
 		  Actions actions = new Actions(driver);
		    actions.moveToElement(womentop).build().perform();
	      }	
	    
	   public void clickOnwomenJackets()  {
		   womenjackets.click();
	      }	
	   	  
	     public String getTitleText() {
	    	 String title = driver.getTitle();
	    	 return title;
	    }

	     public void clickOnOliviaJackets()  {
	    	 oliviaJackets.click();
		      }	
		
	     public void clickOnselectSize()  {
	    	 selectSize.click();
		      }	
	     
	     public void clickOnselectColour()  {
	    	 selectColour.click();
		      }	
	     public void clickOnselectQuantity()  {
	    	 selectQuantity.click();
		      }	
	     public void clickOnaddtoCartbtn()  {
	    	 addtoCartbtn.click();
		      }	
	     public String getproductaddedSucceesText()  {
	    	 String text= productaddedSucceesText.getAttribute("innerText");
				return text; 
		      }
	    	   
	     //2nd testcase
	     public void clickOnaddtoCartlogo() throws InterruptedException  {
	    	 Utils.waitForElementVisibility(driver, productaddedSucceesText, 10);
	    	 Thread.sleep(3000);
	    	 JavascriptExecutor jse = (JavascriptExecutor) driver;
		     jse.executeScript("arguments[0].scrollIntoView();", addtoCartLogo);
	    	 addtoCartLogo.click();
		      }	
	     
	     public void clickOnProceedtoCheckoutbtn()  {
	    	 Utils.waitForElementVisibility(driver, ProceedtoCheckoutbtn, 5);
	    	 ProceedtoCheckoutbtn.click();
		      }	
	     	   	  	     
	     public void clickOnNextbtn() throws InterruptedException {
	    	 Utils.waitForElementVisibility(driver, nexttbtn, 30);
	    	 Thread.sleep(5000);
	    	 JavascriptExecutor jse = (JavascriptExecutor) driver;
		     jse.executeScript("arguments[0].scrollIntoView();", nexttbtn);
	    	 nexttbtn.click();
	    	 }	
	     
	     public void clickOnplaceOrderbtn()  {
	     	 Utils.waitForElementVisibility(driver, placeOrderbtn, 5);
	    	 JavascriptExecutor jse = (JavascriptExecutor) driver;
		     jse.executeScript("arguments[0].scrollIntoView();", placeOrderbtn);
	    	 placeOrderbtn.click();
		     }	
	    
	     public String getOrderNumbertext()  {
	    	 String text= OrderNumber.getText();
				return text; 
		      }
	     
	     //3rd testcase
	     public void clickOnaddtowishlistbtn(){
	    	 wishlist.click();
		      }	
	     
	     public String getwishlistSuccesstext(){
	    	  	 String text= wishlistSuccessText.getAttribute("innerText");
				return text; 
			  }
	     
	     //4th testcase
	     public void clickOnaddtoComparebtn(){
	    	 addToCompare.click();
		      }	
	     
	     public String getaddtoComparSuccesstext(){
	    	  	 String text= addToCompareSuccessText.getAttribute("innerText");
				return text; 
			  }
	    
	     
}
