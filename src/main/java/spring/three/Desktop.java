package spring.three;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import spring.three.Computer;

@Component            // @Component("desktop1")
public class Desktop implements Computer {
    public Desktop() {
        System.out.println("Desktop Object Created ...");
    }
    @Override
    public void compile(){
        System.out.println("Compiling using Desktop ...");
    }
}
