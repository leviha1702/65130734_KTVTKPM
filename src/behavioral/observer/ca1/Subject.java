package behavioral.observer.ca1;

import java.util.List;

public interface Subject {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers(List<MonHoc> danhSach);
}
