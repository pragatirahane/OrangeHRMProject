package OrangeHRMProject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PIMConfiguration {
	private static final CharSequence Keys = null;
	WebDriver driver;
	@BeforeTest()
	public void beforetest() {
		driver = new FirefoxDriver();
	}
	@Test(priority=0)
	public void Configurationlist() {
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
		    }catch(Exception e) {
		    	System.out.println(e.getMessage());
		    }
	}
	@Test(priority=1)
	public void ConfigurationlistOptionalFiellds() {
		try {
			driver.findElement(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[2]")).click();
			driver.findElement(By.xpath("//li[@class='oxd-topbar-body-nav-tab --parent']")).click();
			driver.findElement(By.linkText("Optional Fields")).click();
	        Thread.sleep(3000);
	     //to enabled or disabled to optionalfields option
	        driver.findElement(By.xpath("(//span[@class='oxd-switch-input oxd-switch-input--active --label-right'])[1]")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("(//span[@class='oxd-switch-input oxd-switch-input--active --label-right'])[2]")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("(//span[@class='oxd-switch-input oxd-switch-input--active --label-right'])[3]")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("(//span[@class='oxd-switch-input oxd-switch-input--active --label-right'])[4]")).click();
	    //to save the changes
	        driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
	        } catch (Exception e) {
				System.out.println(e.getMessage());
			}
		    }
	       @Test(priority=2)
	       public void ConfigurationlistCustomFielldAdd() {
	    	   try {
	    		driver.findElement(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[2]")).click();
	   			Thread.sleep(2000);
	   			driver.findElement(By.xpath("//li[@class='oxd-topbar-body-nav-tab --parent']")).click(); 
	   			Thread.sleep(2000);
				driver.findElement(By.linkText("Custom Fields")).click();
				Thread.sleep(2000);
		//to add record
				driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
				Thread.sleep(2000);
			 driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("Sita Sharma");
			 Thread.sleep(2000);
			 String OptionToSelect="Contact Details";
			 driver.findElement(By.cssSelector("i[class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']")).click();
			 Thread.sleep(2000);
			List<WebElement> Screenoptions = driver.findElements(By.xpath("//div[@role='listbox']"));
			for(WebElement option:Screenoptions) {
				//System.out.println(option.getText());
				String CurrentOption=option.getText();
			if(CurrentOption.contains(OptionToSelect))
				{
					option.click();
					break;
					}
			}
			Thread.sleep(1000);
			String OptionOfType="Text or Number";
			driver.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]")).click();
			List<WebElement> Typeoption = driver.findElements(By.xpath("//div[@role='listbox']"));
			for(WebElement type:Typeoption) {
				String CurrentOption=type.getText();
				if(CurrentOption.contains(OptionOfType))
					{
						type.click();
						break;
						}
			}
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
			Thread.sleep(2000);
			 } catch (Exception e) {
				System.out.println(e.getMessage());
			}
	    		   
	    	   }
	       @Test(priority=3)
	       public void ConfigurationlistCustomFielldDelete() {
	    	   try {
	    	//To delete record	   
	    		   driver.findElement(By.xpath("(//button[@class='oxd-icon-button oxd-table-cell-action-space'])[3]")).click();
	    		   Thread.sleep(2000);
	    		  driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")).click();
	    		   Thread.sleep(3000);
	    	   } catch (Exception e) {
					System.out.println(e.getMessage());
				}
	       }
	    	 @Test(priority=4)
	    	 public void ConfigurationlistCustomFielldEdit() { 
	    		 try {
	    		   driver.findElement(By.xpath("(//button[@class='oxd-icon-button oxd-table-cell-action-space'])[2]")).click();
	    		   Thread.sleep(3000);
	    		   WebElement Fieldname = driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]"));
	    		   Actions a = new Actions(driver);
	    		   a.moveToElement(Fieldname).doubleClick().sendKeys(org.openqa.selenium.Keys.BACK_SPACE).perform();
	    		   Thread.sleep(3000);
	    		   Fieldname.sendKeys("Aron Miller");
	    		   Thread.sleep(2000);
	    		   driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
	    		   
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
	       }
	       @Test(priority=5)
	       public void configurationDataImport() {
	    	 try {
	    		 driver.findElement(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[2]")).click();
		   			Thread.sleep(2000);
	    		 driver.findElement(By.xpath("//li[@class='oxd-topbar-body-nav-tab --parent']")).click(); 
		   			Thread.sleep(2000);
					driver.findElement(By.linkText("Data Import")).click();
					Thread.sleep(2000);
					} catch (Exception e) {
				System.out.println(e.getMessage());
			}  
	       } 
	       @Test(priority=6)
	       public void configurationDataImportdownloadoption() {
	    	   try {
				driver.findElement(By.linkText("Download")).click();
				Thread.sleep(4000);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
	       }
	       @Test(priority=7)
	       public void configurationReportingMethodAdd() {
	    	   try {
	    		   driver.findElement(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[2]")).click();
		   			Thread.sleep(2000);
	    		    driver.findElement(By.xpath("//li[@class='oxd-topbar-body-nav-tab --parent']")).click(); 
		   			Thread.sleep(2000);
		   			driver.findElement(By.linkText("Reporting Methods")).click();
		   			Thread.sleep(2000);
		   			driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
		   			Thread.sleep(2000);
		   			driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("Alldirectandindirectmethods");
		   			Thread.sleep(2000);
		   			driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
		   			Thread.sleep(2000);
	    	   } catch (Exception e) {
				System.out.println(e.getMessage());
			}
	       }
	       @Test(priority=8)
	       public void configurationReportingMethodDelete() {
	    	   try {
				driver.findElement(By.xpath("(//button[@class='oxd-icon-button oxd-table-cell-action-space'])[1]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")).click();
				Thread.sleep(2000);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
	       }
	       @Test(priority=9)
	       public void configurationReportingMethodEdit() {
	    	   try {
				driver.findElement(By.xpath("(//button[@class='oxd-icon-button oxd-table-cell-action-space'])[2]")).click();
				Thread.sleep(2000);
				WebElement MethodName = driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]"));
				Actions a = new Actions(driver);
	    		a.moveToElement(MethodName).doubleClick().sendKeys(org.openqa.selenium.Keys.BACK_SPACE).perform();
	    	   Thread.sleep(2000);
	    	    MethodName.sendKeys("BypassMethod");
	    	    Thread.sleep(2000);
				driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
				Thread.sleep(2000);
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
	       }    
	       
@AfterTest()
public void aftertest() {
	driver.quit();
}
}
