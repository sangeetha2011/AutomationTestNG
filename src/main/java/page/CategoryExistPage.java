package page;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class CategoryExistPage extends BasePage {
	String item;
	WebDriver driver;

	public CategoryExistPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.CSS, using = "input[type='text'][name='categorydata']")WebElement ADD_CATEGORY_ELEMENTS;
	@FindBy(tagName="body")WebElement DUPLICATE_MESSAGE;
	@FindBy (how = How.XPATH,using = "//a[contains(text(),'Nevermind')]" )WebElement NEVERMIND_FIELD;

	public void addcategoryitem() {
		item = "BOOK" + randomNumber(1000);
		ADD_CATEGORY_ELEMENTS.sendKeys(item);

	}

	public void enterExistingitem() {

		ADD_CATEGORY_ELEMENTS.sendKeys(item);

	}

	public void pageTitle() {
		
		
		String handle = driver.getWindowHandle();
		driver.switchTo().window(handle);	
		
		}
	public void validateDuplicateMessage() throws InterruptedException {
		
		
		
	
	String text = DUPLICATE_MESSAGE.getText();
	System.out.println(text);
		if(text.contains("The category you want to add already exists: ")) {
			NEVERMIND_FIELD.click();
		}
	
	 
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
