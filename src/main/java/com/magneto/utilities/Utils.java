package com.magneto.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static com.magneto.utilities.GlobalHooks.logger;

public class Utils {

	public static FileInputStream fi;
	public static FileOutputStream fo;
	public static XSSFCell cell;
	public static XSSFRow row;
	public static  XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static int screenshotIncremental=0;
	
	public static int getRowCount(String xlfile,String xlsheet) throws IOException {
		
		fi=new FileInputStream(xlfile);
		wb= new XSSFWorkbook(fi);
		ws= wb.getSheet(xlsheet);
		int rowcount = ws.getLastRowNum();
		wb.close();
	    fi.close();
		return rowcount;
	}
	
    public static int getCellCount(String xlfile,String xlsheet,int rownum) throws IOException {
		
		fi=new FileInputStream(xlfile);
		wb= new XSSFWorkbook(fi);
		ws= wb.getSheet(xlsheet);
		row=ws.getRow(rownum);
		int cellcount = row.getLastCellNum();
		wb.close();
	    fi.close();
		return cellcount;
	}
	
     public static String getCellData(String xlfile,String xlsheet,int rownum,int colnum) throws IOException {
	
    	fi=new FileInputStream(xlfile);
    	wb= new XSSFWorkbook(fi);
        ws= wb.getSheet(xlsheet);
	    row=ws.getRow(rownum);
	    cell=row.getCell(colnum);
	    String data;
	    try {
	    	DataFormatter formatter = new DataFormatter();
	    	String cellDAta = formatter.formatCellValue(cell);
	    	return cellDAta;
	     }
	    catch(Exception e) {
	    	data="";
	    }
	     wb.close();
        fi.close();
	    return data;
     }
     
     public static void setCellData(String xlfile,String xlsheet,int rownum,int colnum,String data) throws IOException {
    		
     	fi=new FileInputStream(xlfile);
     	wb= new XSSFWorkbook(fi);
         ws= wb.getSheet(xlsheet);
 	    row=ws.getRow(rownum);
 	    cell=row.createCell(colnum);
 	    cell.setCellValue(data);
 	    fo=new FileOutputStream(xlfile);
 	    wb.write(fo);
 	     wb.close();
         fi.close();
 	    fo.close();
      }
     
     public static void assertTrue(WebDriver driver,String testName,String passMessage,String errorMessage, boolean condition) throws IOException {
    	 
		 if(condition)
			 logger.info(passMessage);
		 else
			 logger.error(errorMessage);
		 screenshotIncremental++;
    	 GlobalHooks.captureScreen(driver,testName+"_"+screenshotIncremental);
         Assert.assertTrue(condition);
     }
     
     public static void waitForElementVisibility(WebDriver driver, WebElement webElement, int timeInSeconds) {
    	 
    	 WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(timeInSeconds));
    	 webDriverWait.until(ExpectedConditions.visibilityOf(webElement));
    	 
     }
     
     public static boolean waitForElementInvisibility(WebDriver driver, WebElement webElement, int timeInSeconds) {
    	 
    	 WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(timeInSeconds));
    	 return webDriverWait.until(ExpectedConditions.invisibilityOf(webElement));
    	 
     }
}
