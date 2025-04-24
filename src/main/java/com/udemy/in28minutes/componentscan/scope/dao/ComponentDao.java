package com.udemy.in28minutes.componentscan.scope.dao;

import com.udemy.in28minutes.componentscan.scope.ComponentJdbcConnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Component
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ComponentDao {
  
  @Autowired
  ComponentJdbcConnection componentJdbcConnection;
  
}
