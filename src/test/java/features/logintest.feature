Feature: Login Action

Scenario: Successful Login with Valid Credentials
	Given User is on Home Page
	When User Navigate to LogIn Page
	And User enters "Prashanthi1985" and "D1@donuru"
	Then click on popup message
	Then Message displayed Login Successfully
	Then User LogOut from the Application
	Then Message displayed LogOut Successfully
	
#Scenario: validate Mandatiry fields errors
#	Given User is on Home Page
#	When User Navigate to LogIn Page
#	And User enters "" and ""
#	Then Error Messages are displayed

