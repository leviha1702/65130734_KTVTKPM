package behavioral.state.cf3;

import java.util.Scanner;

public class InputState2 implements CalculatorState{
    @Override
    public boolean operateHandle(Calculator calculator) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số thứ hai: ");
        String s = scanner.nextLine();
        if (s.equals("q"))
            return false;
        calculator.input2 = Integer.parseInt(s);
        calculator.setState(new OperateState());
        return true;
    }
}
