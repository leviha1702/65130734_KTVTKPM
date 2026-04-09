package behavioral.chain_of_responsibility.cb4;

public class ConsolationPrizeChecker extends PrizeChecker{
    private String specialPrizeNumber;

    public ConsolationPrizeChecker(String specialPrizeNumber) {
        this.specialPrizeNumber = specialPrizeNumber;
    }

    @Override
    public void checkTicket(String tickerNumber) {
        String last5OfSpecial = specialPrizeNumber.substring(1);
        if(!tickerNumber.equals(specialPrizeNumber)&&tickerNumber.endsWith(last5OfSpecial)){
            System.out.println("CHUC MUNG! Ve so ["+tickerNumber+"] da trung: Giai khuyen khich!");
        } else if (nextChecker!=null){
            nextChecker.checkTicket(tickerNumber);
        }
    }
}
