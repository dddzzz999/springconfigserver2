package com.dz.cfgserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Springconfigserver2MasterGitApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springconfigserver2MasterGitApplication.class, args);
	}
}
