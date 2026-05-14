package behavioral.stratery.cc2;

public class SinhVien {
    String ten;
    float diem;
    String ngaySinh;

    public SinhVien(float diem, String ngaySinh, String ten) {
        this.diem = diem;
        this.ngaySinh = ngaySinh;
        this.ten = ten;
    }

    public float getDiem() {
        return diem;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "diem=" + diem +
                ", ten='" + ten + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                '}';
    }
}
