package pl.basics6.ppj.c09.donkey;

public class Donkey {

    private double mass;
    private Baloon[] baloons;
    private int baloonCounter = 0;

    public Donkey(double mass) {
        this.mass = mass;
    }

    public void addBaloon(Baloon baloon) {
        baloonCounter++;
        if (baloons == null) {
            baloons = new Baloon[0];
        }
        if (baloons.length == 0) {
            baloons = new Baloon[1];
            baloons[0] = baloon;
        } else {
            if (baloonCounter >= baloons.length) {
                Baloon[] temp = new Baloon[baloons.length * 2];
                for (int i = 0; i < baloons.length; i++) {
                    temp[i] = baloons[i];
                }
                temp[baloons.length] = baloon;
                baloons = temp;
            } else {
                baloons[baloonCounter] = baloon;
            }
        }
    }

    private double getLiftAllBaloons() {
        if (baloons == null || baloons.length == 0) {
            return 0;
        }
        double uplift = 0;
        for (Baloon baloon : baloons) {
            if (baloon != null) {
                uplift += baloon.getLoad();
            }
        }
        return uplift;
    }

    public boolean isFlying() {
        boolean result = mass < getLiftAllBaloons();
        if (result) {
            System.out.println("Osioł krzyczy radośnie: \"Ja latam!!!\"");
        } else {
            System.out.println("Za mało balonów, obecnie jest: " + baloonCounter);
        }
        return result;
    }

    public int getBaloonsCount() {
        return baloonCounter;
    }

}
