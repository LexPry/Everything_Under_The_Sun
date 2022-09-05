package com.alex.everything_under_the_sun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class EverythingUnderTheSunApplication {
    Logger log = Logger.getLogger(EverythingUnderTheSunApplication.class.getName());

    public static void main(String[] args)
    {
        SpringApplication.run(EverythingUnderTheSunApplication.class, args);
    }
}
