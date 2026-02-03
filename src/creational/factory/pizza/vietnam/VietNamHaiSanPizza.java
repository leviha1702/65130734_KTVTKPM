package creational.factory.pizza.vietnam;

import creational.factory.pizza.Pizza;

public class VietNamHaiSanPizza extends Pizza {

    @Override
    public void prepare() {
        this.getBuilder().append("Chuan bi pizza hai san Viet Nam\n");
    }

    @Override
    public void bake() {
        this.getBuilder().append("Nuong pizza\n");
    }

    @Override
    public void cut() {
        this.getBuilder().append("Cat pizza\n");
    }

    @Override
    public void box() {
        this.getBuilder().append("Dong hop pizza\n");
    }
}
