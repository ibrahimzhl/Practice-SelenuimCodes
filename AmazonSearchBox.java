import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearchBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url = ("https://www.amazon.com/");
		
	    WebDriver driver = new ChromeDriver (); 
	    driver.get(url);
	    
	    driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys ("Laptop");
	
	}
}