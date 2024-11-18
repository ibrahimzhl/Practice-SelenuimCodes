import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    WebDriver driver = new ChromeDriver (); 
        driver.get ("https://www.orangehrm.com/en/book-a-free-demo/");
        driver.manage().window().maximize();
        
        driver.findElement(By.name ("FullName")).sendKeys ("Zuhal");
        driver.findElement(By.name ("Business Email*")).sendKeys ("ibrahimzhli@gmail.com");
        driver.findElement(By.id ("Form_getForm_CompanyName_Holder")).sendKeys ("Home"); 
       
	}
}
