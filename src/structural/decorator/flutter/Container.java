package structural.decorator.flutter;

public class Container extends WidgetDecorator{
    public Container(Widget widget) {
        super(widget);
    }

    @Override
    public String showText() {
        return super.showText() +" (Nội dung đã được Container)";
    }

    @Override
    public String showButton() {
        return super.showButton() +" (Nút đã vào Container)";
    }
}
