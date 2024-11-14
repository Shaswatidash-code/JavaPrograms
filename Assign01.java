package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign01 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("test@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("facebook1");
		driver.findElement(By.name("login")).sendKeys(Keys.ENTER);
		}

}

//Assignment 79: Launching Google, typing India,and pressing enter.
