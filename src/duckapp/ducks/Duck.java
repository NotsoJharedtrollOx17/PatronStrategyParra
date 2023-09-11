package duckapp.ducks;

import duckapp.behaviors.FlyBehavior;
import duckapp.behaviors.QuackBehavior;
import duckapp.behaviors.SwimBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    SwimBehaviour swimBehaviour;

    public Duck() { }
    
    public abstract void display();
    
    public void performFly() {
        flyBehavior.fly();
    }
    
    public void performQuack() {
        quackBehavior.quack();
    }

    public void performSwim(){
        swimBehaviour.swim();
    }

    public void setFlyBehavior(FlyBehavior fb) {
        this.flyBehavior = fb;
    }
    
    public void setQuackBehavior(QuackBehavior qb) {
        this.quackBehavior = qb;
    }

    public void setSwimBehavior(SwimBehaviour sb) {
        this.swimBehaviour = sb;
    }
}