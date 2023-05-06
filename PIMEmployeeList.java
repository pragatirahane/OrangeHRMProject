package OrangeHRMProject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PIMEmployeeList {
	WebDriver driver;
	@BeforeTest()
	public void beforetest() {
		driver = new FirefoxDriver();
	}
	@Test
	public void VerifyEmployeeList() {
		try {
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.findElement(By.name("username")).sendKeys("Admin");
			Thread.sleep(2000);
			driver.findElement(By.name("password")).sendKeys("admin123");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("button[type='submit']")).click();
		    Thread.sleep(2000);
			driver.findElement(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[2]")).click();
		//Employee Name
			driver.findElement(By.xpath("(//input[@placeholder='Type for hints...'])[1]")).sendKeys("Joy Zen");
			Thread.sleep(2000);
		//Employee Id
			driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("3456");
			Thread.sleep(2000);
		//Employment Stauts	
			String statusToSelect="Full-Time Contract";
			 driver.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")).click();
			 Thread.sleep(2000);
			List<WebElement> statusoptions = driver.findElements(By.xpath("//div[@role='listbox']"));
			for(WebElement status:statusoptions) {
				String CurrentOption=status.getText();
			if(CurrentOption.contains(statusToSelect))
				{
				status.click();
					break;
					}
			}
		//Include
			String includeToSelect="Current and Past Employees";
			 driver.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]")).click();
			 Thread.sleep(2000);
			List<WebElement> includeoptions = driver.findElements(By.xpath("//div[@role='listbox']"));
			for(WebElement include:includeoptions) {
				String CurrentOption=include.getText();
			if(CurrentOption.contains(includeToSelect))
				{
				include.click();
					break;
					}
			}
			Thread.sleep(2000);
		//Supervisor Name
			driver.findElement(By.xpath("(//input[@placeholder='Type for hints...'])[2]")).sendKeys("Raj Roy");
			Thread.sleep(2000);
		//Job Title	
			String jobtitleToSelect="Chief Technical Officer";
			 driver.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[3]")).click();
			 Thread.sleep(2000);
			List<WebElement> jobtitleoptions = driver.findElements(By.xpath("//div[@role='listbox']"));
			for(WebElement title:jobtitleoptions) {
				String CurrentOption=title.getText();
			if(CurrentOption.contains(jobtitleToSelect))
				{
				title.click();
					break;
					}
			}
			Thread.sleep(2000);
		//Sub Unit	
			String subunitToSelect="Engineering";
			 driver.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[4]")).click();
			 Thread.sleep(2000);
			List<WebElement> subunitoptions = driver.findElements(By.xpath("//div[@role='listbox']"));
			for(WebElement unit:subunitoptions) {
				String CurrentOption=unit.getText();
			if(CurrentOption.contains(subunitToSelect))
				{
				unit.click();
					break;
					}
			}
			Thread.sleep(3000);
		//Search	
			driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
		   Thread.sleep(2000);
		//Reset   
			driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--ghost']")).click();
			Thread.sleep(3000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@AfterTest()
	public void aftertest() {
		driver.quit();
	}
}
