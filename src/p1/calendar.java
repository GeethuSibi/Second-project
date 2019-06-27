package p1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Geethu\\Desktop\\eclipse\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
		driver.get("https://www.path2usa.com/travel-companions");
		
		WebElement name= driver.findElement(By.xpath("//input[@id='travel_from']"));
		name.sendKeys("aniak Airport  (ANI) Aniak");
		
		WebElement namee= driver.findElement(By.xpath("//input[@id='travel_to']"));
		namee.sendKeys("Boulder City Municipal Airport  (61B) Boulder City");
		
		driver.findElement(By.id("travel_date")).click();
		
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='datepicker-switch']")).getText().contains("August"))
		{
		driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();	
		}

		List<WebElement> dates=driver.findElements(By.className("day"));

		int count=driver.findElements(By.className("day")).size();

		for(int i=0;i<count;i++)
		{
		String text=driver.findElements(By.className("day")).get(i).getText();

		if(text.equalsIgnoreCase("23"))
		{

		driver.findElements(By.className("day")).get(i).click();
		break;

		}
		}
		
		
	}
	}
	
		
	