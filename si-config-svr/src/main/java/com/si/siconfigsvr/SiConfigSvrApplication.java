package com.si.siconfigsvr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SiConfigSvrApplication {

    public static void main(String[] args) {
        SpringApplication.run(SiConfigSvrApplication.class, args);
    }

}
