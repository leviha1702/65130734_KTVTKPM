package creational.singleton.access;

public class SanPham {
    String id,ten;
    int sl;

    public SanPham(String id, String ten, int sl) {
        this.id = id;
        this.ten=ten;
        this.sl=sl;
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "id='" + id + '\'' +
                ", ten='" + ten + '\'' +
                ", sl=" + sl +
                '}';
    }
}
