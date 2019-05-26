package springcloud.helloworld.feign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "SERVICE-HELLOWORLD")
public interface HelloWorldService {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    String sayHello();
}