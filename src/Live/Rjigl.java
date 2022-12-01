package Live;
import Others.State;

import java.util.concurrent.TimeUnit;

public class Rjigl extends Policeman{
    public Rjigl(String name, Mood mood, State state, String nativeLanguage) {
        super(name, mood, state, nativeLanguage);
    }

    public void getCall(String themeOfCall){
        if (themeOfCall.equals("SPRUTS")){
            setState(State.LISTEN);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
            setState(State.TALK);
            System.out.println(getName() + ": Дайте всю информацию об этом объекте");
        }
        else{
            System.out.println(getName() + ": Ничего не произошло!");
        }
    }
}
