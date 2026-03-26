package behavioral.observer.youtube;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel implements Subject{
    private List<Observer> subscribers = new ArrayList<>();
    private  String lastestVideoTitle;

    @Override
    public void attach(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer : subscribers){
            observer.update(lastestVideoTitle);
        }
    }
    public void uploadVideo(String title){
        this.lastestVideoTitle = title;
        System.out.println("New video uploaded: " + title);
        notifyObserver();
    }
}
