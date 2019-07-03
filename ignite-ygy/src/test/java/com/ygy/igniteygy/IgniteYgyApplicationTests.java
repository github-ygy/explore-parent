package com.ygy.igniteygy;

import org.apache.ignite.Ignition;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IgniteYgyApplicationTests {

    @Test
    public void contextLoads() {
        Ignition.start("examples/config/example-ignite.xml");
    }

    @Test
    public void test() {

    }

}
