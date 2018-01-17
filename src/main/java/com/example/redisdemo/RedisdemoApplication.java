package com.example.redisdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan("com.example.redisdemo.dao")
@EnableCaching
public class RedisdemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(RedisdemoApplication.class, args);
	}
}
