package com.magnetopageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenPage {

	WebDriver driver;

	public MenPage(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	    @FindBy(xpath = ("//a[@id='ui-id-5']//span[contains(text(),'Men')]"))
         WebElement men;
	    @FindBy(xpath = ("//a[contains(text(),'Bottoms')]"))
        WebElement bottom;
	    @FindBy(xpath = ("//div[@class='column main']//div[2]//div[1]//a[1]"))
        WebElement modeList;
	     @FindBy(xpath = ("//div[@class='swatch-opt-1028']//div[@id='option-label-size-143-item-175']"))
	       WebElement selectSize;
	    @FindBy(xpath = ("//div[@class='swatch-opt-1028']//div[@id='option-label-color-93-item-58']"))
	       WebElement selectColour;
	    @FindBy(xpath = ("//li[1]//div[1]//div[1]//div[3]//div[1]//div[1]//form[1]//button[1]//span[1]"))
	       WebElement addtoCartbtn;
	    
	    @FindBy(xpath = ("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']"))
	       WebElement itemAddedSuccesstext;
	    //2nd test 
	    @FindBy(xpath = ("//li[1]//div[1]//div[1]//div[3]//div[1]//div[2]//a[1]"))
	       WebElement wishlistbtn;
	     @FindBy(xpath = ("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']"))
	       WebElement wishlistSuccesstext;
	   //3rd test 
		 @FindBy(xpath = ("//li[1]//div[1]//div[1]//div[3]//div[1]//div[2]//a[2]"))
		   WebElement addtocomparebtn;		  
	     @FindBy(xpath = ("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']"))
		   WebElement addtoCompareSuccesstext;
	    
	    
	    public void clickOnmen()  {
	    	men.click();
		      }	
	    public void clickOnbottom()  {
	    	bottom.click();
		      }
	    public void clickOnmodeList()  {
	    	modeList.click();
		      }	
	        
	    public void clickOnselectSize()  {
	    	 selectSize.click();
		      }	
	    public void clickOnselectColour()  {
	    	selectColour.click();
		      }	

	    public void clickOnaddtoCart()   {
	    	  	 addtoCartbtn.click();
		      }	
	    
	    public String getitemAddedSuccesstext()  {
	    	 String text= itemAddedSuccesstext.getAttribute("innerText");
				return text; 
		      }
	   
	    public void clickOnwishlist()   {
	    	wishlistbtn.click();
	      }	
	    
	    public String getWishlistSuccesstext()  {
	    	 String text= wishlistSuccesstext.getAttribute("innerText");
				return text; 
		      }
	    
	   	    
	    public void clickOnaddtoCompare()   {
	    	addtocomparebtn.click();
	      }	
	    
	    public String getaddtoCompareSuccesstext()  {
	    	 String text= addtoCompareSuccesstext.getAttribute("innerText");
				return text; 
		      }
	    
}
