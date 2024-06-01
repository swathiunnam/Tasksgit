import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumLocators2 {

	public static void main(String[] args) {
	         	//launch browser
				WebDriver driver=new ChromeDriver();
				
				
				//navigate to demoblaze
				driver.navigate().to("https://www.demoblaze.com/");
				//maximize the browser
				driver.manage().window().maximize();
				
				
				//validate  the title of page should be "STORE"
				String act_title=driver.getTitle();
				if(act_title.equals("STORE")) {
					System.out.println("Page Landed On Correct Website");
				}
				else {
					System.out.println("Page Not Landed On Correct Website");
				}
				


	}

}
