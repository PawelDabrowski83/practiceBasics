package pl.basics9.gui.cw02.task2;

public abstract class Spiewak {
    String nazwisko;
    static int counter = 1;
    int numerStartowy;

    public Spiewak(String nazwisko){
        this.nazwisko = nazwisko;
        this.numerStartowy = counter++;
    }

    public abstract String spiewaj();

    @Override
    public String toString(){
        return "(" + numerStartowy + ") " + nazwisko + ": " + spiewaj();
    }

    public static Spiewak najglosniej(Spiewak[] spiewacy){
        int loudestSong = countUppercase(spiewacy[0].spiewaj());
        Spiewak loudest = spiewacy[0];
        for (int i = 1; i < spiewacy.length; i++) {
            Spiewak current = spiewacy[i];
            if(countUppercase(current.spiewaj()) > loudestSong){
                loudestSong = countUppercase(current.spiewaj());
                loudest = spiewacy[i];
            }
        }
        return loudest;
    }

    private static int countUppercase(String word){
        int uppercaseLetters = 0;
        for (char c : word.toCharArray()){
            if(Character.isUpperCase(c)){
                uppercaseLetters++;
            }
        }
        return uppercaseLetters;
    }
}
