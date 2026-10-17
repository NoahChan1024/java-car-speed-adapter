
public class Adapter extends Car{
    Car car;
    
    public Adapter(Car car){
        this.car = car;
    }
    
     public String getName() {
        return car.getName();
    }

    public double getMaxSpeed() {
        return car.getMaxSpeed();
    }

    public double compare(Car car) {
        return getMaxSpeed() - car.getMaxSpeed();
    }
}
