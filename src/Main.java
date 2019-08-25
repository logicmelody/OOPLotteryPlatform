import lotteries.OneBonusLottery;
import lotteries.TwoBonusLottery;

public class Main {

    public static void main(String[] args) {
        OneBonusLottery oneBonusLottery = new OneBonusLottery(1);
        TwoBonusLottery twoBonusLottery = new TwoBonusLottery(1);

        System.out.println(oneBonusLottery.toString());
        System.out.println(twoBonusLottery.toString());
    }
}
