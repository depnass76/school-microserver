package com.reda.studentmicroservice.swagger;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//@ComponentScan(basePackages="com.reda.studentmicroserver.swagger")
//@Configuration
//@Configuration
//@Component
//@EnableAutoConfiguration
//@EnableSwagger2
@Configuration
public class SwaggerConfig implements WebMvcConfigurer {
/*	
	@Bean
    public Docket employeeApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("public api's")
                .apiInfo(getApiInfo())
                .select()
                .apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
                .build();
    }

    //create API's metadata
    private ApiInfo getApiInfo() {
        return new ApiInfoBuilder()
                .title("Student API")
                .version("1.0")
                .description("API for managing students details.")
                .license("Apache License Version 2.0")
                .build();
    }

*/
}
