package com.testPractice.CucumberPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseSetup {

	public static WebDriver driver;
	public static Properties props;

	public static WebDriver getDriver() throws IOException {
		props = new Properties();
		
		FileInputStream fis;
		fis = new FileInputStream(
				"C:\\Users\\Sal\\Documents\\workspace-spring-tool-suite-4-4.10.0.RELEASE\\CucumberPractice\\src\\test\\java\\com\\testPractice\\CucumberPractice\\global.properties");
		props.load(fis);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sal\\Documents\\Selenium\\chromedriver.exe");	
		driver = new ChromeDriver();
		
		driver.get(props.getProperty("url"));
		return driver;
	}

}
