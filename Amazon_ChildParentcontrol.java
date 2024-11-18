package seleniumPractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_ChildParentcontrol {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		//Enter the shoe in the search field
		WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("shoe"+Keys.ENTER);
		
		//Click on the 1st search result
		WebElement e2 = driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
		e2.click();
		
		//see the parent and child id by using getwindowhandels()
		//System.out.println(driver.getWindowHandles());
		Set<String> id = driver.getWindowHandles();
		
		//Separating both the id from each other
		Iterator <String> i1 = id.iterator();
		String parentid = i1.next();
		String childid = i1.next();
		
		//print both parent and child id separately
		System.out.println(parentid);
		System.out.println(childid);
		
		//move the control to the child
		driver.switchTo().window(childid);
		
		//Click on the Add To cart button
		WebElement e3 = driver.findElement(By.id("add-to-cart-button"));
		e3.click();
		 
		Thread.sleep(4000);
		//close the child window
		driver.close();	
	}

}
//Lunch Amazon,search for Shoe, click on the 1st shoe and click on Add To cart
