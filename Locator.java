package seleniumWithCrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO-PC\\Downloads\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("nav-link-accountList")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("email")).sendKeys("gauravjmore02@gmail.com");
		driver.findElement(By.className("a-button-input")).click();
		
		driver.findElement(By.xpath( "//a[contains(text(),' Forgot Password')]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.partialLinkText("Cust")).click();
		Thread.sleep(5000);
		driver.quit();

	}

}
