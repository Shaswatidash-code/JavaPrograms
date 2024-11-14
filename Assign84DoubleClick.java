package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assign84DoubleClick {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.xpath("//input[@name = 'q']"));
		Actions a1 = new Actions(driver);
		a1.doubleClick(e1).perform();
	}

}

//Assignment 84: WAP to Double Click on any component in Flipkart Website