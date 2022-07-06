package org.fb;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbPojoClass extends FbBaseClass {
	public FbPojoClass() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="email")
	private WebElement email;
	@FindBy(id="pass")
	private WebElement password;
	@FindBy(xpath="//button[@value='1']")
	private WebElement  clickLogin;
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getClickLogin() {
		return clickLogin;
	}
	@FindBy(xpath="(//a[@role='button'])[2]")
	private WebElement createNewAccount;
	@FindBy(name="firstname")
	private WebElement firstName;
	@FindBy(name="lastname")
	private WebElement lastName;
	@FindBy(name="reg_email__")
	private WebElement emailOrMobile;
	@FindBy(id="password_step_input")
	private WebElement newPassword;
	@FindBy(id="day")
	private WebElement day;
	@FindBy(id="month")
	private WebElement month;
	@FindBy(id="year")
	private WebElement year;
	@FindBy(xpath="(//input[@type='radio'])[2]")
	private WebElement gender;
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement signUp;
	public WebElement getCreateNewAccount() {
		return createNewAccount;
	}
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getEmailOrMobile() {
		return emailOrMobile;
	}
	public WebElement getNewPassword() {
		return newPassword;
	}
	public WebElement getDay() {
		return day;
	}
	public WebElement getMonth() {
		return month;
	}
	public WebElement getYear() {
		return year;
	}
	public WebElement getGender() {
		return gender;
	}
	public WebElement getSignUp() {
		return signUp;
	}
}
