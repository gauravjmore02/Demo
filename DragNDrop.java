package seleniumWithCrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragNDrop {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		
		WebElement drag= driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop= driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions a=new Actions(driver);
		a.dragAndDrop(drag, drop).perform();
		Thread.sleep(5000);
		
		driver.quit();
	}

}
