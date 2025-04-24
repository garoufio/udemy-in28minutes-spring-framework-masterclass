package com.udemy.in28minutes.springframeworkmasterclass.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) // it will operate as a singleton bean because it is called by a singleton bean
public class JdbcConnection {

  public JdbcConnection() {
    System.out.println("JDBC Connection created");
  }

}
