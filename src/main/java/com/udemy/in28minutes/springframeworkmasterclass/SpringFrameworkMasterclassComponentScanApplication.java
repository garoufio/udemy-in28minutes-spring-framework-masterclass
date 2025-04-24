package com.udemy.in28minutes.springframeworkmasterclass;

import com.udemy.in28minutes.componentscan.scope.dao.ComponentDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.udemy.in28minutes.componentscan.scope")
public class SpringFrameworkMasterclassComponentScanApplication {
  
  private static Logger logger = LoggerFactory.getLogger(SpringFrameworkMasterclassComponentScanApplication.class);
  
  //-------------------------------------------------------------------------------------------------------------------
  
  public static void main(String[] args) {
    ApplicationContext applicationContext =
        SpringApplication.run(SpringFrameworkMasterclassComponentScanApplication.class, args);
    
    // test scope: ComponentDao is a singleton and JdbcConnection is a prototype
    ComponentDao componentDao = applicationContext.getBean(ComponentDao.class);
    logger.info("{}", componentDao);
    logger.info("{}", componentDao.getComponentJdbcConnection());
    logger.info("{}", componentDao.getComponentJdbcConnection()); // different instance as it is a prototype bean
    
    ComponentDao ComponentDao2 = applicationContext.getBean(ComponentDao.class);
    logger.info("{}", ComponentDao2);
    logger.info("{}", ComponentDao2.getComponentJdbcConnection());
  }
  
  //-------------------------------------------------------------------------------------------------------------------
  
}
