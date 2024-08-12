package spring.second;

public class Alien {
    public int age ;
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
