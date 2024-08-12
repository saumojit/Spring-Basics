package spring.first;

public class Bus {
    private int mile  ;
    private Engine eng ;
    public Bus(){
        System.out.println("Bus Object Created ...");
    }

    public int getMile() {
        return mile;
    }
    public void setMile(int mile) {
        System.out.println("Bus Setter Injection Called");
        this.mile = mile;
    }

    public Engine getEng() {
        return eng;
    }
    public void setEng(Engine eng) {
        this.eng = eng;
    }


    public void drive(){
        eng.start_the_engine();
        System.out.println("Driving ...");
    }
}
