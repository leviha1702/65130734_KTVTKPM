package creational.singleton.vote;

import java.util.ArrayList;
import java.util.List;

public class Election {
    List<String> voteUser = new ArrayList<>();
    private static Election instance;
    int trump=0;
    int biden=0;
    private Election(){

    }
    public static Election getInstance(){
        if(instance==null){
            instance = new Election();
        }
        return instance;
    }
    public void vote (Candidate c,String id){
        for(var user: voteUser)
            if(user.equals(id))
                return;
        voteUser.add(id);
        if (c == Candidate.TRUMP){
            trump++;
        }
        else biden++;
    }
    public void printResult(){
        System.out.println("Donal Trump:"+trump);
        System.out.println("Joe Biden"+ biden);
    }
}
