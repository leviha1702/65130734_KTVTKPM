package structural.decorator.anvatkimchi;

public class Main_Product {
    static void main(String[] args) {
        Product pr = new ProductBasic("Sieu ngon ",30000,"Trà sữa");
        System.out.println(pr.showProduct()+"So tien:"+pr.totalPrice());
        pr = new TranChau(pr);
        System.out.println(pr.showProduct()+" Tong tien: " +pr.totalPrice());
        pr = new AddSot(pr);
        pr = new dongGoi(pr);
        System.out.println(pr.showProduct()+" Tổng số tiền: "+pr.totalPrice());
    }
}
