/**
 * Created by Josh on 5/9/2016.
 */
public class NoPartyState implements LaneState{

    public void run(){

        //return gamefinished variable
        return false;
    }

    public boolean getGameStatus()
    {
        return false;
    }
}
