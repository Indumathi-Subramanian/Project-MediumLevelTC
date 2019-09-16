package com.training.pom;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddProductPOM {
	public WebDriver driver; 
	
	public AddProductPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id='menu-catalog']/a/i")
   	private WebElement catalogIcon;
	
	@FindBy(xpath="//*[@id='menu-catalog']/ul/li[2]/a")
   	private WebElement productLink;
	  
	@FindBy(xpath="//*[@id='content']/div/div/div/a")
   	private WebElement addNew;
	 
	@FindBy(xpath="//*[@id='input-name1']")
   	private WebElement pdtName;
	 
	@FindBy(xpath="//*[@class='note-editable panel-body']")
   	private WebElement pdtDesc;
	  
	@FindBy(xpath="//*[@id='input-meta-title1']")
   	private WebElement metaTitle;
	
	@FindBy(xpath="//*[contains(text(),'Data')]")
   	private WebElement dataTab;
	
	@FindBy(xpath="//*[@id='input-model']")
   	private WebElement addDataModel;
	
	@FindBy(xpath="//*[contains(text(),'Links')]")
   	private WebElement linksTab;
	 
	@FindBy(xpath="//*[@id='input-category']")
   	private WebElement catalogdpdwn;
	 
	@FindBy(xpath="//*[@id='tab-links']/div[2]/div/ul/li[1]")
   	private WebElement selOption;
	//  selecting ORNAMENTS
	
	//keep other tab values as default and click save
	@FindBy(xpath="//*[@class='fa fa-save']")
   	private WebElement savebtn;
	
	
	public void clickCatalog() {
		this.catalogIcon.click();
	}
	public void clickProductLink() {
		this.productLink.click();
	}
	public void clickAddNew() {
		this.addNew.click();
	}
	public void addProductName(String pdtName) {
		this.pdtName.clear();
		this.pdtName.sendKeys(pdtName);
	}
	public void addMetaTitle(String metaTitle) {
		this.metaTitle.clear();
		this.metaTitle.sendKeys(metaTitle);
	}
	public void dataTab() {
		this.dataTab.click();
	}
	public void addDataModel(String addDataModel) throws InterruptedException {
		this.addDataModel.clear();
		this.addDataModel.sendKeys(addDataModel);
		Thread.sleep(3000);
	}
	public void clickLinks() {
		this.linksTab.click();
	}
	public void clickCategory() {
		this.catalogdpdwn.click();
	}
	public void selCategory() {
		this.selOption.click();
	}
	public void clickSave() {
		this.savebtn.click();
	}

}
