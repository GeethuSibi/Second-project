package p1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmail {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Geethu\\Desktop\\eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		driver.get("https://accounts.google.com/");

		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("geethugopi92@gmail.com");

		driver.findElement(By.xpath("//div[@id='identifierNext']")).click();

		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("");

		driver.findElement(By.xpath("//div[@id='passwordNext']")).click();

		driver.findElement(By.xpath("//div[@id='gbwa']")).click();

		driver.findElement(By.xpath("//a[@id='gb23']")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\":3b\"]")).click();



		//////This loop can also be used for selecting a specific link in gmail

		/*  List<WebElement> email=driver.findElements(By.className(""));

		  //  int count=driver.findElements(By.className("")).size();

		 String emailsubject="auditordeskuebt@gmail.com";

		      for(int i=0;i<=email.size();i++)
		       {
		       	if(email.get(i).getText().contains(emailsubject))
		       {
		        	  email.get(i).click();
		        	  System.out.println("email clicked");
		        	  break;

		        }
		        }
		 */



	}

}
