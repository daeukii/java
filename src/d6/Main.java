package d6;

public class Main {
    public static void main(String[] args) {
        Car sonata = new Car();
        refuel(sonata);
        System.out.println(sonata.getFuel());
        sonata.drive(100);
        sonata.beep();

        Truck porter = new Truck(100);
        refuel(porter);
        System.out.println(porter.getFuel());
        porter.drive(100);
        porter.beep();
        porter.addLoad(30);
        System.out.println(String.format(
                "max load: %d, current load: %d",
                porter.getMaxLoad(),porter.getLoad()));


        Car bongo = new Truck(100);
        ((Truck) bongo).addLoad(10);
        if (isTruck(bongo))
            ((Truck) bongo).addLoad(10);
        else System.out.println("is not truck");

        porter.drive(30);

        refuel(bongo);
        bongo.drive(100);
    }

    public static boolean isTruck(Car car){
        return car instanceof Truck;
    }

    public static void refuel (Car car){
        car.setFuel(100);
    }
}
