package com.ygy.shard;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ygy.shard.mapper")
public class ShardingJdbcYgyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShardingJdbcYgyApplication.class, args);
	}

}
