package mytestng;

import java.io.FileInputStream;




import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class datadriver {
	WebDriver driver;
	@DataProvider(name="logindata")
	public String[][] logindataprovider() throws BiffException, IOException {
		String[][]data;
		data=excel();
		return data;
		
		
	}

@BeforeTest
public void login() {
	WebDriverManager.chromedriver().setup();
	ChromeOptions co= new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	 driver=new ChromeDriver(co);
	
}
@Test(dataProvider="logindata")
public void details(String uname, String pname) throws InterruptedException {
	driver.get("https://www.leafground.com/input.xhtml;jsessionid=node012w2hn3q9r7631mokgsmctno4i616780.node0");
	WebElement username=driver.findElement(By.xpath("//*[@id='j_idt88:name']"));
	username.sendKeys(uname);
	WebElement password=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt91']"));
	password.sendKeys(pname);
	Thread.sleep(1000);
}
@AfterTest
public void quit() {       }
@Test 
public String[][] excel() throws BiffException, IOException {
	FileInputStream file= new FileInputStream("C:\\Users\\SATHEESH\\Desktop\\driven.xls");
	Workbook work=Workbook.getWorkbook(file);
	Sheet sheet=work.getSheet(0);
	int rows=sheet.getRows();
	int columns=sheet.getColumns();
	String testdata[][]=new String[rows-1][columns]; 
	for(int i=1;i<rows;i++){
		for(int j=0;j<columns;j++) {
			testdata[i-1][j]=sheet.getCell(j,i).getContents();
		}
	}
	return testdata;
}
}
