package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import page.AddCategory;
import page.CategoryExistPage;
import util.BrowserFactory;

public class CategoryExistTest {
	
	WebDriver driver;
	@Test
public void checkduplicateCategory() throws InterruptedException {
		 driver = BrowserFactory.init();
		 AddCategory addcategory = PageFactory.initElements(driver, AddCategory.class);
		 CategoryExistPage categoryExist =  PageFactory.initElements(driver,  CategoryExistPage.class);
		 categoryExist.addcategoryitem();
		 addcategory.clickCategoryButton();
		
		 
		 categoryExist.enterExistingitem();
		 addcategory.clickCategoryButton();
		
		 categoryExist.pageTitle();
		 categoryExist.validateDuplicateMessage();
		 
		 
	}
	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
