package behavioral.chain_of_responsibility.cb1;

public abstract class MoneyDespenser {
    protected MoneyDespenser nexDispenser;
    public void setNexDispenser (MoneyDespenser nexDispenser){
        this.nexDispenser = nexDispenser;

    }
    public abstract void dispense(int amount);
}
