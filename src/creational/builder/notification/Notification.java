package creational.builder.notification;

public class Notification {
    private String title,message,icon,sound,priority,actionButtons;
    private Notification(NotificationBuilder b){
        this.actionButtons = b.actionButtons;
        this.icon = b.icon;
        this.message = b.message;
        this.priority = b.priority;
        this.sound = b.sound;
        this.title = b.title;

    }
    public String toString(){
        return "Tiêu đề là: '"+this.title+"', nội dung: '"+this.message+"', biểu tượng: '"+this.icon+"', âm thanh: '"+this.sound+"', độ ưu tiên: '"+this.priority+"', nút hành động: '"+this.actionButtons+"'.";
    }
    public static class NotificationBuilder{
        private String title,message,icon,sound,priority,actionButtons;
        public NotificationBuilder buildTitle(String title){
            this.title=title;
            return this;
        }
        public NotificationBuilder buildMessage(String message){
            this.message=message;
            return this;
        }
        public NotificationBuilder buildIcon(String icon){
            this.icon=icon;
            return this;
        }
        public NotificationBuilder buildSound(String sound){
            this.sound=sound;
            return this;
        }
        public NotificationBuilder buildPriority(String priority){
            this.priority=priority;
            return this;
        }
        public NotificationBuilder buildActionButtons(String actionButtons){
            this.actionButtons=actionButtons;
            return this;
        }
        public Notification build(){
            return new Notification(this);
        }
    }
}

