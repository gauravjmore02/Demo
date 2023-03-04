package seleniumWithCrome;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChildBrowserPopup {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://seleniumsample.blogspot.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@class='feed-link']")).click();
		driver.findElement(By.xpath("//a[text()='Blogger']")).click();
		
		Set<String>ids =driver.getWindowHandles();
		
		ArrayList a=new ArrayList(ids);
		
		System.out.println(driver.getTitle());
		
		 Thread.sleep(2000);
		 System.out.println(a.get(1));
		 driver.switchTo().window((String) a.get(1)); 
		// System.out.println(driver.getTitle());
		 
		 Thread.sleep(2000);
		 System.out.println(a.get(2));
		 driver.switchTo().window((String) a.get(2)); 
		// System.out.println(driver.getCurrentUrl());
		 
		 driver.close();
		 driver.quit();
		
	}

}
