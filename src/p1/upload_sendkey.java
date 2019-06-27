package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class upload_sendkey {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Geethu\\Desktop\\eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://demo.guru99.com/test/upload/");
		
		WebElement uploadd=driver.findElement(By.xpath("//input[@id='uploadfile_0']"));

		uploadd.sendKeys("C:\\Users\\Geethu\\Desktop\\calendar selenium.txt");
		
		driver.findElement(By.xpath("//input[@id='terms']")).click();
		
		driver.findElement(By.xpath("//button[@id='submitbutton']")).click();

	}

}
