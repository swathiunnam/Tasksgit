import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GuviDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "c:\\drivers\\chromedriver.exe");
		//launch browser
		WebDriver driver=new ChromeDriver();
		//open guvi website
		driver.get("https://www.guvi.in");
		//maximise browser window
		driver.manage().window().maximize();
		
		//locators
		//id
		driver.findElement(By.id("//a[@id='navbarDropdown']/ancestor::ul")).click();
		//xpath for locating courses webelement
		//driver.findElement(By.xpath("//a[text()='Courses']/parent::li")).click();

	}

}
