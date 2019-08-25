package games.lotteries;

public class SuperLottery extends Lottery {

    public SuperLottery(int baseBonus) {
        super(baseBonus);
    }

    public SuperLottery(int baseBonus, String betcontent) {
        super(baseBonus, betcontent);
    }

    public void setEvenBetcontent() {
        mBetcontent = "02468";
    }

    public void setOddBetcontent() {
        mBetcontent = "13579";
    }

    @Override
    public int getId() {
        return 90;
    }

    @Override
    public String getName() {
        return "超級彩";
    }

    @Override
    public int getBonus() {
        if (mBetcontent.length() <= 0) {
            return 0;
        }

        int bonus = 0;

        for (int i = 0 ; i < mBetcontent.length() ; i++) {
            bonus += Character.getNumericValue(mBetcontent.charAt(i));
        }

        return bonus;
    }

    @Override
    public String getDisplayText() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(getName() + " id = " + getId() + "\n");
        stringBuilder.append("bonus = " + getBonus() + "\n");
        stringBuilder.append("betcontent = ");

        for (int i = 0 ; i < mBetcontent.length() ; i++) {
            stringBuilder.append("[ " + mBetcontent.charAt(i) + " ], ");
        }

        stringBuilder.append("\n");

        return stringBuilder.toString();
    }
}
