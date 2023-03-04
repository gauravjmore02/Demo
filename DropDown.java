package seleniumWithCrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO-PC\\Downloads\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/campaign/landing.php?");
		driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[1]")).sendKeys("Gaurav");
		
		driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[2]")).sendKeys("More");
		
		driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[3]")).sendKeys("9112350328");
		
		driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[5]")).sendKeys("gjm1234m");
		
		 WebElement day= driver.findElement(By.xpath("//select[@name='birthday_day']"));
		 
		 Select s=new Select(day);
		 s.selectByVisibleText("9");
		 Thread.sleep(2000);
		 
		 WebElement month =driver.findElement(By.xpath("//select[@name='birthday_month']"));
		 
		 Select s1= new Select(month);
		 s1.selectByIndex(1);
		 Thread.sleep(2000);
		 
		 WebElement year =driver.findElement(By.xpath("//select[@name='birthday_year']"));
		 Select s2=new Select(year); 
		 s2.selectByValue("2002");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("(//label[@class='_58mt'])[2]")).click();
		 Thread.sleep(2000);
		 
		// driver.findElement(By.xpath("//button[@class='_6j mvm _6wk _6wl _58mi _3ma _6o _6v']")).click();
		// Thread.sleep(2000);
		 
		 driver.quit();

	}

}
