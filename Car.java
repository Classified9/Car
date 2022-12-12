package Car;

public class Car {
    private String model;
    private String year;
    private double price;

    private double discountPrice;

    public Car( double carPrice){
        price = carPrice;
    }

    public void setDiscountPrice(double percent){
        double operand = (price * percent) / 100 ;
        discountPrice = price - operand;
    }

    public double getDiscountPrice(){
        return discountPrice;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getYear() {
        return year;
    }

    public void setPrice(double price) {
        if (price >= 0) this.price = price;
    }

    public double getPrice() {
        return price;
    }

}
