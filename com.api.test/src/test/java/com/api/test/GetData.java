package com.api.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
public class GetData {

public static void main(String[] args) throws InterruptedException, MalformedURLException {

// This code will run the test on your local Chrome browser
System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
DesiredCapabilities capabilities=DesiredCapabilities.chrome();
//capabilities.setCapability(“marionette”, true);
RemoteWebDriver driver = new ChromeDriver();

//This code will run the test on Perfecto Mobile Cloud
/*
String browserName = “mobileOS”;
DesiredCapabilities capabilities = new DesiredCapabilities(browserName, “”, Platform.ANY);
// Enter your cloud URL
String host = “<Your Cloud>.perfectomobile.com”;
//Enter your user and password
capabilities.setCapability(“user”, “<Your User>“);
capabilities.setCapability(“password”, “<Your Password>”);

//The test will run on any Android available device
capabilities.setCapability(“platformName”, “Android”);

// Name your script
capabilities.setCapability(“scriptName”, “FirstTestCase”);

RemoteWebDriver driver = new RemoteWebDriver(new URL(“https://” + host + “/nexperience/perfectomobile/wd/hub”), capabilities);
*/

driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

try {
//Launch the chrome browser and navigate to www.google.com
driver.get("http://google.com");

// Print a Log In message to the screen


//Wait for 3 Sec
Thread.sleep(3000);

//Search Perfecto Mobile
driver.findElement(By.id("lst-ib")).sendKeys("Perfecto Mobile\n");
// Click on PErfecto Mobile and navigate to the web-site.
driver.findElement(By.linkText("Perfecto Mobile")).click();

//Wait for 15 Sec
Thread.sleep(15000);
}

finally {
// Close the driver
driver.quit();
}
}
}