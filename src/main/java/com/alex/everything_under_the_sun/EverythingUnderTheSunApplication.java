package com.alex.everything_under_the_sun;

import com.alex.everything_under_the_sun.model.Product;
import com.alex.everything_under_the_sun.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.logging.Level;
import java.util.logging.Logger;

@SpringBootApplication
public class EverythingUnderTheSunApplication {
    Logger log = Logger.getLogger(EverythingUnderTheSunApplication.class.getName());

    public static void main(String[] args)
    {
        SpringApplication.run(EverythingUnderTheSunApplication.class, args);
    }

    // Manually adding products to the application
    @Bean
    CommandLineRunner runner(ProductServiceImpl productServiceImpl)
    {
        return args -> {
            log.log(Level.INFO,"Adding Products...");
            productServiceImpl.save(new Product(1L,
                    "Toaster",
                    34.98,
                    "A decent toaster for a great morning!",
                    "..."));
            productServiceImpl.save(new Product(2L,
                    "Speaker",
                    282.97,
                    "A great speaker with bass that will let the whole neighborhood know it's time to party!",
                    "..."));
            productServiceImpl.save(new Product(3L,
                    "44 inch Monitor",
                    628.78,
                    "Don't miss a thing with this high end desktop monitor!",
                    "..."));
            log.log(Level.FINE, "Finished adding products");
        };
    }
}
