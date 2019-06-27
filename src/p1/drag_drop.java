package p1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class drag_drop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Geethu\\Desktop\\eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		Actions action = new Actions(driver);

		driver.get("http://jqueryui.com/droppable/");

		WebDriverWait wait = new WebDriverWait(driver, 5);

		//wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector(".demo-frame")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		WebElement sourceLocator = driver.findElement(By.cssSelector("#draggable"));

		WebElement targetLocator = driver.findElement(By.cssSelector("#droppable"));

		action.dragAndDrop(sourceLocator, targetLocator).build().perform();
		driver.switchTo().defaultContent();

	}

}
