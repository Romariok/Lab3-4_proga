package Live;
import Others.State;
import Objects.*;

public class Astronomers extends Human {
    public Astronomers(String name, Mood mood, State state, String nativeLanguage){
        super(name, mood, state, nativeLanguage);
    }
    public boolean checkObj(Spaceship spc){
        if (spc.getState()==State.FLY) return true;
        else {
            return false;
        }
    }
    public boolean checkMultiplicityAndUsing(Telescope tls){
        if (tls.getState()==State.USE && tls.getMultiplicity() >=8) return true;
        else {
            return false;
        }
    }

    public String getDestination(Spaceship spc, Telescope tls){
        if (checkObj(spc) && checkMultiplicityAndUsing(tls)){
            int[] a = spc.getCoordinates();
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
        else{
            if (!checkMultiplicityAndUsing(tls)){
                System.out.println(getName() + ": Возьми другой телескоп!");
            }
            else{
                if (!checkObj(spc)){
                    System.out.println(getName() + ": Там ничего нет, что ты хочешь просмотреть?");
                }
            }

            return "";
        }

    }




}
