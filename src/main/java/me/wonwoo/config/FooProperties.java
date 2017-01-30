package me.wonwoo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.DeprecatedConfigurationProperty;

/**
 * Created by wonwoo on 2017. 1. 28..
 */
@ConfigurationProperties("foo")
public class FooProperties {
  private String name = "100";
  private String firstName;

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  @DeprecatedConfigurationProperty(reason = "just" , replacement = "foo.firstName")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
