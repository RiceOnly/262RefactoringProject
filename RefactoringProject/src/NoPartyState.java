/**
 * Created by Josh on 5/9/2016.
 */
public class NoPartyState implements LaneState{

    Lane lane;

    public void initiateState(Lane inLane)
    {
        lane = inLane;
    }

    public void run(){

    }
}
