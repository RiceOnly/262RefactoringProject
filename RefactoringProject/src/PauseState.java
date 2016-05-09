

/**
 * Created by Josh on 5/9/2016.
 */
public class PauseState implements LaneState {

    public void run() {

        try {
            java.lang.Thread.sleep(10);
        } catch (Exception e) {}

        //return gamefinished variable
        return false;
    }

    public boolean getGameStatus()
    {
        return false;
    }
}
