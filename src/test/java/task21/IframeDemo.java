package task21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "c:\\drivers\\chromedriver.exe");
		//launch browser
		WebDriver driver=new ChromeDriver();
		//maximise window
		driver.manage().window().maximize();
		//open  website
		driver.get("https://the-internet.heokuapp.com/iframe");
		//switch to iframe
		WebElement element = driver.findElement(By.xpath("//iframe[@frameborder='0']"));
	    driver.switchTo().frame(element);
		
		

	}

}
