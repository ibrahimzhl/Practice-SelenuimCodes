import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
          WebDriver driver = new ChromeDriver (); 
          driver.get ("http://www.amazon.in/");
          driver.manage().window().maximize();
          
          driver.findElement(By.id ("twotabsearchtextbox")).sendKeys ("Iphone 16");
          driver.findElement(By.id ("nav-search-submit-button")).click();

	}

}
