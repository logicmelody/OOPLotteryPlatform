package lotteries;

public class Lottery {

    private int mId;
    private String mName;
    private int mBaseBonus;
    private String mBetcontent;


    public Lottery(int id, String name, int baseBonus) {
        mId = id;
        mName = name;
        mBaseBonus = baseBonus;
        mBetcontent = "";
    }

    public Lottery(int id, String name, int baseBonus, String betcontent) {
        this(id, name, baseBonus);
        mBetcontent = betcontent;
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public int getBonus() {
        return mBaseBonus;
    }

    public void setBonus(int bonus) {
        mBaseBonus = bonus;
    }

    public String getBetcontent() {
        return mBetcontent;
    }

    public void setBetcontent(String betcontent) {
        mBetcontent = betcontent;
    }

    @Override
    public String toString() {
        return "Lottery{" +
                "id=" + mId +
                ", name='" + mName + '\'' +
                ", baseBonus=" + mBaseBonus +
                ", betcontent='" + mBetcontent + '\'' +
                '}';
    }
}
