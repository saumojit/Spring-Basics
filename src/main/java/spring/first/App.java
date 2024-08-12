package spring.first;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // < Setter Injection and Ref : Classes Human/Cat/Dog & Interface Animal >
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Human hm = (Human) context.getBean("human"); // context.getBean(Human.class) -- option1
        hm.setAge(7);
        hm.pet();
        System.out.println(hm.getAge());

        // Lazy Beans created only when they are called ( onetime still it is singleton)
        Cat ct = (Cat) context.getBean("cat");

    }
}
