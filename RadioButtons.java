import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		String url = "https://demo.guru99.com/test/radio.html"; 
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
      	WebElement radio3 = driver.findElement(By.cssSelector("input[id=\"vfb-7-3\"]"));
			radio3.click();
			if (radio3.isSelected())
			{
				System.out.println("Radio Option 3 is selected");
			}
			else
			{
				System.out.println("Radio Option 3 is not selected");
			}
			
			WebElement checkbox2 = driver.findElement(By.cssSelector("#vfb-6-1"));
			checkbox2.click();
		
		driver.findElement(By.cssSelector("#vfb-6-2")).click();
		
		//HM - Code for checkbox 2 and 3 
	}
}