package behavioral.observer.ca1;

public class Main_ca1 {
    static void main(String[] args) {
        DataAccess db=new DataAccess();
        Client appScreen = new Client();
        db.getStream().addObserver(appScreen);
        System.out.println("--Hanh dong: Them mon hoc--");
        db.themMonHoc(new MonHoc("SOT301","Thiet ke Web"));
        db.themMonHoc(new MonHoc("SOT302","Database"));
        System.out.println("--Hanh dong: Cap nhat mon hoc--");
        db.capNhatMonHoc("SOT301","Java Web(Update)");
        System.out.println("--Hanh dong: Xoa mon hoc--");
        db.xoaMonHoc("SOT301");
    }
}
