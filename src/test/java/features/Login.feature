Feature: Techfios test page validation 


@Scenario1 @smoke 
Scenario: user should be able to change the background color 
	Given set skyBlue Background button exists 
	When User click on  set skyBlue Background
	Then User should be on skyblue background 
	
@Scenario2 @smoke 
Scenario: user should be able to change the background color 
	Given set skyWhite Background button exists 
	When User click on  set skywhite Background
	Then User should be on skywhite background 