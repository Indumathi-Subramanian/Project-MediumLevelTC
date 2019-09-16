package com.training.sanity.tests;

import com.training.pom.FilterPOM;
import com.training.pom.LoginPOM;
import com.training.pom.AddProductPOM;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddProduct extends LoginTests{

	private FilterPOM FilterPOM;
	private AddProductPOM AddProductPOM;
	
	@Test(priority=2)
	public void addCategory()throws InterruptedException{
		FilterPOM = new FilterPOM(driver);
		AddProductPOM AddProductPOM = new AddProductPOM(driver);
		//Click Catalog>ProductLink>AddNew>Enter Product Name,metatitle,datamodel,keep other tabs same>click save
		AddProductPOM.clickCatalog();
		AddProductPOM.clickProductLink();
		AddProductPOM.clickAddNew();
		AddProductPOM.addProductName("Finger Ring");
		AddProductPOM.addMetaTitle("Finger Ring for ladies");
		AddProductPOM.dataTab();
		AddProductPOM.addDataModel("Ring");
		AddProductPOM.clickLinks();
		AddProductPOM.clickCategory();
		AddProductPOM.selCategory();
		AddProductPOM.clickSave();
		
		//Capturing Success msg
				String expmsg=" Success: You have modified products!      ";
				String actmsg=driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]")).getText();
				
				Assert.assertEquals(actmsg, expmsg);
		//Screenshot
				screenShot.captureScreenShot("Added New Product");
		
		
	}
}
