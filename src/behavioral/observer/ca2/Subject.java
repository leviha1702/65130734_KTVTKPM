package behavioral.observer.ca2;

public interface Subject {
    void attach (ButtonClickListener listerner);
    void detach(ButtonClickListener listerner);
    void notifyListeners();
}
