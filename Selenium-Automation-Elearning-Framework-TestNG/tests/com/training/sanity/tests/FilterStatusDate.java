package com.training.sanity.tests;

import com.training.pom.FilterPOM;
import com.training.pom.LoginPOM;
import com.training.pom.FilterStatusDatePOM;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FilterStatusDate extends LoginTests{
	private FilterPOM FilterPOM;
	private FilterStatusDatePOM FilterStatusDatePOM;
	
	@Test(priority=2)
	public void filterstatusdate() throws InterruptedException{
		FilterPOM = new FilterPOM(driver);
		FilterStatusDatePOM FilterStatusDatePOM = new FilterStatusDatePOM(driver);
		
		//Click Sales>Order>Enter Orderid>EnterDateAdded>Enter CustomerName,Total>ModifiedDate>click Filter
		FilterPOM.clickSales();
		FilterPOM.clickOrder();
		FilterPOM.sendOrderid("250");
		FilterStatusDatePOM.selOrder();
		FilterStatusDatePOM.selDateAdded("2019-09-05");
		FilterPOM.sendCustName("Indu S"); 
		FilterStatusDatePOM.sendtotal("100");
		FilterStatusDatePOM.selDateModified("2019-09-10");
		FilterPOM.clickFilter();
		Thread.sleep(3000);
		//Capturing if correct Order Filtered 
		String exp="250";
		String act=driver.findElement(By.xpath("//*[@id='form-order']/div/table/tbody/tr/td[2]")).getText();
		System.out.println(exp);
		System.out.println(act);
		Assert.assertEquals(act, exp);
		//screenshot
		screenShot.captureScreenShot("Filtered Order");
		
		
		
	}
}
