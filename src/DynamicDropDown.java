import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class DynamicDropDown
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.edge.driver", "C:\\Temp1\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.name("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		//driver.findElement(By.xpath("//a[@value='MAA']")).click();
        driver.findElement(By.xpath("//a[text()=' Chennai (MAA)']")).click();
        
      //  driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(4));
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[@value='COK'])[2]")).click();
        
        //without index
      //  driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='COK']")).click();

	}

}
