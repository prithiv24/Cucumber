$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:/C:/Users/Prithiv/eclipse-workspace/Cucumber/demo.feature");
formatter.feature({
  "name": "Demoqa registration",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To register in demoqa website",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User is on demoqa webpage",
  "keyword": "Given "
});
formatter.match({
  "location": "DemoQaStepDefinition.user_is_on_demoqa_webpage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter his firstName and lastName",
  "keyword": "When "
});
formatter.match({
  "location": "DemoQaStepDefinition.user_enter_his_firstName_and_lastName()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy15.sendKeys(Unknown Source)\r\n\tat org.demo.demoBaseClass.sendText(demoBaseClass.java:38)\r\n\tat org.demo.DemoQaStepDefinition.user_enter_his_firstName_and_lastName(DemoQaStepDefinition.java:24)\r\n\tat ✽.User enter his firstName and lastName(file:/C:/Users/Prithiv/eclipse-workspace/Cucumber/demo.feature:4)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User enter his Email in text box",
  "keyword": "And "
});
formatter.match({
  "location": "DemoQaStepDefinition.user_enter_his_Email_in_text_box()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User enter His Mobile number in text box",
  "keyword": "And "
});
formatter.match({
  "location": "DemoQaStepDefinition.user_enter_His_Mobile_number_in_text_box()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User have to select is Country from the given dropDown box",
  "keyword": "And "
});
formatter.match({
  "location": "DemoQaStepDefinition.user_have_to_select_is_Country_from_the_given_dropDown_box()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User have to enter his City in text box",
  "keyword": "And "
});
formatter.match({
  "location": "DemoQaStepDefinition.user_have_to_enter_his_City_in_text_box()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User have an optional to enter any message in text box if required",
  "keyword": "And "
});
formatter.match({
  "location": "DemoQaStepDefinition.user_have_an_optional_to_enter_any_message_in_text_box_if_required()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks send button to submit his details",
  "keyword": "Then "
});
formatter.match({
  "location": "DemoQaStepDefinition.user_clicks_send_button_to_submit_his_details()"
});
formatter.result({
  "status": "skipped"
});
});