package com.training.sanity.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.training.pom.FilterPOM;
import com.training.pom.UpdateOrderNewPOM;

public class UpdateOrderNew extends LoginTests{
	private FilterPOM FilterPOM;
	private UpdateOrderNewPOM UpdateOrderNewPOM;
	@Test(priority=2)
	
	public void updateOrder() throws InterruptedException{
		FilterPOM = new FilterPOM(driver);
		UpdateOrderNewPOM UpdateOrderNewPOM = new UpdateOrderNewPOM(driver);
		
		//Click Sales>Order>Edit>Scroll down to the bottom of page>Click Continue> Remove product>AddNewPdt>Continue>Save
		FilterPOM.clickSales();
		FilterPOM.clickOrder();
		Thread.sleep(3000);
		UpdateOrderNewPOM.clickEdit();
		//javascript to scroll down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 //This will scroll the web page till end.		
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
      
		UpdateOrderNewPOM.clickContinue();
		UpdateOrderNewPOM.clickRemove();
		UpdateOrderNewPOM.sendProduct("Lorem ipsum dolor sit amet");
		UpdateOrderNewPOM.sendQuantity("1");
		UpdateOrderNewPOM.clickAdd();
		UpdateOrderNewPOM.clickContinueCart();
		UpdateOrderNewPOM.clickContinuePymnt();
		UpdateOrderNewPOM.clickContinueShpmt();
		UpdateOrderNewPOM.clickSave();
		//Capturing Success message
		String expmsg=" Success: You have modified orders!  ";
		String actmsg=driver.findElement(By.xpath("//*[@id='content']/div[2]/div[1]")).getText();
		
		Assert.assertEquals(actmsg, expmsg);
		//Assert if order is updated
		screenShot.captureScreenShot("Updated Order");
		
		
		
		
	}
	
}
