package W04;

public class W04L04 {
    public static void main(String[] args) {
        int player1Dice1 = (int) (Math.random() * 6) + 1;
        int player1Dice2 = (int) (Math.random() * 6) + 1;
        int player2Dice1 = (int) (Math.random() * 6) + 1;
        int player2Dice2 = (int) (Math.random() * 6) + 1;

        int score1 = player1Dice1 + player1Dice2;
        int score2 = player2Dice1 + player2Dice2;

        System.out.println("Player 1 rolls: " + player1Dice1 + " and " + player1Dice2);
        System.out.println("Player 1 score: " + score1);

        System.out.println("Player 2 rolls: " + player2Dice1 + " and " + player2Dice2);
        System.out.println("Player 2 score: " + score2);

        if (score1 > score2) {
            System.out.println("Player 1 wins!");
        } else if (score2 > score1) {
            System.out.println("Player 2 wins!");
        } else {
            System.out.println("It's a tie!");
        }
    }
}
