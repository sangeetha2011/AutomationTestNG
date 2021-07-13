package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class AddCategory extends BasePage{
	
	public String categoryName;
	WebDriver driver;
	public AddCategory(WebDriver driver) {
		this.driver = driver;
	}
	@FindBy(how = How.CSS, using ="input[type='text'][name='categorydata']")WebElement ADD_CATEGORY_ELEMENTS;
	@FindBy(how = How.CSS, using ="input[value='Add category'][name='submit']")WebElement CLICK_CATEGORY_BOX_ELEMENTS;
    
	
	
	public void addCategory() {
		
		
		 categoryName = "Hello"+ randomNumber(100);
		 ADD_CATEGORY_ELEMENTS.sendKeys(categoryName);
		
		
		
	}
	
	public void clickCategoryButton() {
		
		
		CLICK_CATEGORY_BOX_ELEMENTS.click();
		
		}
	
	
	
	public void validateNewCategory() {
		
	
		
		String before ="//span[text()='";
		String After = "']";
		
		WebElement Category = driver.findElement(By.xpath(before+categoryName+After));
		
		String name = Category.getText();
		
		Assert.assertEquals(name.toString(), categoryName, "not there in the list");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
