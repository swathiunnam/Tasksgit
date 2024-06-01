package task15;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "c:\\drivers\\chromedriver.exe");
		//launch browser
		WebDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		Thread.sleep(500);
		//open google
		driver.get("https://google.com/");
		//Xpath for google search
		driver.findElement(By.xpath("//*[@id='APjFqb']")).sendKeys("Selenium Browser Driver",Keys.ENTER);
	

	}

}
