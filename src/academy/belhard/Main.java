package academy.belhard;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Vehicle[] vehicle = new Vehicle[4];
        vehicle[0] = new Car(4, 2);
        vehicle[1] = new Car(4, 5);
        vehicle[2] = new Motorcycle(2, 170);
        vehicle[3] = new Motorcycle(2, 210);


        vehicle[0].printInfo();
        vehicle[1].printInfo();
        vehicle[2].printInfo();
        vehicle[3].printInfo();

    }

}
