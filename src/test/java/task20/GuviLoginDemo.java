package task20;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GuviLoginDemo {
	
	public void signUp(WebDriver driver) throws InterruptedException {
		
		    driver.findElement(By.xpath("//a[text()='Sign up']/parent::li")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.id("name")).sendKeys("Test");
			driver.findElement(By.id("email")).sendKeys("Test5643@test.com");
			driver.findElement(By.id("password")).sendKeys("Test@5642");
			driver.findElement(By.id("mobileNumber")).sendKeys("9951176891");
			driver.findElement(By.id("signup-btn")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			String title=driver.getTitle();
			if(title.contains("sign up")) {
				System.out.println("User registered successfully");
			}
			else {
				System.out.println("Registration failed");
				Thread.sleep(1000);
			}
			
			
			driver.navigate().to("https://www.guvi.in/");
	}

	public void login(WebDriver driver) {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[text()='Login']/parent::li")).click();
		driver.findElement(By.id("email")).sendKeys("Test5642@test.com");
		driver.findElement(By.id("password")).sendKeys("Test@5642");
		driver.findElement(By.xpath("//a[text()='Login']/parent::div")).click();
		String title=driver.getTitle();
		if(title.contains("sign up")) {
			System.out.println("User registered successfully");
		}
		else {
			System.out.println("Registration failed");
		}
	
		
	}

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "c:\\drivers\\chromedriver.exe");
		//launch browser
		WebDriver driver=new ChromeDriver();
		//maximize the browser"
		driver.manage().window().maximize();
		//open google
		driver.get("https://www.guvi.in/");
		GuviLoginDemo guvi=new GuviLoginDemo();
		guvi.signUp(driver);
		guvi.login(driver);
	   		
	}

}
