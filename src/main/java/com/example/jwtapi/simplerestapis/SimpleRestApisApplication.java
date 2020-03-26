package com.example.jwtapi.simplerestapis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.Bean;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@SpringBootApplication
@EnableSwagger2
public class SimpleRestApisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleRestApisApplication.class, args);
	}

	@Bean
	public Docket swaggerConfig(){
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
//				.paths(PathSelectors.ant("/api/*"))
//				.apis(RequestHandlerSelectors.basePackage("io.javabrains"))
				.build()
				.apiInfo(apiDetails());
	}

	private ApiInfo apiDetails(){
		return new ApiInfo(
				"JWT API",
				"Generate JWT token over api",
				"1.0",
				"Free to use",
				new Contact("Akshat Kumar", "https://github.com/akshattambe", "akshat.jec@gmail.com"),
				"API License",
				"https://github.com/akshattambe",
				Collections.emptyList());
	}
}
