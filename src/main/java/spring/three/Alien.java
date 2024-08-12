package spring.three;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import spring.three.Computer;

@Component
public class Alien {
    @Value("24")
    public int age ;

    @Autowired
    @Qualifier("desktop")   // @Qualifier has higher precedence than @Primary
    public Computer com;
    public Alien(){
        System.out.println("Alien Object Created ...");
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void code(){
        com.compile();
        System.out.println("Coding ...");
    }
}
