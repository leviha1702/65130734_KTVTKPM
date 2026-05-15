package behavioral.state.cf3;

import java.util.Scanner;

public class InputState1 implements CalculatorState{
    @Override
    public boolean operateHandle(Calculator calculator) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số thứ nhất: ");
        String s = scanner.nextLine();
        if (s.equals("q"))
            return false;
        calculator.input1 = Integer.parseInt(s);
        calculator.setState(new InputOperationState());
        return true;
    }
}
