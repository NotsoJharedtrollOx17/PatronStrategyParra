package duckapp.ducks;

import duckapp.behaviors.FlyNoWay;
import duckapp.behaviors.Squeak;
import duckapp.behaviors.SwimFloat;

public class RubberDuck extends Duck {
    public RubberDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Squeak();
        this.swimBehavior = new SwimFloat();
    }
    
    public void display() {
        System.out.println("I'm a rubber duck");
    }
}
