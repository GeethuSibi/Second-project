package p1;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class child_window {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Geethu\\Desktop\\eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

		driver.get("https://reclaimhub.com/login/");

		driver.findElement(By.xpath("//a[@href='https://www.facebook.com/reclaimhub']")).click();
			

		String mainWindow=driver.getWindowHandle();
		Set<String> set =driver.getWindowHandles();
		Iterator<String> itr= set.iterator();

		while(itr.hasNext())

		{
			String childWindow=itr.next();
			
			if(!mainWindow.equals(childWindow))
			{
				driver.switchTo().window(childWindow);
				System.out.println(driver.switchTo().window(childWindow).getTitle());

			}

		}
		
		driver.findElement(By.xpath("//input[@type='email' and @data-testid='royal_email']")).sendKeys("test");
		//driver.close();

		// Switching to Parent window i.e Main Window.

		//driver.switchTo().window(mainWindow);


	}

}
