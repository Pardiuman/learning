package part1.inheritance;

public class Car extends Vehicle{

    public String name;



    public Car(String name) {
        this.name = name;
    }

    public Car(String category, String fuelType, String name) {
        super(category, fuelType);
        this.name = name;
    }


    public static void main(String[] args) {

//        the refernce type define what memebers can be accessed not the object type.
        Vehicle one = new Car("mitsubishi");
        System.out.println(one.category+" "+one.fuelType);

        Car car1 = new Car("bmw");
        System.out.println(car1.name+" "+car1.category+" "+car1.fuelType);

        Vehicle vehicle1= new Vehicle();
        System.out.println(vehicle1.category+" "+vehicle1.fuelType);


    }
}
