import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    WebDriver driver = new ChromeDriver (); 
        driver.get ("https://www.orangehrm.com/en/book-a-free-demo/");
        driver.manage().window().maximize();
        
        driver.findElement(By.id ("Form_getForm_FullName")).sendKeys ("Zuhal");
        driver.findElement(By.id ("Form_getForm_Email")).sendKeys ("ibrahimzhl@yahoo.com");
       
	}

}
