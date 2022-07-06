$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:/C:/Users/Prithiv/eclipse-workspace/Cucumber/FbRegister.feature");
formatter.feature({
  "name": "Login Actions",
  "description": "descriptions: User enters the details to get logged in the webpage",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To validate wheather the username and password is correct or not",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User is on login in page",
  "keyword": "Given "
});
formatter.match({
  "location": "FbRegStepDefinition.user_is_on_login_in_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the username and password",
  "keyword": "When "
});
formatter.match({
  "location": "FbRegStepDefinition.user_enters_the_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks login function",
  "keyword": "Then "
});
formatter.match({
  "location": "FbRegStepDefinition.user_clicks_login_function()"
});
formatter.result({
  "status": "passed"
});
});