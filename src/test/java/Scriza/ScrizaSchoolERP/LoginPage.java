package Scriza.ScrizaSchoolERP;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class LoginPage {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(50);
		driver.get("https://school-erp-super-admin-pannel.vercel.app/");
		Thread.sleep(50);
		driver.findElement(By.xpath("//*[@id=\"exampleInputEmail1\"]")).sendKeys("garima@scriza.in");
		driver.findElement(By.xpath("//*[@id=\"exampleInputPassword1\"]")).sendKeys("Scriza@123");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/div[2]/div/form/div[4]/a")).click();
		Thread.sleep(100);
		   String title = driver.getTitle();

	        // Print the title
	        System.out.println("Page title is: " + title);
	       
	     // Get the current URL
	        String currentUrl = driver.getCurrentUrl();

	        // Print the current URL
	        System.out.println("The current URL is: " + currentUrl);
	        
	     // Get the page source
	        String pageSource = driver.getPageSource();

	        // Print the page source
	        System.out.println("Page Source: ");
	        System.out.println(pageSource);
	        
	        // Get the window handle of the current window
	        String windowHandle = driver.getWindowHandle();

	        // Print the window handle
	        System.out.println("Current Window Handle: " + windowHandle);
	        
	        Thread.sleep(2000);
	        
	       /* Thread.sleep(2000);
	       
           driver.get("https://school-erp-super-admin-pannel.vercel.app/allSchoolsPage")   ;
              
              WebElement Logout = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[1]/div[2]/ul/li[14]/a"));
              Thread.sleep(300);
              Logout.click();
              
              Thread.sleep(2000);
	       
              // this is way to use the checkboxes 
             // List < WebElement> Tick= driver.findElements(By.xpath("//*[@id=\"flexCheckChecked\"])"));

             
              // This is the way to handle the single checkbox 
              WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"flexCheckChecked\"]"));
              // Check if the checkbox is selected
              Thread.sleep(2000);
              // to click the checkboxes 
              checkbox.click();
              
              Thread.sleep(3000);
              
              WebElement Logout1= driver.findElement(By.xpath("//*[@id=\"logoutCanvas\"]/div[2]/div[1]/div/p[2]/button[1]"));
              
              Thread.sleep(2000);
              Logout1.click();
              Thread.sleep(2000);
              driver.get("https://school-erp-super-admin-pannel.vercel.app/");
              Thread.sleep(2000);
              WebElement Continue = driver.findElement(By.xpath("//*[@id=\"logoutCanvas\"]/div[2]/div[1]/div/button"));
              Thread.sleep(2000);
              driver.navigate().forward();
             Continue.click();
             Thread.sleep(2000)
             */
	        
	
	        driver.get("https://school-erp-super-admin-pannel.vercel.app/allSchoolsPage");
	      
	        Thread.sleep(3000);
	        
	        WebElement school= driver.findElement(By.xpath(" //*[@id=\"root\"]/div/div[1]/div/div[1]/div[2]/ul/li[2]/a"));
	        Thread.sleep(3000);
	        school.click();           
	        Thread.sleep(3000);
WebElement searchbox = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div/div[1]/div[2]/div/div[1]/form/input"));
searchbox.sendKeys("nkjanka");
Thread.sleep(3000);
WebElement Submit= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div/div[1]/div[2]/div/div[1]/form/button/h2"));
Thread.sleep(3000);
Submit.click();
Thread.sleep(3000);


WebElement AddSchool = driver.findElement(By.xpath("//*[@id=\\\"root\\\"]/div/div[2]/div[2]/div/div/div/div[1]/div[2]/div/div[1]/form/button/h2"));

	}

}
