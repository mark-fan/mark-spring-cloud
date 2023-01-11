package com.mark.gateway.filter;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;

import java.util.List;

/**
 * 自定义负载均衡
 *
 * @author luofan
 */

public class MyRule extends AbstractLoadBalancerRule {

    @Override
    public void initWithNiwsConfig(IClientConfig iClientConfig) {
        System.out.println("zidingyi");

    }

    @Override
    public Server choose(Object o) {
        ILoadBalancer loadBalancer = this.getLoadBalancer();
        List<Server> reachableServers = loadBalancer.getReachableServers();
        System.out.println(reachableServers);
        return reachableServers.get(0);
    }
}
