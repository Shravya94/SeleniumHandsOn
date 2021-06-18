Feature: Corporate Announcement on the NSE
  User checks latest Corporate Announcement on the NSE
  
	Scenario: Corporate Announcement
		Given User is at the NSE page1
		When User vists Corporate Announcement
		Then User gets the first company details
		And User gets the second company details
		And User gets the third company details
		And User gets the fourth company details
    
	Scenario: Find Company Directory of a particular company
		Given User is at the NSE page2
		When User vists Comapny directory
		Then User searches for a company details
		And User stores company details
    
	Scenario:  Knowing Clearing Holidays for Equities
		Given User is at the NSE page3
		When User vists Clearing Holidays page
		Then User stores the holiday details
    
	Scenario:  Knowing about Classroom Courses
		Given User is at the NSE page4
		When User vists Currency and Commodities Course page
		Then User checks the course details
   
    
   
    
    
    
    
