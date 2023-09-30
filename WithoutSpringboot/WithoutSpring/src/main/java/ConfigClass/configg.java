package ConfigClass;

import org.example.Product.Cart;
import org.example.Product.Payment;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.example")
public class configg {
@Bean
    public Cart getcart(){
        return new Cart();
    }
    @Bean
    public Payment p(){
        return new Payment();
    }
}

