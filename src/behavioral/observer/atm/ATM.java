package behavioral.observer.atm;

public class ATM {
    ATMListener taikhoan;
    public void nhanThe(ATMListener tk){
        taikhoan =tk;
    }
    public void traThe(){
        taikhoan = null;
    }
    public void rutTien(int soTien){
        if (taikhoan ==null){
            System.out.println("Mời đưa thẻ vào ATM");
            return;
        }
        if (taikhoan.kiemTraSoDu(soTien)){
            taikhoan.nhanThongBao(soTien,true);
        }
        taikhoan.nhanThongBao(soTien,false);
    }
}
