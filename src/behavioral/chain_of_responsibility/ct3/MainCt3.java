package behavioral.chain_of_responsibility.ct3;

public class MainCt3 {
    static void main(String[] args) {
        ElectricityCalculator tier1 = new TierCalculator(50,1806,"Bac 1 (0-50 kWh)");
        ElectricityCalculator tier2 = new TierCalculator(50,1866,"Bac 2 (51-100 kWh)");
        ElectricityCalculator tier3 = new TierCalculator(100,2167,"Bac 3 (101-200 kWh)");
        ElectricityCalculator tier4 = new TierCalculator(100,2729,"Bac 4 (201-300 kWh)");
        ElectricityCalculator tier5 = new TierCalculator(100,3050,"Bac 5 (301-400 kWh)");
        ElectricityCalculator tier6 = new TierCalculator(Integer.MAX_VALUE,3151,"Bac 6 (401 kWh tro len)");
        tier1.setNextCalculator(tier2)
                .setNextCalculator(tier3)
                .setNextCalculator(tier4)
                .setNextCalculator(tier5)
                .setNextCalculator(tier6);
        printHomeBill(tier1,46);
        printHomeBill(tier1,130);
        printHomeBill(tier1,400);
    }
    private static void printHomeBill(ElectricityCalculator chainHead,int kWh){
        System.out.println("--Hoa don cho gia dinh dung: "+kWh+" kWh----");
        double totalBill = chainHead.calculateBill(kWh);
        System.out.println("==> TONG TIEN: "+totalBill+ "VNĐ");
    }
}
