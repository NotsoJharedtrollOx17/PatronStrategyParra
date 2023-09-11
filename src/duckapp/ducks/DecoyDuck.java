package duckapp.ducks;

import duckapp.behaviors.FlyNoWay;
import duckapp.behaviors.Quack;
import duckapp.behaviors.SwimFloat;

public class DecoyDuck extends Duck {
    public DecoyDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Quack();
        this.swimBehavior = new SwimFloat();
    }

    public void display() {
        System.out.println("I'm a decoy duck");
    }
}
