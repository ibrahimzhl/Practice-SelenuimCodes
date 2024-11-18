import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUps {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String url = ("https://demo.guru99.com/test/delete_customer.php");
		
	    WebDriver driver = new ChromeDriver(); 
	    driver.get(url);
	    
	    Thread.sleep(2000);
	    driver.switchTo().alert().dismiss(); //it will click on cancel button on alert
	    driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("123454");
	    driver.findElement(By.xpath("//input[@name='submit']")).click();
	    
	    Thread.sleep(2000);
	//alert is generated
	    driver.switchTo().alert().dismiss(); // it will click on cancel button on alert
	    
	    driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("ABC");
	    driver.findElement(By.xpath("//input[@name='submit']")).click();
	    
	    driver.switchTo().alert().accept(); // it will click on ok button
	    driver.switchTo().alert().accept(); //second confirmation alert click on Ok
	    
	}
}