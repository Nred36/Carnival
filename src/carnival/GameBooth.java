/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package carnival;

/**
 * GameBooth class.
 */
import java.util.Random;

public class GameBooth {

    private double cost;
    private String firstPrize, consolationPrize;
    private int numPrizes, numCPrizes;

    /**
     * constructor pre: none post: A GameBooth object created. The cost and
     * prizes are set.
     */
    public GameBooth(double charge, String p1, String p2) {
        cost = charge;
        firstPrize = p1;
        consolationPrize = p2;
    }

    /**
     * Game is played and prize awarded. pre: none post: Player had three tries.
     * Player successful all three times received the first prize. A consolation
     * prize has been awarded otherwise.
     */
    public String start() {
        int toss;
        int successes = 0;
        Random rand = new Random();

        /* play game */
        for (int i = 0; i < 3; i++) {	//player gets three tries
            toss = rand.nextInt(2);
            if (toss == 1) {
                successes += 1;			//a successful toss is equal to 1
            }
        }

        /* award prize */
        if (successes == 3) {
            numPrizes++;
            return (firstPrize);
        } else {
            numCPrizes++;
            return (consolationPrize);
        }
    }

    public String prizesAwarded() {
        return numPrizes + " first place prizes and " + numCPrizes + " consolation prizes.";
    }

    /**
     * Returns the cost to play the game. pre: none post: Cost of the game has
     * been returned.
     */
    public double getCost() {
        return (cost);
    }

}
