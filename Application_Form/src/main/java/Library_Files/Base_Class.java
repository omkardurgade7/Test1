package Library_Files;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base_Class {

	
	   public WebDriver driver;
	   
	   public void initializeBrowser()
	   {
		   ChromeOptions CO=new ChromeOptions();
		   
		   driver=new ChromeDriver(CO);
		   
		   driver.manage().window().maximize();
		   
		   driver.get("https://form.jotform.com/232611947024452");
		   
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	   }
}
