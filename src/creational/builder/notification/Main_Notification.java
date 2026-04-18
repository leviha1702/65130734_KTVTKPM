package creational.builder.notification;

public class Main_Notification {
    static void main(String[] args) {
        Notification n =new Notification.NotificationBuilder().
                buildTitle("Hãng hàng không").
                buildMessage("BAY THT SA").
                buildIcon("HAHA").
                buildSound("HUHU").
                buildPriority("8888").
                buildActionButtons("HHHHH").
                build();
        System.out.println(n);
    }
}
