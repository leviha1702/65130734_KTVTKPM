package behavioral.observer.ca6;

public class Dashboard implements Observer{
    private int thoiGian;
    private int countdown;
    private int grade;

    @Override
    public void update(int thoiGian, int countdown, int grade) {
        this.thoiGian=thoiGian;
        this.countdown=countdown;
        this.grade=grade;
    }
    public void display(){
        System.out.println("--DASHBOARD--");
        System.out.println("Thoi gian con lai:"+thoiGian);
        System.out.println("So luot con lai:"+countdown);
        System.out.println("Diem so:"+grade);
        System.out.println("--------------");
    }
}
