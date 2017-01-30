package me.wonwoo.config;

import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by wonwoo on 2017. 1. 30..
 */
@Configuration
@AutoConfigureAfter(JacksonAutoConfiguration.class)
//@AutoConfigureBefore(JacksonAutoConfiguration.class)
public class SpringAutoConfiguration {

  @Bean
  public DemoConfig demoConfig(){
    return new DemoConfig();
  }
}
