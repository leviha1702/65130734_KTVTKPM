package creational.factory.pizza.vietnam;
import creational.factory.pizza.Pizza;

public class HaiSanPizza extends Pizza{
    @Override
    public void prepare() {
        this.getBuilder().append("Bột mì, mắm tôm, 4 con cá cơm");
    }

    @Override
    public void bake() {
        this.getBuilder().append("\nNướng trên lò than 20 phút");
    }

    @Override
    public void cut() {
        this.getBuilder().append("\nCắt làm 4 miếng");
    }

    @Override
    public void box() {
        this.getBuilder().append("\nGói vào lá chuối, bỏ vào hộp");
    }

}
