package lotteries;

abstract public class Lottery {

    abstract public int getId();
    abstract public String getName();

    private int mBaseBonus;
    private String mBetcontent;


    public Lottery(int baseBonus) {
        mBaseBonus = baseBonus;
        mBetcontent = "";
    }

    public Lottery(int baseBonus, String betcontent) {
        this(baseBonus);
        mBetcontent = betcontent;
    }

    public void setBaseBonus(int baseBonus) {
        mBaseBonus = baseBonus;
    }

    public String getBetcontent() {
        return mBetcontent;
    }

    public void setBetcontent(String betcontent) {
        mBetcontent = betcontent;
    }

    public int getBonus() {
        return mBaseBonus;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(getName() + " id = " + getId() + "\n");
        stringBuilder.append("baseBonus = " + mBaseBonus + "\n");
        stringBuilder.append("bonus = " + getBonus() + "\n");
        stringBuilder.append("betcontent = " + mBetcontent + "\n");


        return stringBuilder.toString();
    }
}
