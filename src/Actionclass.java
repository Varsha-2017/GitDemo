import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclass 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.edge.driver", "C:\\Temp1\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		Actions a = new Actions(driver);
		
		//To Hover 
		a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
		
		//To enter in Uppercase
		a.moveToElement(driver.findElement(By.name("field-keywords"))).click().keyDown(Keys.SHIFT).sendKeys("chocolateCAKE").build().perform();
		
		//To select anything
		a.moveToElement(driver.findElement(By.name("field-keywords"))).doubleClick().build().perform();
		
		//To right-click
		a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).contextClick().build().perform();
		
	}
		

}
