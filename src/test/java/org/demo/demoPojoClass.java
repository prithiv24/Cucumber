package org.demo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class demoPojoClass extends demoBaseClass {
	public demoPojoClass() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="first-name")
	private WebElement firstName;

	@FindBy(id="last-name")
	private WebElement lastName;

	@FindBy(id="email")
	private WebElement email;

	@FindBy(id="mobile")
	private WebElement mobile;

	@FindBy(id="country")
	private WebElement country;

	@FindBy(id="city")
	private WebElement city;

	@FindBy(id="message")
	private WebElement message;
	@FindBy(xpath="//button[text()='Send']")
	private WebElement submit;

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getMessage() {
		return message;
	}
}
