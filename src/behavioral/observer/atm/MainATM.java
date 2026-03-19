package behavioral.observer.atm;

public class MainATM {
    static void main(String[] args) {
        ATM atm = new ATM();
        ATMListener taikhoan= new TaiKhoan("Việt Hà", 20000000,atm);
        atm.rutTien(10000000);
        ((TaiKhoan) taikhoan).duaThe();
        atm.rutTien(10000000);
        atm.rutTien(15000000);

    }
}
