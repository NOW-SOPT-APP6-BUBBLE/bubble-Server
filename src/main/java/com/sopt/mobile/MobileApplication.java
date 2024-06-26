package com.sopt.mobile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
public class MobileApplication {

  public static void main(String[] args) {
    SpringApplication.run(MobileApplication.class, args);
  }

}
