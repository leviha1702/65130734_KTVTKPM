package structural.decorator.beverage;

public class MainBeverage {
    static void main(String[] args) {
        Beverage b = new HouseBlend("Cafe Trung nguyên số 2 TG");
        System.out.println("Lần 1");
        System.out.println(b.getDescription());
        System.out.println(b.cost());
        b=new Milk("Sữa cô gái Hà Tây",b);
        System.out.println("Lần 2");
        System.out.println(b.getDescription());
        System.out.println(b.cost());
        b=new Milk("Sữa ông thọ",b);
        System.out.println("Lần 3");
        System.out.println(b.getDescription());
        System.out.println(b.cost());
    }
}
