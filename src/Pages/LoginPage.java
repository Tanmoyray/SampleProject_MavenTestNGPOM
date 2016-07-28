package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage {
	
	public LoginPage(AndroidDriver<WebElement> driver){
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id="sign_up_with_email_or_phone")
	public WebElement clkSignup;
	
	@AndroidFindBy(id="country_code_picker")
	public WebElement clkcntcode;
	
	@AndroidFindBy(id="search")
	public WebElement typsearch;
	
	@AndroidFindBy(id="row_simple_text_textview")
	public WebElement selectIndia;
	
	@AndroidFindBy(id="phone_field")
	public WebElement phone_field;
	
	@AndroidFindBy(id="next_button")
	public WebElement next_button;
	
}
