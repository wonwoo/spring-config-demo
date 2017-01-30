package me.wonwoo;

import me.wonwoo.config.DemoConfig;
import me.wonwoo.config.SpringAutoConfiguration;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;

public class SpringConfigDemoApplicationTests {

	private AnnotationConfigApplicationContext context;

	@Test
	public void contextLoads() {
		load(null);
		final DemoConfig demoConfig = context.getBean(DemoConfig.class);
		assertThat(demoConfig).isNotNull();


	}
	private void load(Class<?>... config) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		if (config != null) {
			context.register(config);
		}
		context.register(SpringAutoConfiguration.class);
		context.refresh();
		this.context = context;
	}



}
