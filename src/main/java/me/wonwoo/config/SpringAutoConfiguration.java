package me.wonwoo.config;

import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by wonwoo on 2017. 1. 30..
 */
@Configuration
@AutoConfigureAfter(JacksonAutoConfiguration.class)
//@AutoConfigureBefore(JacksonAutoConfiguration.class)
//@ConditionalOnBean(RestTemplate.class)
public class SpringAutoConfiguration {


  @ConditionalOnClass(RestTemplate.class)
  public static class TestConfg {
    @Bean
    @ConditionalOnBean(RestTemplate.class)
    public DemoConfig demoConfig(RestTemplate restTemplate){
      if(true) {
        throw new InvalidException("restTemplate config is null!!!");
      }
      return new DemoConfig();
    }
  }


}
