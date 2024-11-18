import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ActionsDemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url = "https://the-internet.herokuapp.com/drag_and_drop"; 
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		Actions builder = new Actions(driver);
		
		
		WebElement source = driver.findElement(By.cssSelector("#column-a"));
		WebElement target = driver.findElement(By.cssSelector("#column-b"));
		builder.dragAndDrop(source, target).build().perform();
		
		
		
	}

}