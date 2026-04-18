package structural.composite.menu;

public class Dish implements MenuComponent{
    private String nameDisk;
    private double price;

    public Dish(String nameDisk, double price) {
        this.nameDisk = nameDisk;
        this.price = price;
    }

    @Override
    public void shoItem() {
        System.out.println("- "+nameDisk+" :"+price+"$");
    }

    @Override
    public double getPrice() {
        return price;
    }
}
