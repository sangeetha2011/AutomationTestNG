package test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import page.AddCategory;

import util.BrowserFactory;

public class CategoryTest {
	
	WebDriver driver;
	@Test
	public void categoryTest() {
		 driver = BrowserFactory.init();
		 AddCategory addcategory = PageFactory.initElements(driver, AddCategory.class);
		 addcategory.addCategory();
		 addcategory.clickCategoryButton();
		 addcategory.validateNewCategory();
		
		
		
	}
	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	
	
	
	

}
