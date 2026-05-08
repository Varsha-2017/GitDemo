
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AutoSuggestiveDropdown 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.edge.driver",  "C:\\Temp1\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise");
		
		//driver.findElement(By.xpath("//input[@placeholder='Type to Select']")).sendKeys("Ind");
		driver.findElement(By.id("autosuggest")).sendKeys("Ar");
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
		
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
	
		for(WebElement choose: options)
		{
			if(choose.getText().equalsIgnoreCase("Aruba"))
			{
				
				choose.click();
				System.out.println(choose);
				break;
			}
		}
		
	}

}
