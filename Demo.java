package seleniumWithCrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO-PC\\Downloads\\Driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.amazon.in/");
	
	//driver.navigate().to(null);
	driver.get("https://mgj001.atlassian.net/jira/software/projects/GAUR/boards/1/backlog");
	
	driver.navigate().back();
	Thread.sleep(3000);
	
	driver.navigate().forward();
	Thread.sleep(3000);
	
	driver.navigate().refresh();
	
	System.out.println(driver.getCurrentUrl());
	
	Thread.sleep(3000);
	System.out.println(driver.getTitle());
	
	driver.quit();
	
	}

}
