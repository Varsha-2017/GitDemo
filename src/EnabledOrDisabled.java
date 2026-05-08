import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class EnabledOrDisabled 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.edge.driver", "C:\\Temp1\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
//		WebElement radio = driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1"));
//	    radio.click();   	
//	   	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
		//System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
	   	{
	   		System.out.println("Disabled");
	   		Assert.assertTrue(true);
	   	}
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
	  // 	System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
	   	
	   //	System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
	   	
	   	if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
	   	{
	   		System.out.println("Enabled");
	   		Assert.assertTrue(true);        
	    }
	}

}
