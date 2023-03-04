package seleniumWithCrome;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenSHot {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO-PC\\Downloads\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File des= new File("C:\\Users\\LENOVO-PC\\eclipse-workspace\\ControlStatement\\src\\seleniumWithCrome\\abc.png");
		
		FileHandler.copy(src, des);
		
		driver.quit(); 
		

	}

}
