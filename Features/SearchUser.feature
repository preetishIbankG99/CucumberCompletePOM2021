Feature: User search
Scenario: Search existing user
Given User launch chrome browser
When Admin open url "https://opensource-demo.orangehrmlive.com/"
And Admin enters username as "Admin" and password as "admin123"
And Click login
Then Admin can view dashboard
When Admin click on admintab
Then Admin search username "Bhakua11"
And Click search
Then Admin can view desired username in list