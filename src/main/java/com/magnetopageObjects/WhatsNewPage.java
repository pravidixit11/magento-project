package com.magnetopageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.magneto.utilities.Utils;

public class WhatsNewPage {

	WebDriver driver;

	public WhatsNewPage(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
		
	    @FindBy(xpath = ("//a[@id='ui-id-3']//span[1]"))
         WebElement whatsNew;
	    @FindBy(xpath = ("//main[@id='maincontent']//ul[1]//li[3]//a[1]"))
        WebElement tees;
	    @FindBy(xpath = ("//img[@alt='Desiree Fitness Tee']"))
        WebElement teesProduct;
	    @FindBy(xpath = ("//a[@id='tab-label-description-title']"))
        WebElement detailsTab;
	    @FindBy(xpath = ("//a[@id='tab-label-additional-title']"))
        WebElement moreinformationTab;
	    @FindBy(xpath = ("//a[@id='tab-label-reviews-title']"))
        WebElement reviewsTab;
	    @FindBy(xpath = ("//input[@id='nickname_field']"))
        WebElement nickname;
	    @FindBy(xpath = ("//input[@id='summary_field']"))
        WebElement summary;
	    @FindBy(xpath = ("//textarea[@id='review_field']"))
        WebElement review;
	    @FindBy(xpath = ("//span[normalize-space()='Submit Review']"))
        WebElement submitReview;
	    
	    @FindBy(xpath = ("//input[@id='Rating_1']"))
        WebElement rating;
	    
	    @FindBy(xpath = ("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']"))
        WebElement successText;
	  
	    
	    public void clickOnwhatsNew()  {
	    	whatsNew.click();
		      }	
	    public void clickOnshopNewYoga()  {
	    	tees.click();
		      }	
	    public void clickOneTeesProduct()  {
	    	teesProduct.click();
		      }	
	    
	    public void clickOndetailsTab()  {
	    	detailsTab.click();
		      }	
	    public void clickOnmoreinformationTab()  {
	    	moreinformationTab.click();
		      }	
	    public void clickOnreviewstab()  {
	    	reviewsTab.click();
		      }	
	    
	    public void clickOnrating() throws InterruptedException  {
	    	Utils.waitForElementVisibility(driver, rating, 5);
	    	 JavascriptExecutor jse = (JavascriptExecutor) driver;
		     jse.executeScript("arguments[0].scrollIntoView();", rating);
		     Thread.sleep(2000);
		     jse.executeScript("arguments[0].click();", rating);
		      }	
	    public void clickOnnickname()  {
	    	nickname.click();;
		      }	
	    public void clickOnsummary()  {
	    	summary.sendKeys("Good Quality Product");
		      }	
	    public void clickOnreview()  {
	    	review.sendKeys("comfortable Product");
		      }	
	    public void clickOnsubmitReview()  {
	    	submitReview.click();
		      }	
	    
	    public String getReviewSuccesstext()  {
	    	 String text= successText.getAttribute("innerText");
				return text; 
		      }
	    
	    
}
