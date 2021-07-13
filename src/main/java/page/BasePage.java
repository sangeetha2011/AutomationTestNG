package page;

import java.util.Random;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
	
	
	public int  randomNumber(int numbers) {
		Random random = new Random();
		int number = random.nextInt(numbers);
		return number;
		
	}
	public  void selectElement(WebElement element) {
		 Select sel = new Select(element);
		   //sel.getOptions();
		}
public  void clickElement(WebElement element,WebDriver driver ) {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].click();", element);
	   }
}
