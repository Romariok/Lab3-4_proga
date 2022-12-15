package Objects;

import Others.State;

public class Screen extends Objects{
    public Screen (String name, Materials material, State state, PlanetaryGravity planetaryGravity){
        super(name, material, state, planetaryGravity);
    }

    public SizeOfGravityWaves wavesIntoLine(Telescope4 tls, Spaceship4 spc){
        return tls.getWaves(spc);
    }
    public SizeOfGravityWaves wavesIntoLine(Telescope4 tls, Meteorite mt){
        return tls.getWaves(mt);
    }

}
