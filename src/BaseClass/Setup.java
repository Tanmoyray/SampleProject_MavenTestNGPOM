package BaseClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.LoginPage;

public class Setup 

{
	public 	AndroidDriver driver;
	@BeforeTest
	public void LoginREgistration() throws MalformedURLException {
		
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("appPackage", "com.instagram.android");
	    capabilities.setCapability("appActivity", "com.instagram.android.activity.MainTabActivity");
		
		capabilities.setCapability("app", "/Users/tanmoyray/Documents/AndroidApk/Hybrid/com.instagram.android_v8.2.0-30992021_Android-4.1.apk");
		
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
	}
	@Test
	public void Signup() throws InterruptedException{
		
		LoginPage login= new LoginPage(driver);
		
		login.clkSignup.click();
		Thread.sleep(500);
		Assert.assertEquals(true, true);
		login.clkcntcode.click();
		Thread.sleep(500);
		Assert.assertEquals(true, true);
		login.typsearch.sendKeys("India");
		Thread.sleep(500);
		Assert.assertEquals(true, true);
		login.selectIndia.click();
		Thread.sleep(500);
		login.phone_field.sendKeys("9876543210");
		Thread.sleep(500);
		Assert.assertEquals(true, true);
		login.next_button.click();
		Thread.sleep(5000);
		Assert.assertEquals(true, true);
	}
		

	@AfterTest
	public void Exit() {
		driver.quit();
	}
		
}

