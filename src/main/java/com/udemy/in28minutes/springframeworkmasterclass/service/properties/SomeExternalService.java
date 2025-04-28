package com.udemy.in28minutes.springframeworkmasterclass.service.properties;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@NoArgsConstructor
public class SomeExternalService {

  @Value("${external.service.url}")
  private String url;

}
