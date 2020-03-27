# jwtapi

### 1. Generate JWT token

This is a REST API project to generate JWT tokens in Java using Spring Boot 2.2.6

To run the project in local, clone the repo and execute below cmd -
```Java
mvn spring-boot:run
```
It is integrated with Swagger for detailed documentation.
* [JWT API Swagger UI](http://localhost:8080/swagger-ui.html#/)

#### POST :
```
http://localhost:8080/jwt/api/token
Body
   {
     "cdsId": "string",
     "jwtIssuer": "string",
     "jwtSubject": "string"
   }
```

### 2. Simple rest api
This is a sample API for your won learning. It has a GET and a POST method.

#### GET : 
```
http://localhost:8080/jwt/api/sample
http://localhost:8080/jwt/api/sample?name=akshat
```

#### POST : 
```
http://localhost:8080/jwt/api/test
Body
    {
	    "id": 1,
	    "name": "akshat"
    }
```



### 3. Reference blogs:
* [How to create simple rest apis with springboot](https://adityasridhar.com/posts/how-to-create-simple-rest-apis-with-springboot)
* [Tutorial: Create and Verify JWTs in Java](https://developer.okta.com/blog/2018/10/31/jwts-with-java)
