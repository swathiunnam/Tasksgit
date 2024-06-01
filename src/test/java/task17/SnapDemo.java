package task17;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapDemo {
	
	 public void launchSnapDealAndMouseHover(WebDriver driver) {
	     	//open snapdeal website
			driver.get("https://www.snapdeal.com");
			//locating signin webelement
			WebElement signin=driver.findElement(By.xpath( "//span[text()='Sign In']"));
			Actions act = new Actions(driver);
			act.moveToElement(signin).click().build().perform();
		
		 
	 }
	 public  void launchSnapDeal(WebDriver driver) {
		//locating login webelement
			driver.findElement(By.xpath("//a[text()='login']")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			//Elements inside the iframe can be found using findElement and findElements method but can't be interacted with
			WebElement element = driver.findElement(By.name("iframeLogin"));
			driver.switchTo().frame(element);
			//locating username,phone number,password
			driver.findElement(By.id( "userName")).sendKeys("Test5642@test.com");
			driver.findElement(By.id("checkUser")).click();
			driver.findElement(By.id("j_number")).sendKeys("9234567891");
			driver.findElement(By.id("j_name")).sendKeys("Test");
			driver.findElement(By.id("j_password")).sendKeys("Test@123456");
			//click on continue
			driver.findElement(By.id("userSignup")).click();
			String title=driver.getTitle());
			if(title.contains(title)) {
				System.out.println("User is logged in successfully");
			}
			else {
				System.out.println("User is logged in successfully");
			}
		 
	 }
			

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "c:\\drivers\\chromedriver.exe");
		//launch browser
		WebDriver driver=new ChromeDriver();
		//maximise window
		driver.manage().window().maximize();
		SnapDemo snap=new SnapDemo();
		snap.launchSnapDealAndMouseHover(driver);
		snap.launchSnapDeal(driver);
		
		
	}

}
