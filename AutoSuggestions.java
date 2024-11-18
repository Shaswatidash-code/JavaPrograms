package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestions {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		//Write the xpath for search text field
		WebElement e1 = driver.findElement(By.name("q"));
		e1.sendKeys("Bangalore");
		Thread.sleep(2000);
		
		//For all the auto suggestion write the xpath
		List <WebElement> e2 = driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		
		//In list we have method called as size
		int length = e2.size();
		//e2.get(length-10).click();
		//e2.get(length-1).click();
		//Size() or length I can only use when I am dealing with many/List of components
		
		//1. Printed out the length of my auto suggestion
		System.out.println(length);
		
		for(int i= 0;i<length;i++)
		{
		
		
		//Print the auto suggestion based on index wise
		//WebElement a1 =e2.get(0);
		
		//2. Print all auto suggestion
		WebElement a1 = e2.get(i);
		//To print all the text
		String autosuggestion = a1.getText();
		System.out.println(autosuggestion);
		}
		e2.get(length-10).click();
	}

}

//Assignment 88: WAP to handle the auto suggestion for google search, Flipkart and Amazon Site.
