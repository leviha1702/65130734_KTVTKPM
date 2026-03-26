package behavioral.observer.youtube;

public class Subcriber implements Observer{
    private String name;
    public Subcriber (String name){
        this.name=name;
    }

    @Override
    public void update(String videofile) {
        System.out.println("Xin chao"+name+"kenh ban"+"vua ra video moi:"+videofile);
    }
}
