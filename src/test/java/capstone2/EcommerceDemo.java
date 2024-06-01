package capstone2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EcommerceDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "c:\\drivers\\chromedriver.exe");
		//launch browser
		WebDriver driver=new ChromeDriver();
		//maximise window
		driver.manage().window().maximize();
		//navigate to google
		driver.navigate().to("https://www.bestbuy.com/");
		//validate url
		String actualUrl="https://www.bestbuy.com/";
		String url=driver.getCurrentUrl();
		System.out.println(url);
		if(url.contains("https://www.bestbuy.com/")) {
			System.out.println("The url is not broken");
		}
		else {
			System.out.println("The url is broken");
		}


	}

}
