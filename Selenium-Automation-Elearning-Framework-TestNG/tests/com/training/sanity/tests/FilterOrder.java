package com.training.sanity.tests;

import com.training.generics.ScreenShot;
import com.training.pom.FilterPOM;
import com.training.pom.LoginPOM;
import com.training.sanity.tests.LoginTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FilterOrder extends LoginTests{
	
	private FilterPOM FilterPOM;

	@Test(priority=2)
	//Enter OrderId,Name and Filter Order
	public void validateFilterOrder() throws InterruptedException {
		FilterPOM = new FilterPOM(driver); 
		
		  
				FilterPOM.clickSales();
				FilterPOM.clickOrder();
				FilterPOM.sendOrderid("243");
				FilterPOM.sendCustName("Indu S");
				FilterPOM.clickFilter();
				WebElement Item = driver.findElement(By.xpath("//*[@id='form-order']/div/table/tbody/tr/td[3]"));
				Assert.assertTrue(Item.isDisplayed());
						
				screenShot.captureScreenShot("Second");
				Thread.sleep(3000);
		
		}
}
