package capstone1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SpicejetDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "c:\\drivers\\chromedriver.exe");
		//launch browser
		WebDriver driver=new ChromeDriver();
		//maximise window
		driver.manage().window().maximize();
		//navigate to google
		driver.navigate().to("https://www.spicejet.com/");
	//inspect signup
		driver.findElement(By.xpath("//div[text()='Signup']")).click();
		String title=driver.getTitle();
		System.out.println(title);
		if(title.contains(" Flight Booking for Domestic and International")) {
			System.out.println("User successfully directed to sign up page");
		}
		else {
			System.out.println("User failed directed to sign up page");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//switch to frame
		driver.switchTo().frame("FullStory-iframe");
		
		driver.findElement(By.id("first_name")).sendKeys("Asha");
		driver.findElement(By.id("last_name")).sendKeys("User");
		driver.findElement(By.id("email_id")).sendKeys("Asha123@gmail.com");
		driver.findElement(By.id("new-password")).sendKeys("Test@123456");
		driver.findElement(By.id("c-password")).sendKeys("Test@123456");

	}

}
