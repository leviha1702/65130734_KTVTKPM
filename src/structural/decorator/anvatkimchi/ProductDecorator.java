package structural.decorator.anvatkimchi;

public class ProductDecorator implements Product{
    Product product;

    public ProductDecorator(Product product) {
        this.product = product;
    }

    @Override
    public double totalPrice() {
        return product.totalPrice();
    }

    @Override
    public String showProduct() {
        return product.showProduct();
    }
}
