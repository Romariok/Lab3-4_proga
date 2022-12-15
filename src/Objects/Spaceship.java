package Objects;

import Others.State;

public class Spaceship extends Objects{
    private final int x_now;
    private final int x_SomeminAgo;
    private final int Minute;
    public Spaceship(String name, Materials material, State state, PlanetaryGravity planetaryGravity, int minute, int x_someminAgo, int x_now){
        super(name, material, state, planetaryGravity);
        this.x_now = x_now;
        this.x_SomeminAgo = x_someminAgo;
        this.Minute = minute;
    }

    public int[] getCoordinates(){
        int[] coordinates = {this.x_SomeminAgo, this.x_now, this.Minute};
        return coordinates;
    }

    @Override
    public int hashCode() {
        return this.getCoordinates().hashCode() + getMaterial().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        return obj instanceof Spaceship && this.hashCode() == obj.hashCode();
    }
}
