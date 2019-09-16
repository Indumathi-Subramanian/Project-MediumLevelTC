package com.training.pom;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class UpdateOrderNewPOM {
public WebDriver driver; 
	
	public UpdateOrderNewPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id='form-order']/div/table/tbody/tr[1]/td[8]/a[2]/i")
   	private WebElement edit;
	
	@FindBy(xpath="//*[@id='button-customer']")
   	private WebElement continuebtn;
	
	@FindBy(xpath="//*[@id='cart']/tr/td[6]/button")
	private WebElement removebtn;
	
	@FindBy(xpath="//*[@name='product']")  
	private WebElement producttxt;
	    
	@FindBy(xpath="//*[@name='quantity']")
	private WebElement quantitytxt;
	  
	@FindBy(xpath="//*[@id='button-product-add']")
	private WebElement addbtn;
	
	@FindBy(xpath="//*[@id='button-cart']")
	private WebElement continuecartbtn;
	
	@FindBy(xpath="//*[@id='button-payment-address']")
	private WebElement continuepymtbtn;  	
	 
	@FindBy(xpath="//*[@id='button-shipping-address']")
	private WebElement continueshpmtbtn; 
	 
	@FindBy(xpath="//*[@id='button-save']")
	private WebElement savebtn; 
	
		
	public void clickEdit() {
		this.edit.click(); 
	}
	public void clickContinue() throws InterruptedException {
		this.continuebtn.click();
		Thread.sleep(3000);
	}
	public void clickRemove() {
		this.removebtn.click();
	}
	public void sendProduct(String producttxt) {
		this.producttxt.clear();
		this.producttxt.sendKeys(producttxt);
	}
	public void sendQuantity(String quantitytxt) {
		this.quantitytxt.clear();
		this.quantitytxt.sendKeys(quantitytxt);
	}
	public void clickAdd() {
		this.addbtn.click();
	}
	public void clickContinueCart() {
		this.continuecartbtn.click();
	}
	public void clickContinuePymnt() {
		this.continuepymtbtn.click();
	}
	public void clickContinueShpmt() {
		this.continueshpmtbtn.click();
	}
	public void clickSave() {
		this.savebtn.click();
	}
}
