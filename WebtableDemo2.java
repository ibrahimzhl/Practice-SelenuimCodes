import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebtableDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url = "https://demo.guru99.com/test/web-table-element.php"; 
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		List <WebElement> rows = driver.findElements(By.xpath("//table[@class=\"dataTable\"]//tr"));
		
		int rowCount = rows.size();
		System.out.println(rowCount);
		
		for (int i=1; i<rowCount; i++) {
			for (int j=1; j<=5; j++)
		{
		WebElement company1 = driver.findElement(By.xpath("//table[@class=\"dataTable\"]/tbody/tr["+i+"]/td["+j+"]"));
		String data = company1.getText();
		System.out.println(data +"");
	}
}
}
}