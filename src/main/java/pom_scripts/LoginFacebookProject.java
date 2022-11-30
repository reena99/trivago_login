package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginFacebookProject extends BasePage {

	public LoginFacebookProject(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub

	}

	@FindBy(xpath = "//span[text()='Log in']")
	WebElement login;

	public void Click_on_Login() {
		clickAction(login);
	}

	@FindBy(xpath = "//span[text()='Continue with Facebook']")
	WebElement facebook;

	public void continuewith_FB() {
		clickAction(facebook);
	}

	@FindBy(id = "email")
	WebElement fbemail;

	public void enterfBEmail(String email) {
		enter_value(fbemail, email);
	}

	@FindBy(id = "pass")
	WebElement fbpassword;

	public void enterFBPassword(String FBpassword) {
		enter_value(fbpassword, FBpassword);
	}

	@FindBy(id = "loginbutton")
	WebElement submitData;

	public void clickOnSubmit() {
		clickAction(submitData);
	}
}