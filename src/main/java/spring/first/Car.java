package spring.first;

public class Car {
    private int mile  ;
    private int fuel ;
    private Engine eng ;
    public Car( int mile , int fuel, Engine eng ) {
        this.eng = eng;
        this.fuel = fuel;
        this.mile = mile;
    }

    public int getMile() {
        return mile;
    }
}
