package com.magnetopageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class GearPage {
	WebDriver driver;

	public GearPage(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
		
	
	    @FindBy(xpath = ("//span[normalize-space()='Gear']"))
         WebElement gear;
	 
	   @FindBy(xpath = ("//ol[@class='items']//a[normalize-space()='Fitness Equipment']"))
	     WebElement fitnessEquipment;
	   @FindBy(xpath = ("//div[normalize-space()='Category']"))
	     WebElement category;
	   @FindBy(xpath = ("//div[@id='narrow-by-list']//div[1]//div[2]//ol[1]//li[1]//a[1]"))
	     WebElement cardio;
	   @FindBy(xpath = ("//div[normalize-space()='Activity']"))
	     WebElement activity;
	   @FindBy(xpath = ("//div[@id='layered-filter-block']//div[1]//div[2]//ol[1]//li[3]//a[1]"))
	     WebElement sports;
	   
	   @FindBy(xpath = ("//span[@class='filter-label']"))
	     WebElement categorytext;
	   @FindBy(xpath = ("//span[@class='filter-value']"))
	     WebElement cardiotext;
	   @FindBy(xpath = ("//span[normalize-space()='Activity']"))
	     WebElement activitytext;
	   @FindBy(xpath = ("//span[normalize-space()='Sports']"))
	     WebElement sportstext;
	   @FindBy(xpath = ("//button[@id='product-addtocart-button']//span[contains(text(),'Add to Cart')]"))
	     WebElement addtoCart;
	    @FindBy(xpath = ("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']"))
	      WebElement itemAddedSuccesstext;
	    @FindBy(xpath = ("//li[@class='item product product-item']//img[@alt='Dual Handle Cardio Ball']"))
	     WebElement cardioBall;    
	      
	    @FindBy(xpath = ("//div[@class='product-addto-links']//span[contains(text(),'Add to Wish List')]"))
	     WebElement wishlist;
	    @FindBy(xpath = ("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']"))
	      WebElement itemwishlistSuccesstext;
	   
	   public void clickOngear()  {
		   gear.click();
	      }	
	   
	   public void clickOnfitnessEquipment()  {
		   fitnessEquipment.click();
	      }	
	   public void clickOncategory()  {
		   category.click();
	      }	
	   public void clickOncardio()  {
		   cardio.click();
	      }	
	   public void clickOnactivity()  {
		   activity.click();
	      }	
	   public void clickOnsports()  {
		   sports.click();
	      }	
	   	   	   
	   public String getCategorytext(){
  	  	    String text= categorytext.getText();
			return text; 
		  }
	   public String getCardiotext(){
	  	  	 String text= cardiotext.getText();
				return text; 
		  }
	   	    	   
	    public String getaAtivitytext(){
	  	  	 String text= activitytext.getText();
				return text; 
		  }
	    public String getSportstext(){
		   	 String text= sportstext.getText();
					return text; 
		  }
	    
	  //2nd test case
	    public void clickOnaddtoCart()  {
	    	addtoCart.click();
		      }		    	    
	    public String getaddedSuccesstext(){
   	  	 String text= itemAddedSuccesstext.getAttribute("innerText");
			return text; 
		  }	    
	    public void clickOncardioBall() {
 	    	cardioBall.click();
	      }
	    
	    	    
	    //3rd test case	      	    
	    public void clickOnwishlist(){
	    	wishlist.click();
		      }	
	    	    
	    public String getwishlistSuccesstext(){
   	  	 String text= itemwishlistSuccesstext.getAttribute("innerText");
			return text; 
		  }
	    
	    
	  //4th test case
	  	      
	    @FindBy(xpath = ("//div[@class='product-addto-links']//span[contains(text(),'Add to Compare')]"))
	     WebElement addtoCompare;
	    @FindBy(xpath = ("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']"))
	      WebElement addtoCompareSuccesstext;
	    	    	    
	    public void clickOnaddtoCompare(){
	    	addtoCompare.click();
		      }	
	    	    
	    public String getaddtoCompareSuccesstext(){
   	  	 String text= addtoCompareSuccesstext.getAttribute("innerText");
			return text; 
		  }
	    
}
