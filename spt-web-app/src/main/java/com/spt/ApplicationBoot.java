package com.spt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@AutoConfigurationPackage
public class ApplicationBoot {
    public static void main( String[] args )
    {
        SpringApplication.run(ApplicationBoot.class,args);
    }
}
