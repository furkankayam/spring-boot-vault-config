package com.furkankayam;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Furkan Kaya
 */
@RefreshScope
@RestController
@SpringBootApplication
public class SpringBootVaultConfigApplication {

    @Value("${app.user.name}")
    private String name;

    @GetMapping("/hello")
    public String hello() {
        return "Hello " + name + " !";
    }

	public static void main(String[] args) {
		SpringApplication.run(SpringBootVaultConfigApplication.class, args);
	}
}
