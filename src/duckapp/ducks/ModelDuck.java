package duckapp.ducks;

import duckapp.behaviors.FlyNoWay;
import duckapp.behaviors.Mute;
import duckapp.behaviors.SwimNoWay;

public class ModelDuck extends Duck {
    public ModelDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Mute();
        this.swimBehavior = new SwimNoWay();
    }
    
    public void display() {
        System.out.println("I'm a model duck");
    }
}
