package Objects;

import Live.Astronomers4;
import exceptions.inappropriateVelocity;
import Others.State;

import java.util.Random;

public class GravityLocator extends Objects{
    public GravityLocator (String name, Materials material, State state, PlanetaryGravity planetaryGravity){
        super(name, material, state, planetaryGravity);
    }

    public void checkVelocity(int[] a) throws inappropriateVelocity{
        if ((a[1] - a[0])/(a[2]*60) < 0 || (a[1] - a[0])/(a[2]*60)> 2400){
            throw new inappropriateVelocity();
        }
    }
    public int getVelocity(Meteorite mt){
        int[] a = mt.getCoordinates();
        checkVelocity(a);
        return (a[1] - a[0])/(a[2]*60);
    }
    public int getVelocity(Spaceship4 spc) {
        int[] a = spc.getCoordinates();
        checkVelocity(a);
        return (a[1] - a[0])/(a[2]*60);
    }
    public void getVolume(Spaceship4 spc, Astronomers4 ast){
        System.out.println(ast.getName()+": Volume of "+spc.getName()+ " is "+spc.getSize().toString());
    }
    public void getWeight(Spaceship4 spc, Astronomers4 ast){

        System.out.println(ast.getName()+": Weight of "+spc.getName()+" is "+Integer.toString(spc.getNumberOfPeople()*5+200));
    }

}
