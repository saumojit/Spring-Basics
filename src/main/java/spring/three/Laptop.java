package spring.three;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import spring.three.Computer;

@Component
@Primary
//@Scope("prototype")
public class Laptop implements Computer {
    public Laptop(){
        System.out.println("Laptop Object Created ...");
    }

    @Override
    public void compile(){
        System.out.println("Compiling with Laptop ...");
    }
}
