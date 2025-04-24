package com.udemy.in28minutes.springframeworkmasterclass;

import com.udemy.in28minutes.springframeworkmasterclass.scope.dao.PersonDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class SpringFrameworkMasterclassScopeApplication {
  
  private static Logger logger = LoggerFactory.getLogger(SpringFrameworkMasterclassScopeApplication.class);
  
  //-------------------------------------------------------------------------------------------------------------------
  
  public static void main(String[] args) {
    ApplicationContext applicationContext =
        SpringApplication.run(SpringFrameworkMasterclassScopeApplication.class, args);

    // test scope: PersonDao is a singleton and JdbcConnection is a prototype
    PersonDao personDao = applicationContext.getBean(PersonDao.class);
    logger.info("{}", personDao);
    logger.info("{}", personDao.getJdbcConnection());
    logger.info("{}", personDao.getJdbcConnection()); // different instance as it is a prototype bean
    
    PersonDao personDao2 = applicationContext.getBean(PersonDao.class);
    logger.info("{}", personDao2);
    logger.info("{}", personDao2.getJdbcConnection());
  }
  
  //-------------------------------------------------------------------------------------------------------------------
  
}
