
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Checkboxes 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.edge.driver",  "C:\\Temp1\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise");
		
		System.out.println(driver.findElement(By.cssSelector("input#ctl00_mainContent_chk_IndArm")).isSelected());
		driver.findElement(By.cssSelector("input#ctl00_mainContent_chk_IndArm")).click();
		//driver.findElement(By.name("ctl00$mainContent$chk_Unmr")).click();
		System.out.println(driver.findElement(By.cssSelector("input#ctl00_mainContent_chk_IndArm")).isSelected());
		
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		//Checking how many checkboxes selected
		List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[type='checkbox']"));
		int selected =0;
		for(WebElement count:checkboxes)
		{
			if(count.isSelected())
			{
				selected ++;
			}
		}
		System.out.println(selected);
				

	}

}
