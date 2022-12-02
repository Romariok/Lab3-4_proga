package Objects;

import Others.State;

public class Spaceship extends Objects{
    public int x_now;
    public int x_10minAgo;
    public Spaceship(String name, Materials material, State state, int x_10minAgo, int x_now){
        super(name, material, state);
        this.x_now = x_now;
        this.x_10minAgo = x_10minAgo;
    }
    public Spaceship(String name, Materials material, State state){
        super(name, material, state);

    }
    public int[] getCoordinates(){
        int[] coordinates = {x_10minAgo, x_now};
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
