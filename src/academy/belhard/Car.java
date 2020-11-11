package academy.belhard;

import academy.belhard.api.Costable;

import java.util.Random;

public class Car extends Vehicle implements Costable{
    private int doorsCount;
    private int priceKoef;

    private static final String VEHICLE_CLASS = "Машина";

    public Car (int wheelCount, int doorsCount){
        this.wheelCount = wheelCount;
        this.doorsCount = doorsCount;

    }

    @Override
    public int getCost() {
        Random rand = new Random();
        do
           priceKoef = rand.nextInt(10);
        while(priceKoef == 0);
        int totalCost = priceKoef * 300;
        return totalCost;
    }

    public void printInfo(){
        System.out.println("Транспортное средство: " + VEHICLE_CLASS + " - Количество дверей: " + doorsCount +
                " - Количество колес: " + wheelCount);
        System.out.println("Стоимость: " + getCost() + " USD");
    }


}
