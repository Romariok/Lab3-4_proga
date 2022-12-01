import Live.*;
import Objects.*;
import Others.State;

public class Main {
    public static void main(String[] args) {
        Astronomers astronomers = new Astronomers("Астрономы", Mood.CONCENTRATED, State.OBSERVE, "moonLanguage");
        Spaceship spaceship = new Spaceship("кораблик", Materials.METAL, State.FLY, 1, 1000000);
        Spruts spruts = new Spruts("Спрутс", Mood.HAPPY, State.SIT, "moonLanguage");
        Rjigl rjigl = new Rjigl("Комиссар Ржигль", Mood.CALM, State.WALK, "moonLanguage");
        rjigl.getCall(spruts.getCall(astronomers.getDestination(spaceship.getCoordinates())));

        }

    }
