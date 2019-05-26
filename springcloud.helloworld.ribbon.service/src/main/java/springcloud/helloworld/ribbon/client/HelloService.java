package springcloud.helloworld.ribbon.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Service

public class HelloService {
    @Autowired RestTemplate restTemplate;
    @RequestMapping("/test")
    public String getHelloContent() {
    	System.out.println("++++++++++++++++++++++++++++");
        return restTemplate.getForObject("http://SERVICE-HELLOWORLD/",String.class);
    }
    
 
}