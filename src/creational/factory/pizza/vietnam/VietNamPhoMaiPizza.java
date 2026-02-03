package creational.factory.pizza.vietnam;

import creational.factory.pizza.Pizza;

public class VietNamPhoMaiPizza extends Pizza {

    @Override
    public void prepare() {
        this.getBuilder().append("Chuan bi pizza pho mai Viet Nam\n");
    }

    @Override
    public void bake() {
        this.getBuilder().append("Nuong pizza pho mai\n");
    }

    @Override
    public void cut() {
        this.getBuilder().append("Cat pizza pho mai\n");
    }

    @Override
    public void box() {
        this.getBuilder().append("Dong hop pizza pho mai\n");
    }
}
