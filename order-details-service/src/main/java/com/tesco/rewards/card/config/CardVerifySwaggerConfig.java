package com.tesco.rewards.card.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import com.tesco.rewards.card.util.SwaggerConstants;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class CardVerifySwaggerConfig extends WebMvcConfigurationSupport {
	@Bean
	public Docket balanceApi() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage(SwaggerConstants.BASE_PACKAGE)).paths(PathSelectors.any())
				.build();
	}

	/**
	 * This method is used to generate swagger UI and need to provide the ui
	 * resources location
	 */
	@Override
	protected void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler(SwaggerConstants.FILENAME).addResourceLocations(SwaggerConstants.FILE_LOCATION);
		registry.addResourceHandler(SwaggerConstants.RESOURCE_HANLDER)
				.addResourceLocations(SwaggerConstants.RESOURCE_HANDLER_LOC);
	}
}
