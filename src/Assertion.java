
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class Assertion {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Temp1\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise");

		Assert.assertFalse(driver.findElement(By.cssSelector("input#ctl00_mainContent_chk_IndArm")).isSelected());

		driver.findElement(By.cssSelector("input#ctl00_mainContent_chk_IndArm")).click();

		Assert.assertTrue(driver.findElement(By.cssSelector("input#ctl00_mainContent_chk_IndArm")).isSelected());

		driver.findElement(By.name("ctl00$mainContent$chk_Unmr")).click();

		System.out.print(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

		Assert.assertEquals(driver.findElements(By.cssSelector("input[type='checkbox']")).size(), 6);

	}

}
