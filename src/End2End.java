
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class End2End 
{

	public static <select> void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.cssSelector("input#ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[text()=' Bengaluru (BLR)']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@value='GOI'])[2]")).click();
	//	driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[text()=' Goa (GOI)']")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("ui-state-active")).click();
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
		{
			System.out.print("Disabled");
		}
		else
		{
			Assert.assertTrue(false);
			driver.close();
		}
		Thread.sleep(2000);
		WebElement staticdropdown =  driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select currency = new Select(staticdropdown);
		currency.selectByIndex(2);
		Thread.sleep(2000);
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		int i=0;
		while(i<3)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()=' Indian Armed Forces']")).click();		
		driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();
		
	}

}
