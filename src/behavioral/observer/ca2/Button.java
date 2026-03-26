package behavioral.observer.ca2;

import java.util.ArrayList;
import java.util.List;

public class Button implements Subject{
    private List<ButtonClickListener> listneners = new ArrayList<>();
    private int clickCount=0;

    @Override
    public void attach(ButtonClickListener listerner) {
        listneners.add(listerner);
    }

    @Override
    public void detach(ButtonClickListener listerner) {
        listneners.remove(listerner);
    }

    @Override
    public void notifyListeners() {
        for(ButtonClickListener listener :listneners){
            listener.onClick(clickCount);
        }
    }
    public void click(){
        clickCount++;
        notifyListeners();
    }
}
