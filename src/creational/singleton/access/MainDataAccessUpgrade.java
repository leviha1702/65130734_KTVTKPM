package creational.singleton.access;

public class MainDataAccessUpgrade {
    static void main(String[] args) {
        DataAccessUpgrade ui1= DataAccessUpgrade.getInstance("Hà");
        DataAccessUpgrade ui2= DataAccessUpgrade.getInstance("Ngân");
        DataAccessUpgrade ui3= DataAccessUpgrade.getInstance("Ngân");
        ui1.add(new SanPham("01","Bánh Chưng",50));
        ui2.add(new SanPham("02","Bánh Tét",60));
        ui2.add(new SanPham("03","Bánh Dày",40));
        ui3.add(new SanPham("04","Bánh Xèo",15));
        System.out.println("UI1:");
        ui1.inDS();
        System.out.println("UI2:");
        ui2.inDS();
    }
}
