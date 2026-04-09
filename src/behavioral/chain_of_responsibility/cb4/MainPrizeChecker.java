package behavioral.chain_of_responsibility.cb4;

public class MainPrizeChecker {
    static void main(String[] args) {
        String specialWinningNum = "123456";
        PrizeChecker specialPrize = new StandardPrizeChecker("Giai dac biet",new String[]{specialWinningNum});
        PrizeChecker consolationPrize = new ConsolationPrizeChecker(specialWinningNum);
        PrizeChecker firstPrize = new StandardPrizeChecker("Giai nhat",new String[]{"3456"});
        PrizeChecker secondPrize = new StandardPrizeChecker("Giai nhi",new String[]{"678","910"});
        specialPrize.setNextChecker(consolationPrize).setNextChecker(firstPrize).setNextChecker(secondPrize);
        System.out.println("---HE THONG DO VE SO---");
        specialPrize.checkTicket("123456");
        specialPrize.checkTicket("456789");
        specialPrize.checkTicket("324910");

    }
}
