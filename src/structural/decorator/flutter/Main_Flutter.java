package structural.decorator.flutter;

public class Main_Flutter {
    static void main(String[] args) {
        Widget w=new WidgetBasic("Xin chào các bạn","Nút vãy tay");
        System.out.println(w.showText()+" và " +w.showButton());
        w=new Center(w);
        System.out.println(w.showText()+" và " +w.showButton());
        w= new Container(w);
        System.out.println(w.showText()+" và " +w.showButton());
    }
}
