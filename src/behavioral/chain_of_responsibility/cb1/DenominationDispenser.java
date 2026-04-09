package behavioral.chain_of_responsibility.cb1;

public class DenominationDispenser extends MoneyDespenser{
    private  int denomination;

    public DenominationDispenser(int denomination) {
        this.denomination = denomination;
    }

    @Override
    public void dispense(int amount) {
        if(amount >= denomination){
            int count = amount / denomination;
            int remainder = amount%denomination;
            System.out.println("- "+count+" to menh gia "+denomination);
            if (remainder != 0 && nexDispenser !=null){
                nexDispenser.dispense(remainder);
            } else if (remainder!=0){
                System.out.println("loi: khong the chi tra so tien tren: "+remainder);
            }
        } else if (nexDispenser != null){
            nexDispenser.dispense(amount);
        }

    }
}
