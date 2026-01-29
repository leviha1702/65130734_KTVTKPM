package creational.builder.computer.cntt65;

public class MainComputer {
    public static void main(String[] args) {
        Computer652 computer = new Computer652.Builder().
                buildCPU("Intel ultra i9 2026").
                buildRAM("64GB DDR6 8200 MHz").
                buildScreen("8K 24 inches LG").
                buildStorage("5TB NvME").
                build();
        System.out.println(computer.toString());

    }
}
