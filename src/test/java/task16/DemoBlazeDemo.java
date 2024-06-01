package task16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoBlazeDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "c:\\drivers\\chromedriver.exe");
		//launch browser
		WebDriver driver=new ChromeDriver();
		//navigate to google
		driver.navigate().to("https://www.demoblaze.com/");
		//maximize the browser
		driver.manage().window().maximize();
		//validating the url of the page
		String url=driver.getCurrentUrl();
		if(url.contains("STORE")) {
			System.out.println("Page Landed On Correct Website");
		}
		else {
			System.out.println("Page Not Landed On Correct Website");
		}
		

	}

}
