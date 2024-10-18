 abstract class car{
    public abstract void start();
    public abstract void stop() ;

}
//in interface the class is abstract and the methods are by default public abstract.
//we cannot  instantiate the interface and abstract class
//here the finsl dsignifies that the class canneot be further inherited
final class bmw extends car{
//    @Override
    public void start() {
        System.out.println("bmw started");
    }

//    @Override
    public void stop() {
        System.out.println("bmw stopped");
    }
}

class mahindra extends car{
//    @Override
    public void start() {
        System.out.println("mahindra started");
    }

//    @Override
    public void stop() {
        System.out.println("mahindra stopped");
    }
}

public class polymorphism {
    //bas class pointer and deriverd class object
    public static void main(String[] args) {
        car car = new bmw();
        car.start();
        car.stop();
        car = new mahindra();
        car.start();
        car.stop();
    }
}
