# Manual Test Cases


### Scenario-1 : Success Sign In With E-mail Address
- Given User Go to Login Page with "EN" Language
- When  User types "Test-user@gmail.com" in E-mail Field
- And   User types "Test123" in Password Field and push Enter
- Then  User Signs In as Successfully

### Scenario-2 : Success Sign In With Facebook Account
- Given User Go to Login Page with "EN" Language
- Given User Clicks Sign In With Facebook Button
- Given User Redirects to "Facebook Sign In Page"
- When  User types "Test-user@gmail.com" in E-mail Field
- When  User types "Test123" in Password Field and push Enter
- Then  User Signs In as Successfully

### Scenario-3 : Success Sign In With Google Account
- Given User Go to Login Page with "EN" Language
- Given User Clicks "Sign In With Google" Button
- Given User Redirects to "Google Account Sign In Page"
- When  User types "Test-user@gmail.com" in E-mail Field
- When  User types "Test123" in Password Field and push Enter
- Then  User Signs In as Successfully 

### Scenario-4 : Forgot Password
- Given User Go to Login Page with "EN" Language
- When User Clicks "Forgot Password" text
- When User types "Test-user@gmail.com" in E-mail Field(Under Password Field)
- When User Clicks "Send" Button
- Then User Takes E-Mail Message for Changing Password

### Scenario-5 : Redirect Sign Up Page
- Given User Go to Login Page with "EN" Language
- When  User Clicks "Sign Up" Button
- Then  User Redirects Sign Up Page

### Scenario-6 : See Values of Password
- Given User Go to Login Page with "EN" Language
- Given User types "Test123" in Password Field
- When  User Clicks "Eye" Button in Password Field
- Then  User Sees Value in Password Field as "Test123"

### Scenario-7 : See "Required field" Error Message
- Given User Go to Login Page with "EN" Language
- When  User Clicks "Sign In" Button
- Then  User Sees "Required field" Error Messages Under E-mail and Password Fields
- Then  User doesn't See Green Ticks in E-mail and Password Fields


### Scenario-8 : Invalid E-mail Address
- Given User Go to Login Page with "EN" Language
- Given User Types "Test" in E-mail Field
- When  User Clicks "Sign In" Button
- Then  User Sees "Please enter a valid e-mail address." Error Message Under E-mail Field
- Then  User doesn't See Green Tick in E-mail Field

### Scenario-9 : Invalid Password
- Given User Go to Login Page with "EN" Language
- Given User Types in Password Field as "12"
- When  User Clicks "Sign In" Button
- Then  User Sees "Please enter minimum 3 and maximum 20 characters." Error Message Under Password Field
- Then  User doesn't See Green Tick in Password Field

### Scenario-10 : Failed Sign In With Wrong Password
- Given User Go to Login Page with "EN" Language
- When  User Types "Test-user@gmail.com" in E-mail Field
- And   User Types "Test123456" in Password Field
- And   User Clicks "Sign In" Button
- Then  User Sees Warning Pop-up With Message "E-mail address or password is incorrect. Please check your information and try again."

### Scenario-11 : Sign In With Correct Password After Error Message.
- Given User Complete Scenario-10 with "EN" Language
- Given User Clicks "Ok" Button in Warning Message
- When  User Types Correct Password as "Test123" in Password Field
- Then  User Signs In as Successfully



