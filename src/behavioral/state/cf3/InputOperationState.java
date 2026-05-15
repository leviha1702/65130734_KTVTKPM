package behavioral.state.cf3;

import java.util.Scanner;

public class InputOperationState implements CalculatorState{
    @Override
    public boolean operateHandle(Calculator calculator) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập toán tử: ");
        String s = scanner.nextLine();
        if (s.equals("q"))
            return false;
        calculator.operate = s;
        calculator.setState(new InputState2());
        return true;
    }
}
