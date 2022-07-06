
Feature: Login Actions
Scenario: Facebook login scenario with valid credentials
Given The user was in facebook login page
When User enters the credentials
|userName|password|
|Prithiv|89632|
And the user clicks on log in button
Then User navigates to facebook Home page

|
