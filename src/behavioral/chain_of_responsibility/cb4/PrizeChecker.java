package behavioral.chain_of_responsibility.cb4;

public abstract class PrizeChecker {
    protected PrizeChecker nextChecker;
    public PrizeChecker setNextChecker(PrizeChecker nextChecker){
        this.nextChecker = nextChecker;
        return this.nextChecker;
    }
    public abstract void checkTicket(String tickerNumber);
}
