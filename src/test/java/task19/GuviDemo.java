package task19;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GuviDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "c:\\drivers\\chromedriver.exe");
		//launch browser
		WebDriver driver=new ChromeDriver();
		//maximise browser
		driver.manage().window().maximize();
		//open guvi
		driver.get("https://www.guvi.in/register");
		//id locator
	    driver.findElement(By.id("name")).sendKeys("Test");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("email")).sendKeys("Test5642@test.com");
		driver.findElement(By.id("password")).sendKeys("Test@5642");
		driver.findElement(By.id("mobileNumber")).sendKeys("9123456789");
		driver.findElement(By.id("signup-btn")).click();
		
		
		//xpath
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		driver.findElement(By.id("email")).sendKeys("Test5642@test.com");
		driver.findElement(By.id("password")).sendKeys("Test@5642");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[text()='Login']/parent::div")).click();
		
		
		//css selector
		driver.findElement(By.cssSelector("input#name")).sendKeys("Test");
		driver.findElement(By.cssSelector("input#email")).sendKeys("Test5642@test.com");
		driver.findElement(By.cssSelector("input#password")).sendKeys("Test@5642");
		driver.findElement(By.cssSelector("input#mobileNumber")).sendKeys("9123456789");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("signup-btn")).click();
		
		//class
		WebElement logo=driver.findElement(By.className("logo"));
		boolean b=logo.isDisplayed();
		System.out.println(b);
		
		
		//tag name
		List<WebElement> links=driver.findElements(By.tagName("a"));
		int linkscount=links.size();
		System.out.println("Total no of links :"+linkscount);
		
	}

}
