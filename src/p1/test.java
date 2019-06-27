package p1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test {

	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Geethu\\Desktop\\eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("http://198.38.85.16/Humantiz.ver2/NewLogin.aspx");
		driver.findElement(By.xpath("//input[@id='txtClientId']")).sendKeys("MS00001");
		JavascriptExecutor js = (JavascriptExecutor) driver;  

		//("document.getElementById('some id').value='someValue';");
		js.executeScript("document.getElementById('txtUserName1').focus();");
		js.executeScript("document.getElementById('txtUserName1').value='admin';");

		Thread.sleep(3000);
		js.executeScript("document.getElementById('txtPassword').value='admin@12';");
		//driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin@12");


		WebElement login=driver.findElement(By.xpath("//input[@type='submit' and @name='btnLogIn']"));
	//	System.out.println("hello"+login);
		//js.executeScript("$(btnLogIn).click()");
		login.click();

		driver.findElement(By.xpath("//span[contains(text(),'HR')]")).click();
		driver.findElement(By.xpath("//ul[@id='Definitions-tab4']//a[1]//li[1]")).click();
		/*
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_AddNew']")).click();
		driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_tp1_DDlTitle']")).sendKeys("MS");
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_tp1_txtFirstName']")).sendKeys("Devika");
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_tp1_TxtMiddleName']")).sendKeys("P");
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_tp1_TxtLastNmae']")).sendKeys("S");
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_tp1_TxtNickName']")).sendKeys("Devu");
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_tp1_txtNationalityCode']")).sendKeys("IND");
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_tp1_txtNationalityName']")).sendKeys("India");

		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_tp1_txt_DateOfJoin']")).click();

		while(!driver.findElement(By.xpath("//div[@id='ctl00_ContentPlaceHolder1_tp1_CalendarExtender1_title']")).getText().contains("June"))
		{
			driver.findElement(By.xpath("//div[@id='ctl00_ContentPlaceHolder1_tp1_CalendarExtender1_nextArrow']")).click();	
		}

		List<WebElement> dates=driver.findElements(By.className("ajax__calendar_day"));

		int count=driver.findElements(By.className("ajax__calendar_day")).size();

		for(int i=0;i<count;i++)
		{
			String text=driver.findElements(By.className("ajax__calendar_day")).get(i).getText();

			if(text.equalsIgnoreCase("6"))
			{

				driver.findElements(By.className("ajax__calendar_day")).get(i).click();
				break;

			}
		}

		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_tp1_TxtDeptCode']")).sendKeys("h");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'HR')]")).click();

		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_tp1_TxtDesignationCode']")).sendKeys("h");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'HRA')]")).click();

		Select ReportingTo = new Select(driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_tp1_ddlReportingTo']")));
		ReportingTo.selectByValue("HRA");

		Select grade = new Select(driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_tp1_ddlGradeName']")));
		grade.selectByValue("DBGR00002");
		
		///visa link

		driver.findElement(By.xpath("//span[@id='__tab_ctl00_ContentPlaceHolder1_tp1_TabContainer1_TabPanel4']")).click();

		Select VisaStatus = new Select(driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_tp1_TabContainer1_TabPanel4_ddlVisaStatus']")));
		VisaStatus.selectByValue("2");

		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_tp1_TabContainer1_TabPanel4_TxtVisaNo']")).sendKeys("1234567");



		Select Visaloc = new Select(driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_tp1_TabContainer1_TabPanel4_ddlVisaLocation']")));
		Visaloc.selectByValue("BNG");

		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_tp1_TabContainer1_TabPanel4_TxtDateOfIssueVisa']")).click();

		while(!driver.findElement(By.xpath("//div[@id='ctl00_ContentPlaceHolder1_tp1_TabContainer1_TabPanel4_CalendarExtender5_title']")).getText().contains("March"))
		{
			driver.findElement(By.xpath("//div[@id='ctl00_ContentPlaceHolder1_tp1_TabContainer1_TabPanel4_CalendarExtender5_prevArrow']")).click();	
		}

		List<WebElement> date=driver.findElements(By.className("ajax__calendar_day"));

		int counti=driver.findElements(By.className("ajax__calendar_day")).size();

		for(int i=0;i<counti;i++)
		{
			String texti=driver.findElements(By.className("ajax__calendar_day")).get(i).getText();

			if(texti.equalsIgnoreCase("6"))
			{

				driver.findElements(By.className("ajax__calendar_day")).get(i).click();
				break;

			}
		}



		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_tp1_TabContainer1_TabPanel4_TxtDateOfExpiryVisa']")).click();

		while(!driver.findElement(By.xpath("//div[@id='ctl00_ContentPlaceHolder1_tp1_TabContainer1_TabPanel4_CalendarExtender6_title']")).getText().contains("June"))
		{
			driver.findElement(By.xpath("//div[@id='ctl00_ContentPlaceHolder1_tp1_TabContainer1_TabPanel4_CalendarExtender6_nextArrow']")).click();	
		}

		List<WebElement> dat=driver.findElements(By.className("ajax__calendar_day"));

		int counte=driver.findElements(By.className("ajax__calendar_day")).size();

		for(int i=0;i<counte;i++)
		{
			String texti=driver.findElements(By.className("ajax__calendar_day")).get(i).getText();

			if(texti.equalsIgnoreCase("6"))
			{

				driver.findElements(By.className("ajax__calendar_day")).get(i).click();
				break;

			}
		}
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_tp1_BtnSave']")).click();*/
		
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtEmpCode']")).sendKeys("TP11");
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_Search']")).click();
		driver.findElement(By.xpath("//td[contains(text(),'Devika P S')]")).click();	
		driver.findElement(By.xpath("//span[@id='__tab_ctl00_ContentPlaceHolder1_tp1_TabContainer1_TabPanel8']")).click(); 
		
		//String textt = driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_tp1_TabContainer1_TabPanel8_DdlEmployeeStatus']")).getText();
		//System.out.println(textt);
		
		Select select = new Select(driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_tp1_TabContainer1_TabPanel8_DdlEmployeeStatus']")));
		WebElement option = select.getFirstSelectedOption();
		String defaultItem = option.getText();
		System.out.println(defaultItem );
	}

}

