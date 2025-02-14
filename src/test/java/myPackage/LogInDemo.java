package myPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LogInDemo {
	
	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		
	//	options.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(options);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.get("xyz");
		
		driver.findElement(By.xpath("//input[@")).sendKeys("ABCD");
		
		System.out.println("Done");
		
	//	driver.close();
		
		
		System.out.println("Updated code on Friday....!!!!!!");
		
		
		System.out.println("I have made changes second time....!!!!!!");
		
	}

}
