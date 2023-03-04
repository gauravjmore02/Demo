package seleniumWithCrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO-PC\\Downloads\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("9112350328");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@class ,'_2KpZ6l _2doB4z')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[contains(@class ,'_2xm1JU')]")).click();
		Thread.sleep(2000);
		
		
		
		
		
		driver.quit();
		
	}

}
