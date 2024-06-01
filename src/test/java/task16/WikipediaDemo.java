package task16;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WikipediaDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "c:\\drivers\\chromedriver.exe");
		//launch browser
		WebDriver driver=new ChromeDriver();
		//navigate to google
		driver.navigate().to("https://www.Wikipedia.org/");
		//maximize the browser
		driver.manage().window().maximize();
		//search for query
	    driver.findElement(By.id("searchInput")).sendKeys("Artificial Intelligence",Keys.ENTER);
	    Thread.sleep(2000);
	    //click on history
	     driver.findElement(By.linkText("History")).click();
	     //print the title
	   System.out.println( driver.getTitle());
	
	

	}

}
