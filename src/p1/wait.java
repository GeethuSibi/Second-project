package p1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class wait {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Geethu\\Desktop\\eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		//Implicit wait
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		driver.get("https://www.google.com/search?q=water&rlz=1C1CHBF_enIN843IN843&oq=water&aqs=chrome..69i57j0l5.2864j1j7&sourceid=chrome&ie=UTF-8");
		driver.manage().window().maximize();


		//Explicit wait		
		WebDriverWait wait=new WebDriverWait(driver,10);

		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("search")));


	}

}
