package behavioral.chain_of_responsibility.cb1;

public class ATM_Machine {
    public static MoneyDespenser getDispenserChain (int maxDenomination){
        int[] availableDenominations = {500,100,50,10,1};
        MoneyDespenser headOfChain = null;
        MoneyDespenser currentDispenser = null;
        for(int denom : availableDenominations){
            if(denom<=maxDenomination){
                MoneyDespenser newDispenser = new DenominationDispenser(denom);
                if (headOfChain == null){
                    headOfChain = newDispenser;
                    currentDispenser = headOfChain;
                } else {
                    currentDispenser.setNexDispenser(newDispenser);
                    currentDispenser = newDispenser;
                }
            }
        }
        return headOfChain;
    }
}
