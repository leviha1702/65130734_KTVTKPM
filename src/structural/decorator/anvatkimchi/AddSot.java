package structural.decorator.anvatkimchi;

public class AddSot extends ProductDecorator{
    public AddSot(Product product) {
        super(product);
    }

    @Override
    public String showProduct() {
        return super.showProduct()+" Đã thêm sốt ";
    }

    @Override
    public double totalPrice() {
        return super.totalPrice() +2000;
    }
}
