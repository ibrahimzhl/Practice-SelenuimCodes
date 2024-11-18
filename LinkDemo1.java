import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver ();
		
		String url = "https://selenium.dev/";
		
		driver.get((url));
		
		driver.manage().window().maximize();
		driver.findElement (By.linkText(("Documentation"))).click();
		System.out.println(driver.getTitle());
		
		driver.findElement (By.linkText(("Projects"))).click();
		System.out.println(driver.getTitle());
		
		driver.findElement (By.linkText(("Support"))).click();
		System.out.println(driver.getTitle());
		
		driver.findElement (By.linkText(("Blog"))).click();
		System.out.println(driver.getTitle());
		
	}

}
