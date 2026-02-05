package creational.singleton.access;

import javax.swing.plaf.PanelUI;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.List;

public class DataAccess {
    private static DataAccess instance;
    List<SanPham> sps = new ArrayList<>();
    public static DataAccess getInstance(){
        if(instance==null){
            instance = new DataAccess();
        }
        return instance;
    }
    private DataAccess (){

    }
    public void add(SanPham s){
        sps.add(s);
    }
    public void inDS(){
        for(var sp:sps)
            System.out.println(sp.toString());
    }
}
