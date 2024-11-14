package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RightClickDisabled {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement e1 = driver.findElement(By.linkText("CONTINUE TO LOGIN"));
		e1.click();
		
		WebElement e2 = driver.findElement(By.name("userName"));
		e2.sendKeys("SHASWATI");
		
		WebElement e3 = driver.findElement(By.name("password"));
		e3.sendKeys("Shaswati#4");
		
	}

}

//How to automate those web pages which right click is disabled.
