public class Hangar {

    public static void main(String[] args) {

        Car myCar = new Car("Opel", 144000);
        Boat myBoat = new Boat("Amel", 2000);
        System.out.println(myCar.doStuff());
        System.out.println(myBoat.doStuff());
    }
}