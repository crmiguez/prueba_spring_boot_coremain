package com.crmiguez.iop_grid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
@EnableJpaRepositories("com.crmiguez.iop_grid.repository")
@EntityScan("com.crmiguez.iop_grid.entities")
public class IopGridApplication {

    public static void main(String[] args) {
        SpringApplication.run(IopGridApplication.class, args);
    }

}
