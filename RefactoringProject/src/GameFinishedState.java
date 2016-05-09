import java.util.*;

/**
 * Created by Josh on 5/9/2016.
 */
public class GameFinishedState implements LaneState{

    private Lane lane;

    public void initiateState(Lane inLane)
    {
        lane = inLane;
    }

    public void run(){

        lane.finishGame();
    }
}
