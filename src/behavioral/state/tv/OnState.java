package behavioral.state.tv;

public class
OnState implements IRemoteState{
    @Override
    public void handle(RemoteControl remote) {
        System.out.println("TV đang mở :Tắt TV");
        remote.setState(new OffState());
    }
}
