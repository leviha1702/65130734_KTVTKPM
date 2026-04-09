package behavioral.chain_of_responsibility.ct3;

public abstract class ElectricityCalculator {
    protected ElectricityCalculator nextCalculator;
    public ElectricityCalculator setNextCalculator(ElectricityCalculator nextCalculator){
        this.nextCalculator =nextCalculator;
        return this.nextCalculator;
    }
    public abstract double calculateBill(int kwh);
}
