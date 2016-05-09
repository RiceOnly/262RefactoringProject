import java.util.*;

/**
 * Created by Josh on 5/9/2016.
 */
public class GameFinishedState implements LaneState{

    private Party party;
    private ScoreControl scoreController;

    public void run(){
        EndGamePrompt egp = new EndGamePrompt( party.Leader() );
        int result = egp.getResult();
        egp.distroy();
        egp = null;


        System.out.println("result was: " + result);

        // TODO: send record of scores to control desk
        if (result == 1) {					// yes, want to play again

            scoreController.resetScores( party, scores );
            gameFinished = false;
            frameNumber = 0;
            resetBowlerIterator();

        }
        else if (result == 2) {
            Vector printVector;
            EndGameReport egr = new EndGameReport(party.Leader(), party);
            printVector = egr.getResult();
            partyAssigned = false;
            Iterator scoreIt = party.getMembers().iterator();
            party = null;
            partyAssigned = false;

            publish();

            int myIndex = 0;
            while (scoreIt.hasNext()) {
                Bowler thisBowler = (Bowler) scoreIt.next();
                ScoreReport sr = scoreController.getScoreReport(thisBowler, finalScores[myIndex++], gameNumber);
                sr.sendEmail(thisBowler.getEmail());
                Iterator printIt = printVector.iterator();
                while (printIt.hasNext()) {
                    if (thisBowler.getNick() == (String) printIt.next()) {
                        System.out.println("Printing " + thisBowler.getNick());
                        sr.sendPrintout();
                    }
                }

            }
        }


        //return gamefinished variable
        return true;
    }

    public void setParameters( Party inParty, ScoreControl inScoreController)
    {
        party = inParty;
        scoreController = inScoreController;
    }

    public boolean getGameStatus()
    {
        return true;
    }
}
