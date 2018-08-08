package com.ranjen.springmvcrest.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
//tell spring where to find all our bean and classes
@ComponentScan("com.ranjen.springmvcrest")
public class DemoAppConfig implements WebMvcConfigurer {

}
