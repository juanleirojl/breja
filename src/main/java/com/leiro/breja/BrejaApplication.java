package com.leiro.breja;

import javax.servlet.Filter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.CharacterEncodingFilter;

@SpringBootApplication
public class BrejaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BrejaApplication.class, args);
	}

	@Bean
	public Filter getCharacterEncodingFilter() {

		CharacterEncodingFilter encodingFilter = new CharacterEncodingFilter();

		encodingFilter.setEncoding("UTF-8");
		encodingFilter.setForceEncoding(true);

		return encodingFilter;

	}

	// @Override
	// public void addViewControllers(ViewControllerRegistry registry) {
	// registry.addViewController("/results").setViewName("results");
	// }

//	private static final String[] CLASSPATH_RESOURCE_LOCATIONS = { "classpath:/META-INF/resources/",
//			"classpath:/resources/", "classpath:/static/", "classpath:/public/" };
//
//	@Override
//	public void addResourceHandlers(ResourceHandlerRegistry registry) {
//		
//		//registry.addResourceHandler("/**").addResourceLocations("classpath:/static/");
//		if (!registry.hasMappingForPattern("/webjars/**")) {
//			registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
//		}
//		if (!registry.hasMappingForPattern("/**")) {
//			registry.addResourceHandler("/**").addResourceLocations(CLASSPATH_RESOURCE_LOCATIONS);
//		}
//	}
}
