import java.util.Scanner;

// * respecto al comportamiento de vuelo
public interface FlyBehavior {
    public void fly();
}

public class FlyWithWings implements FlyBehavior {
    public void fly() {
        System.out.println("I'm flying with my wings!");
    }
}

public class FlyWithRockets implements FlyBehavior {
    public void fly() {
        System.out.println("I'm flying with rockets!");
    }
}

public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I can't fly");
    }
}

// * respecto al comportamiento de graznido
public interface QuackBehavior {
    public void quack();
}

public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("Quack");
    }
}

public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("Squeak");
    }
}

public class Mute implements QuackBehavior {
    public void quack() {
        System.out.println("<< Silence >>");
    }
}

// * respecto al comportamiento de nadar
public interface SwimBehaviour {
    public void swim();
}

public class SwimWithFeet implements SwimBehaviour {
    public void swim() {
        System.out.println("I'm swimming in the water!");
    }
}

public class SwimFloat implements SwimBehaviour {
    public void swim() {
        System.out.println("I'm floating over the water!");
    }
}

public class SwimNoWay implements SwimBehaviour{
    public void swim() {
        System.out.println("I can't swim");
    }
}

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

// * clases concretas solicitadas de Duck
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

public class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
        this.swimBehaviour = new SwimWithFeet();
    }

    public void display() {
        System.out.println("I'm a Red-Head duck");
    }
}

public class DecoyDuck extends Duck {
    public DecoyDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Quack();
        this.swimBehaviour = new SwimFloat();
    }

    public void display() {
        System.out.println("I'm a decoy duck");
    }
}

public class ModelDuck extends Duck {
    public ModelDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Mute();
        this.swimBehaviour = new SwimNoWay();
    }
    
    public void display() {
        System.out.println("I'm a model duck");
    }
}

public class RubberDuck extends Duck {
    public RubberDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Squeak();
        this.swimBehaviour = new SwimFloat();
    }
    
    public void display() {
        System.out.println("I'm a rubber duck");
    }
}

public class Main {
    public static void main(String[] args) {
        // * implementaciones concretas en forma de objetos
        Duck mallardDuck = new MallardDuck();
        Duck redheadDuck = new RedHeadDuck();
        Duck decoyDuck = new DecoyDuck();
        Duck modelDuck = new ModelDuck();
        Duck rubberDuck = new RubberDuck();

        MenuDuckTypes(mallardDuck, redheadDuck, decoyDuck, modelDuck, rubberDuck);
    }

    private static void MenuDuckTypes(
        Duck mallardDuck, 
        Duck redheadDuck,
        Duck decoyDuck,
        Duck modelDuck,
        Duck rubberDuck) {
        while (true) {
            System.out.println("\nSelecciona un pato:");
            System.out.println("1. Mallard Duck");
            System.out.println("2. Redhead Duck");
            System.out.println("3. Decoy Duck");
            System.out.println("4. Model Duck");
            System.out.println("5. Rubber Duck");
            System.out.println("6. Salir");

            int choice = Scanner.nextInt();

            switch (choice) {
                case 1:
                    MenuBehaviorTypes(mallardDuck);
                    break;
                case 2:
                    MenuBehaviorTypes(redheadDuck);
                    break;
                case 3:
                    MenuBehaviorTypes(decoyDuck);
                    break;
                case 4:
                    MenuBehaviorTypes(modelDuck);
                    break;
                case 5:
                    MenuBehaviorTypes(rubberDuck);
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                    break;
            }
        } 
    }

    private static void MenuBehaviorTypes(Duck duck) {
        duck.display();

        while (true) {
            System.out.println("\nSelecciona una acción:");
            System.out.println("1. Cambiar comportamiento de vuelo");
            System.out.println("2. Cambiar comportamiento de graznido");
            System.out.println("3. Cambiar comportamiento de natación");
            System.out.println("4. Volver al menú anterior");

            int action = scanner.nextInt();

            switch (action) {
                case 1:
                    MenuChangeFlyBehavior(duck);
                    break;
                case 2:
                    MenuChangeQuackBehavior(duck);
                    break;
                case 3:
                    MenuChangeSwimBehavior(duck);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                    break;
            }
        }
    }

    private static void MenuChangeFlyBehavior(Duck duck) {
        duck.performFly();

        while(true) {
            System.out.println("Selecciona un nuevo comportamiento para Volar:");
            System.out.println("1. Volar con alas");
            System.out.println("2. Volar con cohetes");
            System.out.println("3. No volar");

            int choice = new Scanner(System.in).nextInt();

            switch(choice) {
                    case 1:
                        duck.setFlyBehavior(new FlyWithWings());
                        duck.performFly();
                        break;
                    case 2:
                        duck.setFlyBehavior(new FlyWithRockets());
                        duck.performFly();
                        break;
                    case 3:
                        duck.setFlyBehavior(new FlyNoWay());
                        duck.performFly();
                        break;
                    default:
                        System.out.println("Opción no válida. Inténtalo de nuevo.");
                        break;
            }
        }
    }

    private static void MenuChangeQuackBehavior(Duck duck) {
        duck.performQuack();

        while(true) {
            System.out.println("Selecciona un nuevo comportamiento para Graznar:");
            System.out.println("1. Graznar");
            System.out.println("2. Chillar");
            System.out.println("3. Sin sonido");

            int choice = new Scanner(System.in).nextInt();

            switch(choice) {
                    case 1:
                        duck.setQuackBehavior(new Quack());
                        duck.performQuack();
                        break;
                    case 2:
                        duck.setQuackBehavior(new Squeak());
                        duck.performQuack();
                        break;
                    case 3:
                        duck.setQuackBehavior(new Mute());
                        duck.performQuack();
                        break;
                    default:
                        System.out.println("Opción no válida. Inténtalo de nuevo.");
                        break;
            }
        }
    }

    private static void MenuChangeSwimBehavior(Duck duck) {
        duck.performSwim();

        while(true) {
            System.out.println("Selecciona un nuevo comportamiento para Nadar:");
            System.out.println("1. Nadar");
            System.out.println("2. Flotar");
            System.out.println("3. No nadar");

            int choice = new Scanner(System.in).nextInt();

            switch(choice) {
                    case 1:
                        duck.setSwimBehavior(new SwimWithFeet());
                        duck.performSwim();
                        break;
                    case 2:
                        duck.setSwimBehavior(new SwimFloat());
                        duck.performSwim();
                        break;
                    case 3:
                        duck.setSwimBehavior(new SwimNoWay());
                        duck.performSwim();
                        break;
                    default:
                        System.out.println("Opción no válida. Inténtalo de nuevo.");
                        break;
            }
        }
    }
}