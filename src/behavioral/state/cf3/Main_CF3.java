package behavioral.state.cf3;

public class Main_CF3 {
    static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setState(new InputState1());

        while(true){
            boolean check = calculator.operate();
            if(!check) break;
        }
    }

}
