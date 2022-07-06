package org.fb;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FbRegStepDefinition extends FbPojoClass{

	public static FbPojoClass p;
	@Given("User is on login in page")
	public void user_is_on_login_in_page() {
		chromeBrowserObject();
		maximize();
		implicitWait();
		enterUrl("https:www.facebook.com/");
	}
	@When("User enters the username and password")
	public void user_enters_the_username_and_password() throws IOException {
		p=new FbPojoClass();
		sendText(p.getEmail(), getExcelSheet("prithiv", 1, 0));
		sendText(p.getPassword(), getExcelSheet("prithiv", 1, 1));
	}

	@Then("user clicks login function")
	public void user_clicks_login_function() {
		p=new FbPojoClass();
		btnClick(p.getClickLogin());
	}

}
