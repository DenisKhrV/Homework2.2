public class Slytherin extends Hogwarts {
    private int cunning;
    private int ambition;
    private int lustForPower;

    public Slytherin(String name, int powerOfSorcery, int transgression, int cunning, int ambition, int lustForPower) {
        super(name, powerOfSorcery, transgression);
        this.cunning = cunning;
        this.ambition = ambition;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    @Override
    public String toString() {
        return "Slytherin{" +
                "cunning=" + cunning +
                ", ambition=" + ambition +
                ", lustForPower=" + lustForPower +
                '}';
    }
}
