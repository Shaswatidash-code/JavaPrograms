package seleniumPractice;

import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium06thNov {

	public static void main(String[] args) throws InterruptedException {
		//lunch the empty browser
		ChromeDriver driver = new ChromeDriver();
		
		//It will navigate to the particular URL the web site you have given in the particular point
		driver.get("https://www.facebook.com");
		
		//It will help you to get/fetch the title of the page.
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(3000);
		
		//It will close the parent tab or window
		//or it will close that browser/tab/window which has the control
		//driver.close();
		
		//It will give you the browser id of parent tab
		System.out.println(driver.getWindowHandle());
		
		//It will give you the browser id of the parent tab
		driver.getWindowHandles();		
		//It will close the parent tab 	or window together with all child window
		driver.quit();
	}

}
