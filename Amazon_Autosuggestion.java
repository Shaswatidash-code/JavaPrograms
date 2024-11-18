package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Autosuggestion {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement e1 =driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("Shoe");
		Thread.sleep(2000);
		List <WebElement> e2 =driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		//e2.get(e2.size()-1).click();
		int length = e2.size();
		
		//print the length of my auto suggestion
		System.out.println(length);
		
		//for(int i=0;i<length;i++)
		//{
		WebElement a1 =	e2.get(2);
		//To print all the text
		String autosuggestion = a1.getText();
		System.out.println(autosuggestion);
		e2.get(length-8).click();
		
		//}
		
	}

}
//Print based on the index

//Assignment 88: WAP to handle the auto suggestion for google search, Flipkart and Amazon Site.
