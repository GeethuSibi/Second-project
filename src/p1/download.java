package p1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class download {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Geethu\\Desktop\\eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://demo.guru99.com/test/yahoo.html");
		
		driver.findElement(By.id("messenger-download")).click();
		
		Runtime.getRuntime().exec("C:\\Users\\Geethu\\Desktop\\eclipse\\autoit\\filedownload.exe");
		
	}

}
