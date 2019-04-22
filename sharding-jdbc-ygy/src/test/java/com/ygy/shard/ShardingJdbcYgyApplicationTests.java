package com.ygy.shard;

import com.ygy.shard.mapper.StudentMapper;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
public class ShardingJdbcYgyApplicationTests {

	@Resource
	StudentMapper studentMapper;

}
