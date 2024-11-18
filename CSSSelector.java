import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//cssSelector
		// locator to find element on webpage
		
		//1. id
		//#id
	//	#Form_getForm_FullName
		
		
		//2. classname
		//dot operator
		//.classname
	//	.alert-heading
		//.alert-heading.text-center.m-2
		
		//3.syntax
		
		//tagename[attri=value]
				
			//	input[id="Form_getForm_FullName_Holder"]
		
		String url = "https://www.amazon.in/gp/bestsellers/?ref=nav_cs_bestsellers"; 
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("iphone");
		driver.findElement(By.cssSelector("input[id='nav-search-submit-button']")).click();	

	}

}
