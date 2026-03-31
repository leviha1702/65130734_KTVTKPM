package behavioral.state.tv;

public class OffState implements IRemoteState{
    @Override
    public void handle(RemoteControl remote) {
        System.out.println("TV đang tắt:Mở TV");
        remote.setState(new OnState());
    }
}
