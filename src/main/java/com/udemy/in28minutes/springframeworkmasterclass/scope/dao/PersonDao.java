package com.udemy.in28minutes.springframeworkmasterclass.scope.dao;

import com.udemy.in28minutes.springframeworkmasterclass.scope.JdbcConnection;
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
  
  @Autowired
  JdbcConnection jdbcConnection;
  
  //-------------------------------------------------------------------------------------------------------------------
  
}
