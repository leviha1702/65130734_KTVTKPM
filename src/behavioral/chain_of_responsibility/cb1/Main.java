package behavioral.chain_of_responsibility.cb1;

public class Main {
    static void main(String[] args) {
        int amountToWithdraw=293;
        System.out.println("--Cau a: Rut tien binh thuong "+"Mac dinh menh gia lon nhat la 500)--");
        MoneyDespenser defaulChain = ATM_Machine.getDispenserChain(500);
        defaulChain.dispense(amountToWithdraw);
        System.out.println("--Cau b: Rut tien binh thuong "+"Mac dinh menh gia lon nhat la 50)--");
        MoneyDespenser customChain = ATM_Machine.getDispenserChain(50);
        customChain.dispense(amountToWithdraw);
    }
}
