package behavioral.observer.ca6;

import java.util.ArrayList;
import java.util.List;

public class PlayerData implements Subject{
    private List<Observer> observers = new ArrayList<>();
    private int thoigian, coutdown, grade;



    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers){
            o.update(thoigian,coutdown,grade);
        }
    }

    public void setThoigian(int thoigian) {
        this.thoigian = thoigian;
        notifyObservers();
    }

    public void setCoutdown(int coutdown) {
        this.coutdown = coutdown;
        notifyObservers();
    }

    public void setGrade(int grade) {
        this.grade = grade;
        notifyObservers();
    }

    public void setGameData(int thoigian, int coutdown, int grade){
        this.thoigian = thoigian;
        this.coutdown = coutdown;
        this.grade = grade;
        notifyObservers();
    }

}