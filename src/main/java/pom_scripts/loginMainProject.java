package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginMainProject extends BasePage{

	public loginMainProject(WebDriver driver) {
		super(driver);
	}	
		
	@FindBy(xpath = "//span[text()='Log in']")
		WebElement login;
        public void click_on_Login() {
		clickAction(login);
		}
	
    @FindBy(xpath = "//input[@id='email' or @placeholder='Email address']")		
	WebElement email;
	public void enter_Email(String emailId) {
		enter_value(email, emailId);
	}
	
	@FindBy(xpath = "//button[@id='login_email_submit' or @data-testid='login-next-button']")
	WebElement next;
	public void click_on_Next() {
		clickAction(next);
	}
	
	@FindBy(xpath = "//input[@id='password' or @id='login_password']")
	WebElement password;
	public void Enter_password(String value) {
		enter_value(password, value);
	}
	
	@FindBy(xpath = "//button[@id='login_submit' or @data-testid='login-submit']")
	WebElement sumbit;
	public void sumbit() {
		clickAction(sumbit);
	}
}
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

