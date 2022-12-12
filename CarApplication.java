package Car;

public class CarApplication {
    public static void main(String[] args) {
        Car car1 = new Car(500);
        Car car2 = new Car(400);

        car1.setModel("Toyota GG1");
        car2.setModel("Mazda F10");

        double car1Price = car1.getPrice();
        double car2Price = car2.getPrice();

        System.out.printf("The price for %s is %f%n", car1.getModel(), car1Price);
        System.out.printf("The price for %s is %f%n", car2.getModel(), car2Price);

        car1.setDiscountPrice(5);
        car2.setDiscountPrice(7);


        System.out.printf("%nThe price for %s is now %f after discount applied %n", car1.getModel(), car1.getDiscountPrice());
        System.out.printf("The price for %s is now %f after discount applied %n", car2.getModel(), car2.getDiscountPrice());



    }
}
