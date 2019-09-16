package com.training.sanity.tests;

import com.training.pom.FilterPOM;
import com.training.pom.LoginPOM;
import com.training.pom.FilterStatusDatePOM;
import com.training.sanity.tests.LoginTests;
import com.training.sanity.tests.FilterStatusDate;
import com.training.pom.AddCategoryPOM;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddCategory extends LoginTests{
	public static FilterPOM FilterPOM;
	public static FilterStatusDatePOM FilterStatusDatePOM;
	public static AddCategoryPOM AddCategoryPOM;
	
	@Test(priority=2)
	public void addCategory()throws InterruptedException{
		FilterPOM = new FilterPOM(driver);
		FilterStatusDatePOM FilterStatusDatePOM = new FilterStatusDatePOM(driver);
		AddCategoryPOM AddCategoryPOM = new AddCategoryPOM(driver);
		
		//Click Catalog>Catalog Link>Add New>Add Category Name,Description, Metatitle,metaDesc> click Save
		AddCategoryPOM.clickCatalog();
		AddCategoryPOM.clickCatalogLink();
		AddCategoryPOM.clickAdd();
		AddCategoryPOM.addCategoryName();
		AddCategoryPOM.addCategoryDesc();
		AddCategoryPOM.addMetaTitle();
		AddCategoryPOM.addMetaDesc();
		//AddCategoryPOM.addMetaKeyword();
		AddCategoryPOM.clickSave();
		
		//Capturing Success msg
		String expmsg=" Success: You have modified categories!      ";
		String actmsg=driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]")).getText();
		
		Assert.assertEquals(actmsg, expmsg);
		//screenshot
		screenShot.captureScreenShot("Added New Category");
		
	}
	
}
