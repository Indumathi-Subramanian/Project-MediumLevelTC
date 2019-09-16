package com.training.pom;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class FilterStatusDatePOM {
	public WebDriver driver; 
	
	public FilterStatusDatePOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//*[@id='input-order-status']/option[@value='5']")
   	private WebElement pending;
	
	@FindBy(xpath="//*[@id='input-date-added']")
   	private WebElement calendaraddtxt;
	
	@FindBy(xpath="//*[@id='input-date-modified']")
   	private WebElement calendarmodtxt;
	
	@FindBy(xpath="//*[@id='input-total']")
   	private WebElement totaltxt;
			
	public void selOrder() {
		this.pending.click();
	}
	
	public void selDateAdded(String calendaraddtxt) {
		this.calendaraddtxt.clear();
		this.calendaraddtxt.sendKeys(calendaraddtxt);
	}
	
	public void sendtotal(String totaltxt) {
		this.totaltxt.clear();
		this.totaltxt.sendKeys(totaltxt);
	}
	
	public void selDateModified(String calendarmodtxt) {
		this.calendarmodtxt.clear();
		this.calendarmodtxt.sendKeys(calendarmodtxt);
	}
	
}
