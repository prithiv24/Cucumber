Feature: Demoqa registration
Scenario: To register in demoqa website
Given User is on demoqa webpage
When User enter his firstName and lastName
And User enter his Email in text box
And User enter His Mobile number in text box
And User have to select is Country from the given dropDown box
And User have to enter his City in text box
And User have an optional to enter any message in text box if required
Then User clicks send button to submit his details

