package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Search {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		//lunch the url
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Shoe");
		driver.findElement(By.id("nav-search-submit-button")).click();
	}

}

//Lunch Amazon India, type shoe, and click on the search button