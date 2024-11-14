package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Search {

	public static void main(String[] args) {
		//Lunch the empty browser
		ChromeDriver driver = new ChromeDriver();
		
		//To navigate to particular URL
		driver.get("https://www.google.com/");
		
		//To maximize the page
		driver.manage().window().maximize();
		
		//Find your element
		driver.findElement(By.name("q")).sendKeys("India");
		
		//On the same component I want to type Keys.enter
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

}

//Launching Google, typing india and pressing enter
