package task18;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

public class JqueryDemo {
	
	public void dragAndDrop(WebDriver driver) {
		
		Actions action = new Actions(driver);
		//switching to iframe
		WebElement frameElement = driver.findElement(By.className("demo-frame"));
		  driver.switchTo().frame(frameElement);
		    //drag the source element
	         WebElement source=driver.findElement(By.id("draggable"));
		    //drop the source to destination
				WebElement destination=driver.findElement(By.id("droppable"));
				action.dragAndDrop(source, destination).build().perform();
				
				
	}
	public void checkColorProperty(WebDriver driver) {
		
		WebElement ele = driver.findElement(By.id("droppable"));
		String background=ele.getCssValue("background-color");
		System.out.println("RGB : "+ background);
		String hex = Color.fromString(background).asHex();
		System.out.println(hex); 

	
	}

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "c:\\drivers\\chromedriver.exe");
		//launch browser
		WebDriver driver=new ChromeDriver();
		//open guvi website
		driver.navigate().to("https://jqueryui.com/droppable/");
		//maximise browser window
		driver.manage().window().maximize();
		 JqueryDemo jdemo=new  JqueryDemo();
		 jdemo.dragAndDrop(driver);
		jdemo.checkColorProperty(driver);
		
		
		
	}

}
