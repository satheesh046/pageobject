package model;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.google.common.annotations.VisibleForTesting;

import io.github.bonigarcia.wdm.WebDriverManager;

public class usingextent {
	//public static void main(String[] args) {
		// TODO Auto-generated method stub
@Test
		public void opengoogle() {
			
	ExtentSparkReporter generate=new
			ExtentSparkReporter("./testfirst.html"); 
	ExtentReports report=new ExtentReports(); 
	report.attachReporter(generate);
	ExtentTest test=report.createTest("test one");
	test.pass("out of the file");
			//  WebDriver driver=new ChromeDriver(); 
			 // driver.get("https://www.google.co.in/");
	WebDriverManager.chromedriver().setup();
	ChromeOptions co=new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	WebDriver driver=new ChromeDriver(co);
	driver.get("https://www.leafground.com/checkbox.xhtml");
	report.flush();
		 
			 
//			int a=4,b=3,c;
//			c=a+b;
//			System.out.println("addition=" +c);
		}
			
		
			
		}
		




	


