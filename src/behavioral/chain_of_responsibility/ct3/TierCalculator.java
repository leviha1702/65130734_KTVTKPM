package behavioral.chain_of_responsibility.ct3;

public class TierCalculator extends ElectricityCalculator {
    private String tierName;
    private int capacity;
    private double price;

    public TierCalculator(int capacity, double price, String tierName) {
        this.capacity = capacity;
        this.price = price;
        this.tierName = tierName;
    }

    @Override
    public double calculateBill(int kWh) {
        if(kWh<0) return 0;
        int kWhToProcess = Math.min(kWh,capacity);
        double cost = kWhToProcess *price;
        System.out.println("-" +tierName+" tinh tien "+kWhToProcess+" kWh x "+price+" = "+cost+" VNĐ");
        int remainKWh = kWh - kWhToProcess;
        if(remainKWh>0 && nextCalculator !=null){
            cost = cost+nextCalculator.calculateBill(remainKWh);
        }
        return cost;
    }
}
