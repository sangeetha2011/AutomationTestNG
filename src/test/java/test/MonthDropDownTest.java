package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import page.AddCategory;
import page.MonthsDropBox;
import util.BrowserFactory;

public class MonthDropDownTest {
	WebDriver driver;
	@Test
	public void check_moth_dropdown() {
		driver = BrowserFactory.init();
		 MonthsDropBox  monthsDropBox = PageFactory.initElements(driver,  MonthsDropBox.class);
		 monthsDropBox.monthdropDown();
}
	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}