package behavioral.stratery.cc1;

public class MainTinhToan {
    static void main(String[] args) {
        Context c = new Context();
        c.setTinhToan(new Cong());
        float kq1 = c.tinh(75,32);
        System.out.println("75 + 32 = "+kq1 );
        Context c2 = new Context();
        c2.setTinhToan(new Chia());
        float kq2 = c2.tinh(35,5);
        System.out.println("35 : 5 = "+kq2);
    }
}
