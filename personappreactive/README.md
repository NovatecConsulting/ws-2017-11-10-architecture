# PersonAppReactive
This demo shows how to implement a layered architecture with spring using 
reactive spring web (flux) and reactive spring security. During startup the demo application already creates some person test data.

The demo app has following layers:

* presentation (api)
* boundary (the business logic and transactional boundary)
* data access

## Preparation

Start the application via `./gradlew bootRun`

## Rest endpoints

* List all persons:

  [GET /persons](http://localhost:8080/persons)
  
Please use following login data:

* User=user
* Password=secret
