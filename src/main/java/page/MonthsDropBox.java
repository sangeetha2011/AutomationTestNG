package page;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class MonthsDropBox extends BasePage{
	WebDriver driver;
	public MonthsDropBox(WebDriver driver) {
		driver = this.driver;
	}
	
	@FindBy(how=How.CSS,using ="select[name='due_month']")WebElement MONTH_DROPDOWN;
	
	public void monthdropDown() {
		
	Select sc =  new Select(MONTH_DROPDOWN);
		
	Set <String> st1 = new LinkedHashSet<String>();
	String [] sr = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};

	
	System.out.println(st1.size());
	List <String> st = new ArrayList<String>();
	List <WebElement> op = sc.getOptions();
		 
	      int size = op.size();
	      
	      for(int i =1; i<size ; i++){
	    	 
	    	  String options = op.get(i).getText(); 	 
	       st.add(options);
	      }
	      Object [] mylist = st.toArray();
	      
	        if(st!=null) {
	        	
	        	
	        	 for(int i =0;i<=sr.length-1;i++) {
	        	
	        	 System.out.println(sr[i].toString());
	        	 
	        	 System.out.println(mylist[i].toString());
	        	 Assert.assertEquals(mylist[i].toString(), sr[i].toString(), "Equals");
	        	 }
	        	
	        }
	      
	      
		
	}

	
}
