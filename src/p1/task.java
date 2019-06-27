
package p1;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Geethu\\Desktop\\eclipse\\chromedriver_win32\\chromedriver.exe");

		//open the browser

		WebDriver driver = new ChromeDriver();

		//Maximize the window

		driver.manage().window().maximize();

		//Provide wait

		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

		// Delete all cookies

		driver.manage().deleteAllCookies();  

		///////////////////////// First step////////////////////////////////////////////

		//Go to the URL

		driver.get("http://ec2-18-205-246-156.compute-1.amazonaws.com/#/access/signin");

		//Click on the Signup link

		driver.findElement(By.xpath("//a[@href='#/access/signup']")).click();

		// Enter organization Name

		driver.findElement(By.xpath("//input[@placeholder='Name of Organization']")).sendKeys("test");

		// Enter email ID

		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("geethugopi92@gmail.com");

		// Enter Password

		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("geethu@123");

		//Enter Phone Number

		driver.findElement(By.xpath("//input[@placeholder='Phone']")).sendKeys("9544259196");

		//Enter Address

		driver.findElement(By.xpath("//input[@placeholder='Address']")).sendKeys("calicut");

		//Enter City

		driver.findElement(By.xpath("//input[@placeholder='City']")).sendKeys("calicut");

		//Enter Country Name

		driver.findElement(By.xpath("//input[@placeholder='Country']")).sendKeys("india");

		//Enter Postal Code

		driver.findElement(By.xpath("//input[@placeholder='Postal Code']")).sendKeys("673603");

		//Enter Contact Person Name

		driver.findElement(By.xpath("//input[@placeholder='Contact Person']")).sendKeys("geethu");

		//Enter Contact Person Phone Number

		driver.findElement(By.xpath("//input[@placeholder='Contact Person Phone']")).sendKeys("8606207721");

		//Enter Contact Person Email ID

		driver.findElement(By.xpath("//input[@placeholder='Contact Person Email']")).sendKeys("geethugopi92@gmail.com");

		//Submit the details

		driver.findElement(By.xpath("//button[@type='submit']")).click();


		///////////////////Second step//////////////////////////////////////////


		///Login to the gmail account

		driver.get("https://accounts.google.com/");

		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("geethugopi92@gmail.com");

		driver.findElement(By.xpath("//div[@id='identifierNext']")).click();

		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("");

		driver.findElement(By.xpath("//div[@id='passwordNext']")).click();

		driver.findElement(By.xpath("//div[@id='gbwa']")).click();

		driver.findElement(By.xpath("//a[@id='gb23']")).click();


		//Loop used for selecting the verification link//

		List<WebElement> email=driver.findElements(By.cssSelector("tr[class='zA yO']"));

		//  int count=driver.findElements(By.className("")).size();

		String emailsubject="UEBT AuditorDesk email verification.";

		for(int i=0;i<=email.size();i++)
		{
			if(email.get(i).getText().contains(emailsubject))
			{
				email.get(i).click();
				System.out.println("email clicked");
				break;

			}
		}

		//click on the Verify the email link

		driver.findElement(By.linkText("Verify my email")).click();



		////////////////Third Step//////////////////////


		////Login with valid username and password

		// Handle the child window

		String mainWindow=driver.getWindowHandle();
		Set<String> set =driver.getWindowHandles();
		Iterator<String> itr= set.iterator();

		while(itr.hasNext())

		{
			String childWindow=itr.next();
			if(!mainWindow.equals(childWindow)){
				driver.switchTo().window(childWindow);
				System.out.println(driver.switchTo().window(childWindow).getTitle());

			}

		}

		//Click on the signin link

		Thread.sleep(2000);

		driver.findElement(By.xpath("//p[@class='text-center m-t-xl' and @aria-hidden='false']//a[@href='#/access/signin']")).click();


		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("geethugopi92@gmail.com");

		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("geethu@123");

		driver.findElement(By.xpath("//p[@class='text-center']//button[@type='submit']")).click();


		/////////////Fill additional info///////////////


		//driver.findElement(By.xpath("//textarea[@placeholder='Member Description']")).sendKeys("hello");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[@class='btn btn-default form-control ui-select-toggle'] ")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[contains(text(),'Trader')]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[1]/form/div/div/div[1]/div/div[3]/label[7]")).click();


		/*	driver.findElement(By.xpath("//input[@placeholder='Total Annual Turnover (Euro)']")).sendKeys("1");


			driver.findElement(By.xpath("//input[@placeholder='Turnover related to cosmetic sector(%)']")).sendKeys("2");


			driver.findElement(By.xpath("//input[@placeholder='Turnover related to food sector(%)']")).sendKeys("3");

			driver.findElement(By.xpath("//input[@placeholder='Turnover related to pharmaceutical sector(%)']")).sendKeys("4");

			driver.findElement(By.xpath("//input[@placeholder='Turnover related to other sectors(%)']")).sendKeys("5");

			driver.findElement(By.xpath("//input[@placeholder='Number of prioritized natural ingredients sourced by the member']")).sendKeys("6");

			driver.findElement(By.xpath("//input[@placeholder='Number of supply chains from which the member company is supplied that are prioritized']")).sendKeys("7");

			driver.findElement(By.xpath("//input[@placeholder='Total volume of prioritized natural ingredients purchased (Tonnes)']")).sendKeys("8");

			driver.findElement(By.xpath("//input[@placeholder='Total value of prioritized natural ingredients purchased (€)']")).sendKeys("9");

			driver.findElement(By.xpath("//input[@placeholder='Total hectares under cultivation from which the purchased prioritized natural ingredients are sourced']")).sendKeys("10");

			driver.findElement(By.xpath("//input[@placeholder='Total hectares under wild collection from which the purchased prioritized natural ingredients are sourced']")).sendKeys("5");

			driver.findElement(By.xpath("//input[@placeholder='Total hectares under agro-forestry from which the purchased prioritized natural ingredients are sourced']")).sendKeys("5");

			driver.findElement(By.xpath("//input[@placeholder='Number of actors involved in farming of the prioritized natural ingredients purchased']")).sendKeys("5");

			driver.findElement(By.xpath("//input[@placeholder='Number of actors involved in picking of the prioritized natural ingredients purchased']")).sendKeys("5");

			driver.findElement(By.xpath("//input[@placeholder='Number of actors involved in agro-forestry of the prioritized natural ingredients']")).sendKeys("5");

			driver.findElement(By.xpath("//input[@placeholder='Number of Supply Chains']")).sendKeys("5");

			driver.findElement(By.xpath("//input[@placeholder='Number of Natural Ingredients']")).sendKeys("5");

			driver.findElement(By.xpath("//input[@placeholder='Long Term Male Employees']")).sendKeys("5");

			driver.findElement(By.xpath("//input[@placeholder='Short Term Male Employees']")).sendKeys("5");

			driver.findElement(By.xpath("//input[@placeholder='Long Term Female Employees']")).sendKeys("5");

			driver.findElement(By.xpath("//input[@placeholder='Short Term Female Employees']")).sendKeys("5");


		 *///Click on the Next button

		driver.findElement(By.xpath("//p[@class='text-center m-t-xl ng-scope']")).click();

		Thread.sleep(2000);


		////////Browse the documents////////////

		//Enter File name

		driver.findElement(By.xpath("//input[@placeholder='File Name(Required)']")).sendKeys("Autoitscript");
		Thread.sleep(2000);

		// click on the choose file

		driver.findElement(By.xpath("//input[@type='file']")).click();

		// Below line execute the AutoIT script .

		Runtime.getRuntime().exec("C:\\Users\\Geethu\\Desktop\\eclipse\\autoit\\Autoitscript.exe");
		Thread.sleep(3000);		

		//Click on the upload button

		driver.findElement(By.xpath("//button[@class='btn btn-primary ']")).click();


	}

}
