

  Feature: Login Feature

    @librarian
    Scenario: Login as Librarian
      Given : The user is on the login
      When : User login as a librarian
      Then : Dashboard should be displayed


      @student
    Scenario: Login as student
      Given : The user is on the login
      When : User login as a student
      Then : Books should be displayed
