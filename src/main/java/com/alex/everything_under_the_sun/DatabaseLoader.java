package com.alex.everything_under_the_sun;

import com.alex.everything_under_the_sun.model.Product;
import com.alex.everything_under_the_sun.service.OrderService;
import com.alex.everything_under_the_sun.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.logging.Level;
import java.util.logging.Logger;

// IMAGES ARE NOT OWNED BY ME

/**
 * Clas to load products into database initially using command line runner.
 */
@Component
public class DatabaseLoader implements CommandLineRunner {
    private final ProductServiceImpl productServiceImpl;
    private final OrderService orderService;
    Logger log;

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
        log.log(Level.INFO, "Adding Products...");
        productServiceImpl.save(new Product(1L,
                "Toaster",
                34.98,
                "A decent toaster for a great morning!",
                "https://media.istockphoto.com/photos/bright-fun-breakfast-cyan-color-toaster-on-a-wooden-background-n-picture-id1158012900?k=20&m=1158012900&s=612x612&w=0&h=78yM67xwhp14wcoMjW9cndT6L6ICD0MMLiuv1oy8T0Y="));
        productServiceImpl.save(new Product(2L,
                "Speaker",
                282.97,
                "A great speaker with bass that will let the whole neighborhood know it's time to party!",
                "https://cdn.vox-cdn.com/thumbor/cSe04IkTsKTpDO1bBizrhAIEPvo=/0x395:2040x1415/fit-in/1200x600/cdn.vox-cdn.com/uploads/chorus_asset/file/19575267/soundbar.jpg"));
        productServiceImpl.save(new Product(3L,
                "44 inch Monitor",
                628.78,
                "Don't miss a thing with this high end desktop monitor!",
                "https://9to5toys.com/wp-content/uploads/sites/5/2021/10/sceptre-nebula-44-monitor-5.jpg"));


        //! Delete everything below this & move the log message
        productServiceImpl.save(new Product(4L,
                "pool",
                762.31,
                "An outdoor pool for those hot summer days!",
                "..."));
        productServiceImpl.save(new Product(5L,
                "fan",
                12.27,
                "A Fan to cool your house on hot days",
                "..."));
        productServiceImpl.save(new Product(6L,
                "scratching post",
                31.51,
                "A quality scratching post for your favorite pet",
                "..."));
        productServiceImpl.save(new Product(7L,
                "tie",
                5.17,
                "A Polkadot tie for those days when you're feeling fun!",
                "..."));
        log.log(Level.FINE, "Finished adding products");
    }
}
