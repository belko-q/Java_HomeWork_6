package academy.belhard;


public class Motorcycle extends Vehicle{
    private int maxSpeed;

    private static final String VEHICLE_CLASS = "Мотоцикл";

    public Motorcycle(int wheelCount, int maxSpeed){
        this.wheelCount = wheelCount;
        this.maxSpeed = maxSpeed;

    }

    public void printInfo() {
        System.out.println("Транспортное средство: " + VEHICLE_CLASS + " - Количество колес: " + wheelCount +
                " - Максимальная скорость: " + maxSpeed);
    }



}
