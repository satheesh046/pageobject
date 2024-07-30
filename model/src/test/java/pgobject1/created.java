package pgobject1;
import org.openqa.selenium.WebDriver;



import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagemod.findbyele;
public class created {
	@Test
	public void ohrm() throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(3000);
	PageFactory.initElements(driver, findbyele.class);
	findbyele.username.sendKeys("Admin");
	findbyele.password.sendKeys("admin123");
	findbyele.submit.click();
}
}