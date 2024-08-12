package spring.first;

public class Dog implements Animal {
    public Dog() {
        System.out.println("Dog Object Created ...");
    }

    @Override
    public void sound(){
        System.out.println("Barking ...");
    }
}
