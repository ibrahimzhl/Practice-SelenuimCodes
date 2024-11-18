
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		String url = "https://demo.guru99.com/test/radio.html"; 
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		driver.findElement(By.cssSelector("input[id=\"vfb-7-3\"]")).click();
		driver.findElement(By.cssSelector("#vfb-6-1")).click();
		driver.findElement(By.cssSelector("#vfb-6-2")).click();
		
		
	}
}