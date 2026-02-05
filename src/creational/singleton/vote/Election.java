package creational.singleton.vote;

public class Election {
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
    public void vote (Candidate c){
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
