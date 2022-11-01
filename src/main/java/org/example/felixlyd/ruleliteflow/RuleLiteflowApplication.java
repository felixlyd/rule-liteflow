package org.example.felixlyd.ruleliteflow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RuleLiteflowApplication {

    public static void main(String[] args) {
        SpringApplication.run(RuleLiteflowApplication.class, args);
    }

}
