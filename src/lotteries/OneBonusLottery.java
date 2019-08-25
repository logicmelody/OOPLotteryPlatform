package lotteries;

public class OneBonusLottery extends Lottery {

    public OneBonusLottery(int id, String name, int baseBonus) {
        super(id, name, baseBonus);
    }

    public OneBonusLottery(int id, String name, int baseBonus, String betcontent) {
        super(id, name, baseBonus, betcontent);
    }
}
