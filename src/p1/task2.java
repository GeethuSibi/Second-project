package p1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Geethu\\Desktop\\eclipse\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();  


		//Login to the site

		driver.get("http://ec2-18-205-246-156.compute-1.amazonaws.com/#/access/signin");

		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("geethugopi92@gmail.com");

		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("geethu@123");

		driver.findElement(By.xpath("//p[@class='text-center']//button[@type='submit']")).click();
		Thread.sleep(2000);

		//Supplier Section

		driver.findElement(By.xpath("//a[@href='#/app/suppliers-list']")).click();
		Thread.sleep(3000);

		//Click on the Add supplier button

		driver.findElement(By.xpath("//button[@class='pull-right text-xs inline btn btn-info']")).click();
		Thread.sleep(2000);

		//Enter details

		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Hari");

		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("hari@gmail.com");

		driver.findElement(By.xpath("//input[@name='address']")).sendKeys("Calicut");

		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("9874561230");

		driver.findElement(By.xpath("//input[@name='person']")).sendKeys("Dev");

		driver.findElement(By.xpath("//input[@name='country']")).sendKeys("India");

		driver.findElement(By.xpath("//span[@class='btn btn-default form-control ui-select-toggle']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[contains(text(),'Cooperatives, association of field suppliers, farm')]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@ng-click='ok()']")).click();
		
		//click ok in the pop up

		driver.findElement(By.xpath("//button[contains(text(),'OK Got it!')]")).click();
		Thread.sleep(2000);
		
		//Select a particular supplier

		driver.findElement(By.xpath("//span[contains(text(),'Hari')]")).click();
		
		//Access the delete button

		driver.findElement(By.xpath("//button[contains(@class,'inline btn btn-danger tit')]")).click();
		
		//Click on the delete button

		driver.findElement(By.xpath("//button[@class='text-white bg-success'][contains(text(),'Delete')] ")).click();
		
		//Accept the popup

		driver.findElement(By.xpath("//button[contains(text(),'OK Got it!')]")).click();
		
		//Refresh the window

		driver.navigate().refresh();
	}

}
