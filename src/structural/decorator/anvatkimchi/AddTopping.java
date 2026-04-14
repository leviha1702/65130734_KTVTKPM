package structural.decorator.anvatkimchi;

public class AddTopping extends ProductDecorator{
    public AddTopping(Product product) {
        super(product);
    }

    @Override
    public String showProduct() {
        return super.showProduct()+"Đã thêm topping";
    }

    @Override
    public double totalPrice() {
        return super.totalPrice();
    }
}
