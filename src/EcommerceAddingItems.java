import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class EcommerceAddingItems 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.edge.driver", "C:\\Temp1\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		
/*
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		for (int i = 0; i < products.size(); i++)
		{
			//System.out.println(products.get(i).getText());
			String name = products.get(i).getText();
			if (name.contains("Beetroot")) 
			{
				//System.out.println(driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).getText());
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				break;
			}
		}
*/
		int j = 0;
		String[] veggis = {"Carrot","Beans","Cucumber"};
		List <WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		for(int i=0 ; i< products.size(); i++)
		{
			String[] name= products.get(i).getText().split("-");
			String finalname = name[0].trim();
					
			List newveggis = Arrays.asList(veggis);
	/*		List<String> newveggis =new ArrayList<>( Arrays.asList(veggis));
			newveggis.add("Tomato");
	*/
			if(newveggis.contains(finalname))
			{
				j++;
			//	driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
			//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.findElements(By.cssSelector("div.product-action")).get(i).click();
				if(j==veggis.length)
				{
					break;
				}
			}
		}
		

	}

}
