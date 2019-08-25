import lotteries.OneBonusLottery;
import lotteries.SuperLottery;
import lotteries.TwoBonusLottery;

public class Main {

    public static void main(String[] args) {
        OneBonusLottery oneBonusLottery = new OneBonusLottery(1, "12345");
        TwoBonusLottery twoBonusLottery = new TwoBonusLottery(1, "12345");
        SuperLottery superLottery = new SuperLottery(1, "12345");
        System.out.println(oneBonusLottery.getDisplayText());
        System.out.println(twoBonusLottery.getDisplayText());
        System.out.println(superLottery.getDisplayText());

        superLottery.setBetcontent("9853");
        System.out.println(superLottery.getDisplayText());

        superLottery.setEvenBetcontent();
        System.out.println(superLottery.getDisplayText());

        superLottery.setOddBetcontent();
        System.out.println(superLottery.getDisplayText());
    }
}
