package com.training.pom;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AddCategoryPOM {
	public WebDriver driver; 
	
	public AddCategoryPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id='menu-catalog']/a/i")
   	private WebElement catalogIcon;
	
	@FindBy(xpath="//*[@id='menu-catalog']/ul/li/a")
   	private WebElement catalogLink;
	
	@FindBy(xpath="//*[@id='content']/div/div/div/a/i[@class='fa fa-plus']")
   	private WebElement addIcon;
	   
	@FindBy(xpath="//*[@id='input-name1']")
   	private WebElement categoryName;
	 	
	@FindBy(xpath="//*[@class='note-editable panel-body']")
   	private WebElement catalogDesc;
	
	@FindBy(xpath="//*[@id='input-meta-title1']")
   	private WebElement metaTitle;
	 
	@FindBy(xpath="//*[@id='input-meta-description1']")
   	private WebElement metDesc;
	   
	@FindBy(xpath="//*[@id='input-meta-keyword1']")
   	private WebElement metaKeyword;
	
	@FindBy(xpath="//*[@class='fa fa-save']")
   	private WebElement savebtn;
	
	@FindBy(xpath="//*[@class='alert alert-success']")
   	private WebElement successMsg;
	
	public void clickCatalog() {
		this.catalogIcon.click();
	}
	public void clickCatalogLink() {
		this.catalogLink.click();
	}
	public void clickAdd() {
		this.addIcon.click();
	}
	public void addCategoryName() {
		this.categoryName.clear();
		this.categoryName.sendKeys("ORNAMENTS");
	}
	public void addCategoryDesc() {
		this.catalogDesc.clear();
		this.catalogDesc.sendKeys("ornaments for ladies");
	}
	public void addMetaTitle() {
		this.metaTitle.clear();
		this.metaTitle.sendKeys("ORNAMENTS");
	}
	public void addMetaDesc() {
		this.metDesc.clear();
		this.metDesc.sendKeys("ornaments for ladies");
	}
	/*public void addMetaKeyword() {
		this.metaKeyword.clear();
		this.metaKeyword.sendKeys("ornaments for ladies");
	}*/
	public void clickSave() {
		this.savebtn.click();
	}

	
	
	
	
	

}
