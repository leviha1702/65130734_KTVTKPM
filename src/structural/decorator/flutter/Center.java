package structural.decorator.flutter;

public class Center extends WidgetDecorator{
    public Center(Widget widget) {
        super(widget);
    }

    @Override
    public String showText() {
        return super.showText() +" (Nội dung đã vào trung tâm)";
    }

    @Override
    public String showButton() {
        return super.showButton() +" (Nút đã vô trung tâm)";
    }
}
