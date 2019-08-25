package games.lotteries;

public class TwoBonusLottery extends Lottery {

    public TwoBonusLottery(int baseBonus) {
        super(baseBonus);
    }

    public TwoBonusLottery(int baseBonus, String betcontent) {
        super(baseBonus, betcontent);
    }

    @Override
    public int getId() {
        return 1;
    }

    @Override
    public String getName() {
        return "二倍彩";
    }

    @Override
    public int getBonus() {
        return super.getBonus() * 2;
    }
}
