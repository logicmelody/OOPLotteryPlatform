package games.lotteries;

public class OneBonusLottery extends Lottery {

    public OneBonusLottery(int baseBonus) {
        super(baseBonus);
    }

    public OneBonusLottery(int baseBonus, String betcontent) {
        super(baseBonus, betcontent);
    }

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public String getName() {
        return "一倍彩";
    }
}
