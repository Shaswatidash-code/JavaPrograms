package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign88FlipkartAutosugg {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement e1 = driver.findElement(By.name("q"));
		e1.sendKeys("Dress");
		Thread.sleep(2000);
		
		//X path for auto suggestion
		List <WebElement> e2 = driver.findElements(By.xpath("//form[@class='_2rslOn header-form-search OpXDaO']/ul/li"));
		int length = e2.size();
		for(int i=0;i<length;i++)
		{
			WebElement a1 = e2.get(i);
			String autosuggestion = a1.getText();
			System.out.println(autosuggestion);
		}
		e2.get(length-8).click();
	
	}

}
//Assignment 88: WAP to handle the auto suggestion for google search, Flipkart and Amazon Site.

