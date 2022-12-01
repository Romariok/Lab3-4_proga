package Live;

import Others.State;
import java.util.concurrent.TimeUnit;
public class Spruts extends Human {
    public Spruts(String name, Mood mood, State state, String nativeLanguage){
        super(name, mood, state, nativeLanguage);
    }

    public String getCall(String themeOfCall){
        if (themeOfCall.equals("MOON")){
            setMood(Mood.ANGRY);
            setState(State.TALK);
            System.out.println(getName() +": Они хотят нам того самого сделать, АЛОО ПОЛИСМЕН СДЕЛАЙ ЧТО-НИБУДЬ!");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
            return "SPRUTS";

        }
        else{
            System.out.println(getName()+ ": Не звони мне больше! Мне не интересно что у вас происходит!");
            return "Не надо звноить комиссару, на это нет причин";
        }
    }

}
