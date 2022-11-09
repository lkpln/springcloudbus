package cn.byzk.busserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableConfigServer  //标记为 Config　Server
@EnableEurekaClient
@SpringBootApplication
public class BusServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BusServerApplication.class, args);
    }

}
