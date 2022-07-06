package org.demo;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoQaStepDefinition extends demoBaseClass {
	public static demoPojoClass demo;
	@Given("User is on demoqa webpage")
	public void user_is_on_demoqa_webpage() {
		chromeBrowserObj();
		maximize();
		implicitWait();
		enterUrl("https://www.toolsqa.com/selenium-training/#enroll-form");
	}

	@When("User enter his firstName and lastName")
	public void user_enter_his_firstName_and_lastName() throws IOException {
		demo=new demoPojoClass();
		sendText(demo.getFirstName(), getExcelSheet("prithiv", 1, 0));
		sendText(demo.getLastName(), getExcelSheet("prithiv", 1, 1));
	}

	@When("User enter his Email in text box")
	public void user_enter_his_Email_in_text_box() throws IOException {
		demo=new demoPojoClass();
		sendText(demo.getEmail(), getExcelSheet("prithiv", 1, 2));
	}

	@When("User enter His Mobile number in text box")
	public void user_enter_His_Mobile_number_in_text_box() throws IOException {
		demo=new demoPojoClass();
		sendText(demo.getMobile(), getExcelSheet("prithiv", 1, 3));
	}

	@When("User have to select is Country from the given dropDown box")
	public void user_have_to_select_is_Country_from_the_given_dropDown_box() throws IOException {
		demo=new demoPojoClass();
		selectObj(demo.getCountry());
		click(demo.getCountry());
		selectDropDown(getExcelSheet("prithiv", 1, 4));
	}

	@When("User have to enter his City in text box")
	public void user_have_to_enter_his_City_in_text_box() throws IOException {
		demo=new demoPojoClass();
		sendText(demo.getCity(), getExcelSheet("prithiv", 1, 5));
	}

	@When("User have an optional to enter any message in text box if required")
	public void user_have_an_optional_to_enter_any_message_in_text_box_if_required() throws IOException {
		demo=new demoPojoClass();
		sendText(demo.getMessage(), getExcelSheet("prithiv", 1, 6));
	}

	@Then("User clicks send button to submit his details")
	public void user_clicks_send_button_to_submit_his_details() {
		click(demo.getSubmit());
	}
}
