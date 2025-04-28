package com.udemy.in28minutes.springframeworkmasterclass.scope.dao;

import com.udemy.in28minutes.springframeworkmasterclass.scope.JdbcConnection;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Component
// by default, Scope is singleton
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PersonDao {
  
  private Logger logger = LoggerFactory.getLogger(this.getClass());
  
  @Autowired
  JdbcConnection jdbcConnection;
  
  //-------------------------------------------------------------------------------------------------------------------
  
  @PostConstruct
  public void postConstruct() {
    logger.info("{}", "JDBC connection opened");
  }
  
  //-------------------------------------------------------------------------------------------------------------------
  
  @PreDestroy
  public void preDestroy() {
    logger.info("{}", "JDBC connection closed");
  }
  
  //-------------------------------------------------------------------------------------------------------------------
  
}
