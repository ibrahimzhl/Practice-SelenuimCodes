package ProjectSample.ProjectPractice;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadExcelData {

	public static void main(String[] args) throws IOException {
		
		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"; 
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		FileInputStream fs = new FileInputStream ("C:\\Users\\zuhali\\Desktop\\QA\\QASelenuim.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fs);
        XSSFSheet sheet = workbook.getSheetAt(0);
        Row row = sheet.getRow(3);
        Cell cell = row.getCell(0);
        String email = cell.getStringCellValue();
        System.out.println(email);
        Cell cell2 = row.getCell(4);
        String password = cell2.getStringCellValue();
        System.out.println(password);
        
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys (email);
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys (password);
	    driver.findElement(By.xpath("//button[@name='submit']")).click();
	}

}
