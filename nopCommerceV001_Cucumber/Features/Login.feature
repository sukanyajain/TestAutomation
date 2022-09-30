Feature:login

Scenario: Successful Login with valid Credentials
        Given User launch Chrome browser
        when user opens URL "https://admin-demo.nopcommerce.com/login"
        And user enters email as " admin@yourstore.com" and Password as "admin"
        And click on Login
        Then Page Title should be "Dashboard / nopCommerce Administartion"
        When User click on logout link
        Then Page Title should be "your.store.login"
        And close Browser
        
