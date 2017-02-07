package me.wonwoo;

import me.wonwoo.config.FooProperties;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication//(excludeName = "org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration")
@EnableConfigurationProperties(FooProperties.class)
public class SpringConfigDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringConfigDemoApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(FooProperties fooProperties) {
		return args -> System.out.println(fooProperties.getName() + " ," + fooProperties.getFirstName());
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
