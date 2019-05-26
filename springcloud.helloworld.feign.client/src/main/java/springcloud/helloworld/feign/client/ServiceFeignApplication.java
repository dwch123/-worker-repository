package springcloud.helloworld.feign.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
 
public class ServiceFeignApplication {
	public static void main(String[] args) {
		 SpringApplication.run(ServiceFeignApplication.class, args);
	}
}
