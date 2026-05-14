package behavioral.stratery.cc1;

public class Context {
    Tinh tinhToan;

    public void setTinhToan(Tinh tinhToan) {
        this.tinhToan = tinhToan;
    }

    public Tinh getTinhToan() {
        return tinhToan;
    }

    public float tinh(float a, float b) {
        return tinhToan.tinh(a,b);
    }
}
