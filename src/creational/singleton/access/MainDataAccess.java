package creational.singleton.access;

public class MainDataAccess {
    static void main(String[] args) {
        DataAccess ui1=DataAccess.getInstance();
        DataAccess ui2=DataAccess.getInstance();
        ui1.add(new SanPham("01","Bánh Chưng",50));
        ui2.add(new SanPham("02","Bánh Tét",60));
        ui2.add(new SanPham("03","Bánh Dày",40));
        ui2.inDS();
    }
}
