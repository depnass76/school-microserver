package com.reda.departementmicroservice.swagger;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


//@Component
//@Import(DepartementController.class)
//@EnableSwagger2
@Configuration
public class SwaggerConfig implements WebMvcConfigurer  {
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
                .title("Employee API")
                .version("1.0")
                .description("API for managing employees.")
                .license("Apache License Version 2.0")
                .build();
    }

    /*
	@Override
	 public void addResourceHandlers(ResourceHandlerRegistry registry) {
	 registry.addResourceHandler("swagger-ui.html")
	        .addResourceLocations("classpath:/META-INF/resources/");
	 registry.addResourceHandler("/webjars/**")
	        .addResourceLocations("classpath:/META-INF/resources/webjars/");
	 }
*/

		 
}