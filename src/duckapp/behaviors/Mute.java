package duckapp.behaviors;

public class Mute implements QuackBehavior {
    public void quack() {
        System.out.println("<< Silence >>");
    }
}