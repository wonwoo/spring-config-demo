package me.wonwoo.config;

import org.springframework.boot.diagnostics.AbstractFailureAnalyzer;
import org.springframework.boot.diagnostics.FailureAnalysis;

/**
 * Created by wonwoo on 2017. 2. 7..
 */
public class InvalidFailureAnalyzer extends AbstractFailureAnalyzer<InvalidException> {

  @Override
  protected FailureAnalysis analyze(Throwable rootFailure, InvalidException cause) {
    return new FailureAnalysis(
      String.format(" auto-configured '%s' is an invalid ", cause.getMessage()),
      "just, i'm sorry kkk ", cause);
  }
}
