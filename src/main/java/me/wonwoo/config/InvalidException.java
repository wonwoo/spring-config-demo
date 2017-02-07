package me.wonwoo.config;

/**
 * Created by wonwoo on 2017. 2. 7..
 */
public class InvalidException extends RuntimeException {
  private final String message;

  public InvalidException(String message) {
    super(String.format("Invalid '%s'", message));
    this.message = message;
  }

  @Override
  public String getMessage() {
    return message;
  }
}
