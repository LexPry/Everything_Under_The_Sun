package com.alex.everything_under_the_sun;

import com.alex.everything_under_the_sun.model.Order;
import com.alex.everything_under_the_sun.model.Product;
import com.alex.everything_under_the_sun.service.OrderService;
import com.alex.everything_under_the_sun.service.OrderServiceImpl;
import com.alex.everything_under_the_sun.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

@Component
public class DatabaseLoader implements CommandLineRunner {
    Logger log;
    private final ProductServiceImpl productServiceImpl;
    private final OrderService orderService;

    @Autowired
    public DatabaseLoader(ProductServiceImpl productServiceImpl, OrderService orderService)
    {
        this.productServiceImpl = productServiceImpl;
        this.orderService = orderService;
        this.log = Logger.getLogger(DatabaseLoader.class.getName());
    }

    @Override
    public void run(String... args) throws Exception
    {
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
//        log.log(Level.FINE, "Adding orders...");
//
//        log.log(Level.FINE, "Finished adding orders");
    }
}
