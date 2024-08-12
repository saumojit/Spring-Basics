package spring.first;

public class Human {
    private int age;
    public Animal anm ;

    public Human(){
        System.out.println("Human Object Created ...");
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animal getAnm() {
        return anm;
    }

    public void setAnm(Animal anm) {
        this.anm = anm;
    }

    public void pet(){
        System.out.println("Petting ...");
        anm.sound();
    }
}
