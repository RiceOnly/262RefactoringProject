/**
 * Created by Josh on 5/9/2016.
 */
public class GameRunState implements LaneState {

    Lane lane;

    public void initiateState(Lane inLane)
    {
        lane = inLane;
        run();
    }

    public void run() {
        lane.runGame();
    }
}
