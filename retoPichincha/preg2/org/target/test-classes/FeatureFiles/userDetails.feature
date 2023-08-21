Feature: fetching User Details

@Smoke
Scenario: testing the creation of new user
 
Given url 'https://petstore.swagger.io/v2/user/createWithArray'
And request [{id: '0', username: 'mar',firstName: 'alp',lastName: 'pom', email: 'maprr@gmail.com', password: 'lalala', phone: '999934563', userStatus: '0'}]
When method POST
Then response.status == 200 
And response.username == 'mar'
And response.lastName == 'pom'

@Smoke
Scenario: testing the get call for User Details
 
Given url 'https://petstore.swagger.io/v2/user/mar'
When method GET
* print response
Then status 200
And response.message == 'ok'

@Smoke
Scenario: testing the get call for updating the created User Details
 
Given url 'https://petstore.swagger.io/v2/user/mar'
And request {username: 'Andr', email: 'maprr@gmail.com'}
When method PUT
Then status 200
And response.message == '9223372036854775807'

@Smoke
Scenario: testing the get call for updated User Details
 
Given url 'https://petstore.swagger.io/v2/user/Andr'
When method GET
* print response
Then status 200
And response.email == 'maprr@gmail.com'
And response.username == 'Andr'