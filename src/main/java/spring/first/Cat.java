package spring.first;

public class Cat implements Animal{
    public Cat() {
        System.out.println("Cat Object Created ...");
    }

    @Override
    public void sound(){
        System.out.println("Meow ...");
    }
}
