// * clases concretas solicitadas de Duck
package duckapp.ducks;

import duckapp.behaviors.FlyWithWings;
import duckapp.behaviors.Quack;
import duckapp.behaviors.SwimWithFeet;

public class MallardDuck extends Duck {
    public MallardDuck() {
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
        this.swimBehaviour = new SwimWithFeet();
    }

    public void display() {
        System.out.println("I'm a Mallard duck");
    }
}