package pl.basics9.gui.cw.cw01;

import java.util.Arrays;

public class Main {
    public static void main (String args[]){
        Hero h1 = new Hero ("Jan", 50);
        Leader l1 = new Leader("Eagle", 20);
        Hero h3 =(Hero)l1;
        h1.sayHelloTo(h3);
        h3.sayHelloTo(h1);
        Squad s  = new Squad("DELTA");
        s.setLeader(l1);

        try {
            s.addHero(h1);
        } catch (TooManyHeroesException e) {
            e.printStackTrace();
        }
        System.out.println(s);
    }
}

class Hero {
    private String name;
    private int power;

    public String getName() {
        return name;
    }

    public Hero(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public void sayHelloTo(Hero target) {
        System.out.println("Hello, " + target.getName());
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", power=" + power +
                '}';
    }
}

class Leader extends Hero {
    public Leader(String name, int power) {
        super(name, power);
    }
}

class Squad {
    public static final int SQUAD_SIZE = 5;
    private String name;
    private Leader leader;
    private Hero[] heroes;
    private int numberOfHeroes;

    public Squad(String name) {
        this.name = name;
        this.heroes = new Hero[SQUAD_SIZE];
    }

    public void setLeader(Leader leader) {
        this.leader = leader;
    }

    public void addHero(Hero hero) {
        if (numberOfHeroes == SQUAD_SIZE) {
            throw new TooManyHeroesException();
        }
        heroes[numberOfHeroes++] = hero;
    }

    @Override
    public String toString() {
        return "Squad{" +
                "name='" + name + '\'' +
                ", leader=" + leader +
                ", heroes=" + Arrays.toString(heroes) +
                ", numberOfHeroes=" + numberOfHeroes +
                '}';
    }
}

class TooManyHeroesException extends IllegalStateException {
    public TooManyHeroesException(){
        super("Cannot add new hero.");
    }
}
