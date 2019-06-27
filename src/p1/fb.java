package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;



public class fb {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Geethu\\Desktop\\eclipse\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        
		
		driver.get("https://www.facebook.com/r.php");
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"u_0_k\"]")).sendKeys("revathi");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"u_0_m\"]")).sendKeys("s");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"u_0_p\"]")).sendKeys("geethu@testvox.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"u_0_s\"]")).sendKeys("geethu@testvox.com");
		Thread.sleep(2000);
		
		
		//input[@id='username']
		
		driver.findElement(By.xpath("//*[@id=\"u_0_w\"]")).sendKeys("clt673603");
		Thread.sleep(2000);
		
		
		Select day=new Select(driver.findElement(By.id("day")));
		day.selectByIndex(4);		
		Thread.sleep(2000);
		
		Select month=new Select(driver.findElement(By.id("month")));
		month.selectByValue("4");		
		Thread.sleep(2000);
		
			
		driver.findElement(By.id("u_0_6")).click();
		
//driver.findElement(By.xpath("//button[@type='submit' and @class='_6j mvm _6wk _6wl _58mi _3ma _6o _6v']")).click();
	
		driver.findElement(By.id("u_0_11")).click();
		//*[@id="u_0_11"]
		
		
///		driver.quit();

	}

}
