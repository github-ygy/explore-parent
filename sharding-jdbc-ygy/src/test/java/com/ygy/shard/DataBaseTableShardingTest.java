package com.ygy.shard;

import com.ygy.shard.entity.Student;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author guoyao
 * @date 2019/4/22
 */

@SpringBootTest(classes = TestShardingConfig.class)
public class DataBaseTableShardingTest extends ShardingJdbcYgyApplicationTests {

    @Test
    public void testGet() {
        Student student = studentMapper.getById(100);
        System.out.println(student);
    }

    @Test
    public void testInsert() {
        Student student = new Student(101, "test_name", 2);
        studentMapper.insert(student);
        System.out.println(student);
    }
}
