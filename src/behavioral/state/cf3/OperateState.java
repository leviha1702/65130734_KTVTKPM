package behavioral.state.cf3;

public class OperateState implements CalculatorState{
    @Override
    public boolean operateHandle(Calculator calculator) {
        float kq=0;
        switch (calculator.operate){
            case "+":kq=calculator.input1+calculator.input2;break;
            case "-":kq=calculator.input1-calculator.input2;break;
            case "*":kq=calculator.input1*calculator.input2;break;
            case "/":
                if(calculator.input2 == 0){
                    System.out.println("Không thể chia cho 0");
                    calculator.setState(new InputState1());
                    return true;
                }
                kq = (float) calculator.input1 / calculator.input2;
                break;
            default: kq=0;
        }
        System.out.println(calculator.input1+" "+calculator.operate+" "+calculator.input2 + " = "+kq);
        calculator.setState(new InputState1());
        return true;
    }
}
