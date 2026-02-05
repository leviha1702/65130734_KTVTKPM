package creational.singleton.access;

import javax.swing.plaf.PanelUI;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class DataAccessUpgrade {
    private static Map<String, DataAccessUpgrade> instances = new HashMap<>();
    List<SanPham> sps = new ArrayList<>();
    public static DataAccessUpgrade getInstance(String tag){
        if(instances.get(tag)==null)
            instances.put(tag,new DataAccessUpgrade());
        return instances.get(tag);
    }
    private DataAccessUpgrade (){

    }
    public void add(SanPham s){
        sps.add(s);
    }
    public void inDS(){
        for(var sp:sps)
            System.out.println(sp.toString());
    }
}
