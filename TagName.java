import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		String url = "https://www.amazon.in/gp/bestsellers/?ref=nav_cs_bestsellers"; 
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		List<WebElement> AllLink = driver.findElements(By.tagName("a"));
		int s = AllLink.size();
		System.out.println ("Size="+s);
	}

}
