package structural.decorator.flutter;

public class WidgetDecorator implements Widget{
    Widget widget;

    public WidgetDecorator(Widget widget) {
        this.widget = widget;
    }

    @Override
    public String showText() {
        return widget.showText();
    }

    @Override
    public String showButton() {
        return widget.showButton();
    }
}
