package com.ygy.igniteygy;

import org.apache.ignite.Ignite;
import org.apache.ignite.Ignition;
import org.apache.ignite.configuration.IgniteConfiguration;
import org.apache.ignite.lang.IgniteCallable;
import org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi;
import org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * @author guoyao
 * @date 2019-05-15
 */
public class IgniteTest {

    /**
     * 启动ignite嵌入式服务
     */
    @Test
    public void testStart() {
        TcpDiscoverySpi spi = new TcpDiscoverySpi();
        TcpDiscoveryVmIpFinder ipFinder = new TcpDiscoveryVmIpFinder();
        ipFinder.setAddresses(Arrays.asList("192.168.20.70:47500..47509"));
        spi.setIpFinder(ipFinder);
        spi.setIpFinder(ipFinder);
        IgniteConfiguration cfg = new IgniteConfiguration();
        cfg.setDiscoverySpi(spi);
        cfg.setClientMode(true);
        try (Ignite ignite = Ignition.start(cfg)) {
            Collection<IgniteCallable<Integer>> calls = new ArrayList<>();

            // Iterate through all the words in the sentence and create Callable jobs.
            for (final String word : "Count characters using callable".split(" "))
                calls.add(word::length);

            // Execute collection of Callables on the grid.
            Collection<Integer> res = ignite.compute().call(calls);

            // Add up all the results.
            int sum = res.stream().mapToInt(Integer::intValue).sum();

            System.out.println("Total number of characters is '" + sum + "'.");
        }
    }
}
