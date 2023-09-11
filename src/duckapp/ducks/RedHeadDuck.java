package duckapp.ducks;

import duckapp.behaviors.FlyWithWings;
import duckapp.behaviors.Quack;
import duckapp.behaviors.SwimWithFeet;

public class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
        this.swimBehavior = new SwimWithFeet();
    }

    public void display() {
        System.out.println("I'm a Red-Head duck");
    }
}
