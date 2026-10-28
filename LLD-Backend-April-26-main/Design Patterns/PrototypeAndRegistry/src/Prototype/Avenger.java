package Prototype;

public class Avenger implements Prototype<Avenger>{

    String name;
    int power;
    String planet;
    String teamName;

    public Avenger() {
    }

    public Avenger(String name, int power, String planet, String teamName) {
        this.name = name;
        this.power = power;
        this.planet = planet;
        this.teamName = teamName;
    }

    public Avenger(Avenger avenger) {
        this.name = avenger.name;
        this.planet = avenger.planet;
        this.power = avenger.power;
        this.teamName = avenger.teamName;
    }

    @Override
    public Avenger clone() {
        return new Avenger(this);
    }
}
