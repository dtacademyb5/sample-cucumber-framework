Feature: Login features

  Background:
    Given I am on the homepage


 @login @signin @bla @test
  Scenario: Positive login


    When I enter the valid credentials
    Then I should be able to login


  @signin
  Scenario: Positive login

    When I enter the valid credentials
    Then I should be able to login


  @db
  Scenario: Positive login


    When I enter the valid credentials
    Then I should be able to login



  @parameter
  Scenario: Positive login


    When I enter the "johnnydepp@gmail.com" and "jd12345"
    Then I should be able to login


    @outline
  Scenario Outline: Positive login scenario outline


    When I enter the "<EMAIL>" and "<PASS>"
    Then I should be able to login


    Examples:
      | EMAIL              | PASS          |
      | hds@gmail.com      | bcdgsv1233    |
      | cdsdsdcs@gmail.com | cdscsdc233212 |

    # alignment

