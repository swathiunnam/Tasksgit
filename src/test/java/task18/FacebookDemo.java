package task18;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookDemo {
	
	
	
	public void launchFacebook(WebDriver driver) {
		        //open facebook
				driver.get("https://www.facebook.com/");
				//maximise browser window
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofMillis(100));
				String actualtitle="log in";
				String tilte=driver.getTitle();
				System.out.println("Title of page is:"+tilte);
				if(tilte.contains(actualtitle)) {
					System.out.println("website has been redirected to facebook home page");
					
				}
				else {
					System.out.println("website has not been redirected to facebook home page");
				}
		
	}
	public void createAccount(WebDriver driver) {
		//inspect create new account
	    driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//laocating first name
		driver.findElement(By.name("firstname")).sendKeys("Test");
		//laocating last name
		driver.findElement(By.name("lastname")).sendKeys("User");
		//locating email
		driver.findElement(By.name("reg_email__")).sendKeys("Testuser@gmail.com");
		//reenter email
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("Testuser@gmail.com");
		//locating pwd
		driver.findElement(By.name("reg_passwd__")).sendKeys("Test@123");
		
	}
	
	public void selectDob(WebDriver driver,String year,String month,String day) {
		//selecting year 
		WebElement yearDropDown=driver.findElement(By.id("year"));
		Select selectYear=new Select(yearDropDown);
		selectYear.selectByVisibleText(year);
		////selecting month
		WebElement monthDropDown=driver.findElement(By.id("month"));
		Select selectMonth=new Select(monthDropDown);
		selectMonth.selectByVisibleText(month);
		////selecting day
		WebElement dayDropDown=driver.findElement(By.id("day"));
		Select selectDay=new Select(dayDropDown);
		selectDay.selectByVisibleText(day);
	}
	
	public void selectGenderAndSignup(WebDriver driver) {
		
	List<WebElement> radioButton=driver.findElements(By.name("sex"));
	for(WebElement r:radioButton)
	{
		if(r.getAttribute("value").equalsIgnoreCase("1")) {
			r.click();
		}
	}
	driver.findElement(By.xpath("//button[@type='submit'][@name='websubmit']")).click();
	String title=driver.getTitle();
	System.out.println(title);
	if(title.contains(" log in ")) {
		System.out.println("User successfully registered on facebook and redirected to homepage");
	}
	
	
	}

		
	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "c:\\drivers\\chromedriver.exe");
		//launch browser
		WebDriver driver=new ChromeDriver();
		FacebookDemo fb=new FacebookDemo();
		fb.launchFacebook(driver);
		fb.createAccount(driver);
		fb.selectDob(driver, "1985", "May", "11");
		fb.selectGenderAndSignup(driver);
		
			
	}

}
