package com.briz.springboot_war_example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//  EXTERNAL TOMCAT SERVER 10.1 version IS 2525 FOR LOGING USE THIS 
// this is manually created war file check the pom.xml file tomcat and packaging as war file
//please select as war as packaging and web as a dependency only tomcat will be automatically added to pom.xml file
// kindly extend the main class as the springbootservletinializer 

@RestController
@SpringBootApplication
public class SpringbootWarExampleApplication extends SpringBootServletInitializer {

	public static void main(String[] args)
	{
		SpringApplication.run(SpringbootWarExampleApplication.class, args);
	}
	@Override  // this must be overrided 
	protected SpringApplicationBuilder  configure(SpringApplicationBuilder builder)
	{
	return builder.sources(SpringbootWarExampleApplication.class);
	}
	
	@RequestMapping("/war")
	public String test()
	{
		return "TThis is war Test";
	}
}
