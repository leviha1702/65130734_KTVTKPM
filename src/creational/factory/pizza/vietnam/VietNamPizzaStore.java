package creational.factory.pizza.vietnam;
import creational.factory.pizza.Pizza;
import creational.factory.pizza.PizzaStore;
import creational.factory.pizza.PizzaType;

public class VietNamPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(PizzaType type) {

        switch (type) {
            case HAISAN:
                return new VietNamHaiSanPizza();
            case BO:
                return new VietNamBoPizza();
            case PHOMAI:
                return new VietNamPhoMaiPizza();
            default:
                return null;
        }
    }
}
