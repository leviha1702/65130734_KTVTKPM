package behavioral.chain_of_responsibility.cb4;

public class StandardPrizeChecker extends PrizeChecker{
    private String prizeName;
    private String[] winningNumbers;
    public StandardPrizeChecker(String prizeName,String[] winningNumbers){
        this.prizeName = prizeName;
        this.winningNumbers = winningNumbers;
    }

    @Override
    public void checkTicket(String tickerNumber) {
        boolean isWon = false;
        for(String winningNumber : winningNumbers){
            if(tickerNumber.endsWith(winningNumber)){
                isWon = true;
                break;
            }
        }
        if (isWon){
            System.out.println("CHUC MUNG! Ve so ["+tickerNumber+"] da trung: "+prizeName);
        }
        else if(nextChecker !=null){
            nextChecker.checkTicket(tickerNumber);
        } else System.out.println("CHUC BAN MAY MAN LAN SAU!!");
    }
}
