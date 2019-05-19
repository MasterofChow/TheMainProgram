//Max Chow
//Creates bots for KnightsoftheRealm

import java.util.*;

public class KnightsoftheRealmCreator {
    private int botHealth;

    public void setBotHealth(int Health) {
        botHealth = Health;
    }

    public int getBotHealth() {return botHealth; }

    private String botName;

    public void setBotName(String Name) {botName = Name; }

    public String getBotName() {return botName;}

    private int playerHealth;

    public void setPlayerHealth (int lives) {
        playerHealth = lives;
    }

    public int getPlayerHealth () {return playerHealth; }
}
