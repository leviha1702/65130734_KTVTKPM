package structural.decorator.flutter;

public class WidgetBasic implements Widget{
    String text,button;

    public WidgetBasic(String text, String button) {
        this.text = text;
        this.button = button;
    }

    @Override
    public String showText() {
        return text;
    }

    @Override
    public String showButton() {
        return button;
    }
}
