# jwtapi
REST API to generate JWT tokens. The api is under development but can be cloned for further development.

Clone the repo and run below cmd -
```Java
mvn spring-boot:run
```

Endpoint for-

GET : 
```
http://localhost:8080/sample
```

POST : 
```
http://localhost:8080/test
```
```
Body
    {
	    "id": 1,
	    "name": "akshat"
    }
```

Reference blogs:

*[How to create simple rest apis with springboot](https://adityasridhar.com/posts/how-to-create-simple-rest-apis-with-springboot)

*[Tutorial: Create and Verify JWTs in Java](https://developer.okta.com/blog/2018/10/31/jwts-with-java)
