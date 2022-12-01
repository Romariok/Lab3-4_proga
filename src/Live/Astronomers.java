package Live;
import Others.State;

public class Astronomers extends Human {
    public Astronomers(String name, Mood mood, State state, String nativeLanguage){
        super(name, mood, state, nativeLanguage);
    }
    public String getDestination(int[] a){
        int Velocity = (a[1] - a[0])/(10*60);

        if (Velocity >1600){
            setMood(Mood.PANIC);
            setState(State.REPORT);
            return "MOON";
        }
        else
        {
            setMood(Mood.CALM);
            return "Something else";
        }
    }




}
