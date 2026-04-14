package structural.decorator.anvatkimchi;

public class TranChau extends AddTopping{
    public TranChau(Product product) {
        super(product);
    }

    @Override
    public String showProduct() {
        return super.showProduct()+" Trân Châu";
    }

    @Override
    public double totalPrice() {
        return super.totalPrice()+5000;
    }
}
