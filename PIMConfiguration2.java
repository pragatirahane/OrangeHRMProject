package OrangeHRMProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PIMConfiguration2 {
	WebDriver driver;
	@BeforeTest()
	public void beforetest() {
		driver = new FirefoxDriver();
	}

	@Test
	public void configurationterminationReasonAdd() {
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
			    Thread.sleep(3000);
			    driver.findElement(By.xpath("//li[@class='oxd-topbar-body-nav-tab --parent']")).click();
			    Thread.sleep(3000);
	   			driver.findElement(By.linkText("Termination Reasons")).click();
	   			Thread.sleep(2000);
	   			driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
	   			Thread.sleep(2000);
	   			driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("Voluntary Termination");
	   			Thread.sleep(2000);
	   			driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
	   			Thread.sleep(2000);
 	   } catch (Exception e) {
			System.out.println(e.getMessage());
		}
    }
	@Test()
    public void configurationterminationReasonDelete() {
 	   try {
 		driver.findElement(By.xpath("(//button[@class='oxd-icon-button oxd-table-cell-action-space'])[21]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
    }
    @Test()
    public void configurationterminationReasonEdit() {
 	   try {
			driver.findElement(By.xpath("(//button[@class='oxd-icon-button oxd-table-cell-action-space'])[10]")).click();
			Thread.sleep(2000);
			WebElement TerminationName = driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]"));
			Actions a = new Actions(driver);
 		a.moveToElement(TerminationName).doubleClick().sendKeys(org.openqa.selenium.Keys.BACK_SPACE).perform();
 	   Thread.sleep(2000);
 	   TerminationName.sendKeys("Disease");
 	    Thread.sleep(2000);
 	  driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();			
 	  } catch (Exception e) {
			System.out.println(e.getMessage());
		}
    }
@AfterTest()
public void aftertest() {
	driver.quit();
}
}
