Feature: Api testing


  @api
  Scenario:

      Given The baseuri is set
      And Header is set to "Content-Type" and "multipart/form-data" and Path parameter is set to "username" and "EldarGus"
      When I send a GET request to "/users/{username}"
      Then The status code should be 200 and The body is "login" and "EldarGus"


