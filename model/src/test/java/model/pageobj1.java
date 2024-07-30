package model;

import org.openqa.selenium.By;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.google.common.annotations.VisibleForTesting;

public class pageobj1 {
public static WebElement firstname(WebDriver driver) {
	driver.findElement(By.id("j_idt88:name")).sendKeys("satheesh");
	return null;
	
}
public static WebElement secondname(WebDriver driver) {
	driver.findElement(By.id("j_idt88:j_idt91")).sendKeys("salem");
	return null;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://www.leafground.com/input.xhtml;jsessionid=node01k2o6ela5uc9pc38qz3kh7jna599676.node0");
//PageFactory.initElements(driver, pageobj1.class);
ExtentSparkReporter spr=new ExtentSparkReporter("./testex.html");
ExtentReports es=new ExtentReports();
es.attachReporter(spr);
pageobj1.firstname(driver);
pageobj1.secondname(driver);
es.flush();

	}

}
