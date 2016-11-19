package example;

import static java.lang.Math.abs;

public class Tennis {
    private static final String[] SCORE = new String[]{"LOVE", "FIFTEEN", "THIRTY", "FORTY"};
    private static final String[] OTHER = new String[]{"DEUCE", "ADVANTAGE", "WIN", "WIN", "WIN"};

    public String score(int playerA, int playerB) {
        if (playerA == playerB) {
            if (playerA <= 2) {
                return SCORE[playerA] + " ALL";
            }
            return OTHER[playerA - playerB];
        }

        if (playerA <= 3 && playerB <= 3) {
            return SCORE[playerA] + " " + SCORE[playerB];
        }

        return (playerA > playerB ? "A" : "B") + " " + OTHER[abs(playerA - playerB)];
    }
}
