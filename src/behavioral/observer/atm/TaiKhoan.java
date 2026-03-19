package behavioral.observer.atm;

public class TaiKhoan implements ATMListener{
    String ten;
    int soDu;
    ATM atm;


    public TaiKhoan(String ten, int soDu, ATM atm) {
        this.ten = ten;
        this.soDu = soDu;
        this.atm = atm;
    }


    @Override
    public boolean kiemTraSoDu(int soTien) {
        return (soDu - soTien) >= 50000;
    }

    @Override
    public void nhanThongBao(int soTien, boolean thanhCong) {
        System.out.println("Số dư ban đầu: " + soDu);
        if (thanhCong) {
            System.out.println("Số tiền rút: " + soTien);
            soDu = soDu - soTien;
            System.out.println("Số dư còn lại là: " + soDu);
        }
        else {
            System.out.println("Rút tiền không thành công!");
            System.out.println("Số dư cuối: " + soDu);
        }
    }

    public void duaThe(){
        atm.nhanThe(this);
    }
    public void traThe() {
        atm.traThe();
    }
}