package Live;

import Others.State;
import java.util.concurrent.TimeUnit;

public class Policeman extends Human{
    public Policeman(String name, Mood mood, State state, String nativeLanguage){
        super(name, mood, state, nativeLanguage);
    }

    public void caughtCriminal(){
        System.out.println(getName() + "Я поймал преступника!");
    }
    public void patrolling(){
        setState(State.WALK);
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }
        setState(State.STAND);
    }

}
