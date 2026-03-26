package behavioral.observer.ca2;

public class Activity implements ButtonClickListener{
    private String activityName;
    public Activity (String activityName){
        this.activityName=activityName;
    }

    @Override
    public void onClick(int clickCount) {
        System.out.println("["+activityName+"] ban click lan thu "+clickCount);
    }
}
