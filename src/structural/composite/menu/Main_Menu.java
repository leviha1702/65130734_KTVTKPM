package structural.composite.menu;

public class Main_Menu {
    static void main(String[] args) {
        MenuComponent burger = new Dish("Burger", 5.0);
        MenuComponent coke = new Dish("Coke", 2.0);
        MenuComponent fries = new Dish("Fries", 3.0);
        MenuComponent pizza = new Dish("Pizza", 10.0);
        MenuComponent rice = new Dish("Rice",65);

        Combo combo1 = new Combo("Cơm trưa");
        combo1.add(coke);
        combo1.add(pizza);

        Combo combo2 = new Combo("Buổi tiệc chiều");
        combo2.add(combo1);
        combo2.add(fries);

        System.out.println("--Chi tiết menu--");
        combo2.shoItem();

        System.out.println("\n--- TỔNG THANH TOÁN ---");
        System.out.println("Tổng hóa đơn cho " +((Combo)combo2).getNameCombo()+ " là: $" + combo2.getPrice());
    }
}
