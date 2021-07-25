package bai_8_clean_code_va_refactoring.bai_tap.refactoring;

public class TennisGame {

    public static String getScore(String player1Name, String player2Name, int firstPlayer, int secondPlayer) {
        String score = "";
        if (firstPlayer==secondPlayer) {
            score = getScore1(firstPlayer);
        } else if (firstPlayer>=4 || secondPlayer>=4) {
            score = getMinResult(firstPlayer, secondPlayer);
        } else {
            score = getCheckTempScore(firstPlayer, secondPlayer, score);
        }
        return score;
    }

    private static String getMinResult(int firstPlayer, int secondPlayer) {
        String score;
        int minusResult = firstPlayer-secondPlayer;
        if (minusResult==1) score ="Advantage player1";
        else if (minusResult ==-1) score ="Advantage player2";
        else if (minusResult>=2) score = "Win for player1";
        else score ="Win for player2";
        return score;
    }

    private static String getCheckTempScore(int firstPlayer, int secondPlayer, String score) {
        int tempScore;
        for (int i = 1; i<3; i++)
        {
            if (i==1) tempScore = firstPlayer;
            else { score+="-"; tempScore = secondPlayer;}
            switch(tempScore)
            {
                case 0:
                    score+="Love";
                    break;
                case 1:
                    score+="Fifteen";
                    break;
                case 2:
                    score+="Thirty";
                    break;
                case 3:
                    score+="Forty";
                    break;
            }
        }
        return score;
    }

    private static String getScore1(int firstPlayer) {
        String score;
        switch (firstPlayer)
        {
            case 0:
                score = "Love-All";
                break;
            case 1:
                score = "Fifteen-All";
                break;
            case 2:
                score = "Thirty-All";
                break;
            case 3:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;
        }
        return score;
    }
}



