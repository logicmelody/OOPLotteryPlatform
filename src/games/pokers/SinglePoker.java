package games.pokers;

import games.Game;

public class SinglePoker implements Game {

    private String mBetcontent;


    public SinglePoker(String betcontent) {
        mBetcontent = betcontent;
    }

    @Override
    public int getId() {
        return 100;
    }

    @Override
    public String getBetCode() {
        return getId() + "_" + mBetcontent;
    }
}
