$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:/C:/Users/Prithiv/eclipse-workspace/Cucumber/FeatureFiles/FbLogIn.feature");
formatter.feature({
  "name": "Login Actions",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Facebook login scenario with valid credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "The user was in facebook login page",
  "keyword": "Given "
});
formatter.match({
  "location": "FbStepDefinition.the_user_was_in_facebook_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the credentials",
  "rows": [
    {
      "cells": [
        "userName",
        "password"
      ]
    },
    {
      "cells": [
        "Prithiv",
        "89632"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "FbStepDefinition.user_enters_the_credentials(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on log in button",
  "keyword": "And "
});
formatter.match({
  "location": "FbStepDefinition.the_user_clicks_on_log_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User navigates to facebook Home page",
  "rows": [
    {
      "cells": []
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "FbStepDefinition.user_navigates_to_facebook_Home_page(DataTable)"
});
formatter.result({
  "status": "passed"
});
});