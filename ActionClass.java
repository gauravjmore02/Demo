package seleniumWithCrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/droppable/");
		
		WebElement DubleC=driver.findElement(By.xpath("(//a[text()='jQuery UI'])[2]"));
		
		Actions a=new Actions(driver);
		a.doubleClick(DubleC).perform();
		
		WebElement RightC=driver.findElement(By.xpath("(//a[text()='jQuery UI'])[2]"));
		Actions a1= new Actions(driver);
		a1.contextClick(RightC).perform();
		
		WebElement MoveCurser=driver.findElement(By.xpath("//a[text()='Contribute']"));
		Actions a2=new Actions(driver);
		a2.moveToElement(MoveCurser).perform();
		
		
		
		Thread.sleep(2000);
		driver.quit();
	}

}
