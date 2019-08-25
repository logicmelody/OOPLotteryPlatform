package platforms;

import games.Game;

import java.util.ArrayList;
import java.util.List;

public class MJPlatform {

    private List<Game> mGames;


    public MJPlatform() {
        mGames = new ArrayList<>();
    }

    public void addGame(Game game) {
        mGames.add(game);
    }

    public void bet() {
        for (Game game : mGames) {
            System.out.println("=== Bet ===");
            System.out.println(game.getBetCode());
        }
    }
}
