package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assign85Rightclick {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.linkText("Become a Seller"));
		Actions a1 = new Actions(driver);
		a1.contextClick(e1).perform();
	}

}

//Assignment 85: WAP to Right Click on any component in Flipkart Website