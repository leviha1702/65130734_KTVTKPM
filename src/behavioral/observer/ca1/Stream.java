package behavioral.observer.ca1;

import java.util.ArrayList;
import java.util.List;

public class Stream implements Subject {

    private List<Observer> notifyObservers = new ArrayList<>();

    @Override
    public void notifyObservers(List<MonHoc> danhSach) {
        for (Observer o : notifyObservers) {
            o.update(danhSach);
        }
    }

    public void addObserver(Observer o) {
        notifyObservers.add(o);
    }

    public void removeObserver(Observer o) {
        notifyObservers.remove(o);
    }

    public void addEvent(List<MonHoc> danhSach) {
        System.out.println(">>> Co thay doi danh sach mon hoc!");
        notifyObservers(danhSach);
    }
}