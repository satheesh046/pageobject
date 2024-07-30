package pagemod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class findbyele {


	
	
@FindBy(xpath="//*[@name='username']")
public static WebElement username;

@FindBy(name="password")
public static WebElement password;
@FindBy(xpath="//*[@type='submit']")
public static WebElement submit;

	

}
