package behavioral.state.tv;

public class RemoteControl {
    IRemoteState state;
    public RemoteControl(){
        state = new OffState();
    }
    public void powerPress(){
        state.handle( this);
    }
    public void setState(IRemoteState state){
        this.state = state;
    }
}
