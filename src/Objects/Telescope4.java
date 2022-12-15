package Objects;

import Others.State;

public class Telescope4 extends Telescope{
    private Angles Angles;
    public Telescope4(String name, Materials material, State state, PlanetaryGravity planetaryGravity, int multiplicity, Angles angles){
        super(name, material, state, planetaryGravity, multiplicity);
        this.Angles = angles;
    }

    public enum Angles{
        CENTER("center"),
        LEFT("left"),
        RIGHT("right"),
        UP("up"),
        DOWN("down");
        private final String name;
        Angles(String name) {
            this.name = name;
        }
        @Override
        public String toString() {
            return this.name;
        }
    }
    public Angles getAngles(){
        return this.Angles;
    }
    public SizeOfGravityWaves getWaves(Meteorite mt){
        return mt.getSize();
    }
    public SizeOfGravityWaves getWaves(Spaceship4 spc){
        return spc.getSize();
    }


}
