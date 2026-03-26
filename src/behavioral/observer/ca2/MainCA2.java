package behavioral.observer.ca2;

public class MainCA2 {
    static void main(String[] args) {
        Activity mainActivity = new Activity("MainActivity");
        Button btnSubmit = new Button();
        btnSubmit.attach(mainActivity);
        System.out.println("--Mo phong nguoi dung--");
        btnSubmit.click();
        btnSubmit.click();
        btnSubmit.click();
    }
}
