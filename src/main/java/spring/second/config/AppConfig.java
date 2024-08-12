package spring.second.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import spring.second.Alien;
import spring.second.Computer;
import spring.second.Desktop;
import spring.second.Laptop;

@Configuration
public class AppConfig {
    @Bean
    public Alien alien1(Computer com){   // @Qualifier("desktop1")
        Alien al = new Alien();
        al.setAge(10);
        al.setCom(com);
        return al;
    }

    @Bean
    @Primary
//    @Scope(value = "prototype")
    public Laptop laptop1(){
        return new Laptop();
    }

    @Bean
    public Desktop desktop1(){
        return new Desktop();
    }

}
