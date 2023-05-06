package OrangeHRMProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PIMModule {
WebDriver driver;
@BeforeTest()
public void beforetest() {
	driver = new FirefoxDriver();
}
@Test
public void VerifyPIMModule() {
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
		
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
}
@Test
public void VerifyPIMOptionConfiguration() {
	try {
		driver.findElement(By.xpath("//li[@class='oxd-topbar-body-nav-tab --parent']")).click();
		Thread.sleep(3000);
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
}
@Test
public void VerifyPIMOptionEmployeeList() {
	try {
		driver.findElement(By.xpath("//li[@class='oxd-topbar-body-nav-tab --visited']")).click();
		Thread.sleep(3000);
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
}
@Test
public void VerifyPIMOptionAddEmploye() {
	try {
		driver.findElement(By.xpath("//li[@class='oxd-topbar-body-nav-tab']")).click();
		Thread.sleep(3000);
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
}
@Test
public void VerifyPIMOptionReport() {
	try {
	driver.findElement(By.xpath("(//li[@class='oxd-topbar-body-nav-tab'])[2]")).click();
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
