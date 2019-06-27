package p1;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoit {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Geethu\\Desktop\\eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://demo.guru99.com/test/autoit.html");			
	    driver.findElement(By.id("postjob")).click();	
	  
	   driver.switchTo().frame(driver.findElement(By.id("JotFormIFrame-72320244964454")));
	   driver.findElement(By.xpath("//input[@id='input_3' and @size='25']")).sendKeys("Gaurav");                                 					
	   driver.findElement(By.xpath("//input[@id='input_4' and @size='25' ]")).sendKeys("test.test@gmail.com");					
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//input[@id='input_5' and @name='q5_typeA']")).click();			
	   Thread.sleep(2000);
	    
	   // below line execute the AutoIT script .
	     
	   Runtime.getRuntime().exec("C:\\Users\\Geethu\\Desktop\\eclipse\\autoit\\fileupload.exe");
	}

}
