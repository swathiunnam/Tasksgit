package task20;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatepickerDemo {
	
	public void selectYearAndMonth(WebDriver driver,String year,String month) throws InterruptedException {
		
		
		        //switch to frame
				driver.switchTo().frame(0);
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				 driver.findElement(By.xpath("//input[@id='datepicker']")).click();
			     Thread.sleep(1000);
				while(true) {
			    String currentyear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
				String currentmonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
				if(currentmonth.equals(month)&& currentyear.equals(year))
				{
				 break;
				}
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
				}
				
	}

	public void selectDate(WebDriver driver,String date) {
		
		
	        	//select date
				List<WebElement> alldates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr/td//a"));
				for(WebElement dt:alldates) {
					if(dt.getText().equals(date)) {
						
								dt.click();
								break;
					}
				}
				
	}
	
	public void printDate(WebDriver driver) throws InterruptedException {
		
		Thread.sleep(1000);
		WebElement dateEle= driver.findElement(By.xpath("//input[@id='datepicker']"));
		String date1=dateEle.getAttribute("value");
		System.out.println("Selected date is:"+date1);
		driver.quit();
	
	}
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "c:\\drivers\\chromedriver.exe");
		//launch browser
		WebDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//open google
		driver.get("https://jqueryui.com/datepicker/");
		DatepickerDemo demo=new DatepickerDemo();
		demo.selectYearAndMonth(driver, "2024", "June");
		demo.selectDate(driver,"22");
		demo.printDate(driver);
		
		}

}
