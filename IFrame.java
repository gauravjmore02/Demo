package seleniumWithCrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IFrame {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO-PC\\Downloads\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		Thread.sleep(2000);
		
		driver.switchTo().frame("frame1");
		driver.findElement(By.xpath("//input")).sendKeys("Hello");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frame2");
		
		WebElement Animal= driver.findElement(By.xpath("//select[@id='animals']"));
		Select s=new Select(Animal);
		s.selectByVisibleText("Baby Cat");
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
		driver.switchTo().frame("frame1");
		driver.switchTo().frame("frame3");
		driver.findElement(By.xpath("//input[@id='a']")).click();
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		
		
		
		Thread.sleep(5000);
		
		driver.quit();
		
	}

}
