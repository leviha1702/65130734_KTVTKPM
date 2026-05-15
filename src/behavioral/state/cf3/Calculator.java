package behavioral.state.cf3;

public class Calculator {
    int input1, input2;
    String operate;
    CalculatorState state;

    public void setState(CalculatorState state) {
        this.state = state;
    }

    public boolean operate(){
        return state.operateHandle(this);
    }
}
