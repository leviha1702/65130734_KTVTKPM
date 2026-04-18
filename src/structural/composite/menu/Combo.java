package structural.composite.menu;

import java.util.ArrayList;
import java.util.List;

public class Combo implements MenuComponent{
    private String nameCombo;
    private List<MenuComponent> children=new ArrayList<>();

    public Combo(String nameCombo) {
        this.nameCombo = nameCombo;
    }

    public String getNameCombo() {
        return nameCombo;
    }

    @Override
    public void shoItem() {
        System.out.println("\n[Combo]" +nameCombo+" (Giá: "+getPrice()+"$)");
        for (MenuComponent ch:children){
            ch.shoItem();
        }
    }
    public void add(MenuComponent menu){
        children.add(menu);
    }

    @Override
    public double getPrice() {
        double s = 0;
        for (MenuComponent ch:children){
            s+=ch.getPrice();
        }
        return s;
    }
}
