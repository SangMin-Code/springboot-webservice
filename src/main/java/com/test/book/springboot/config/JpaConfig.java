package com.test.book.springboot.config;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories  //JPA Auditing 활성화
public class JpaConfig {}
