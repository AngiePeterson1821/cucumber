Feature: I'm demonstrating working with elements
  Background: Navigate to the Form Validation Page
    Given FormValidation. I navigate to Form Validation Page

    Scenario: Test form validation
      When FormValidation. I navigate to the Form Validation page I verify the header, "FORM VALIDATIONS"
      Then FormValidation. I fill out name field, "qa-Test"
      Then FormValidation. I will send a username that is too long, "aldkjfaldjfaldjflajfajdskfjaldjfllsdk"
      And FormValidation. I will verify the error message, "Username is too long."
      Then FormValidation. I will send an incorrectly formatted email, "email"
      And FormValidation. I will verify the email error message, "Enter a valid email."
      Then FormValidation. I will clear my username
      And FormValidation. I will check username error, "You name is required."
      Then FormValidation. I will send correct name, "Correct Name"
      And FormValidation. I will set the correct username, "janedoe0"
      Then FormValidation. I will enter in correct email, "janedoe@email.com"
      And FormValidation. I will click submit and check modal message, "our form is amazing"

