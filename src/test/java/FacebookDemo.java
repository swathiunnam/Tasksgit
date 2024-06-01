import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "c:\\drivers\\chromedriver.exe");
		//launch browser
		WebDriver driver=new ChromeDriver();
		//open guvi website
		driver.get("https://www.facebook.com/");
		//maximise browser window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(100));
		String actualTiltle="facebook.com";
		String title=driver.getCurrentUrl();
		System.out.println("Title of page is:"+title);
		if(title.contains(actualTiltle)) {
			System.out.println("website has been redirected to facebook home page");
			
		}
		else {
			System.out.println("website has not been redirected to facebook home page");
		}
		
		//inspect create new account
	driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
		//laocating first name
		driver.findElement(By.name("firstname")).sendKeys("Test");
		//laocating last name
		driver.findElement(By.name("lastname")).sendKeys("User");
		//locating email
		driver.findElement(By.name("reg_email__")).sendKeys("Testuser@test.com");
		//locating pwd
		driver.findElement(By.name("reg_passwd__")).sendKeys("Test@123");
		
		
		
		
		
		
	}

}
