package structural.decorator.anvatkimchi;

public class PhoMai extends AddTopping{
    public PhoMai(Product product) {
        super(product);
    }

    @Override
    public String showProduct() {
        return super.showProduct()+" Phô Mai";
    }

    @Override
    public double totalPrice() {
        return super.totalPrice() +10000;
    }
}
