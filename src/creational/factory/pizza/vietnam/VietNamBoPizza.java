package creational.factory.pizza.vietnam;

import creational.factory.pizza.Pizza;

public class VietNamBoPizza extends Pizza {

    @Override
    public void prepare() {
        this.getBuilder().append("Chuan bi pizza bo Viet Nam\n");
    }

    @Override
    public void bake() {
        this.getBuilder().append("Nuong pizza bo\n");
    }

    @Override
    public void cut() {
        this.getBuilder().append("Cat pizza bo\n");
    }

    @Override
    public void box() {
        this.getBuilder().append("Dong hop pizza bo\n");
    }
}
