package com.dzkj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//扫描controller层 和service层
@ComponentScan(basePackages = {"com.dzkj"})
@MapperScan("com.dzkj.mapper")

public class start {
	public static void main(String[] args) {
		SpringApplication.run(start.class, args);
	}

}
