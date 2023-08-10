public class Slytherin extends Hogwarts {
    private int cunning;
    private int ambition;
    private int lustForPower;
    private int determination;
    private int resourcefulness;


    public Slytherin(String name, int powerOfSorcery, int transgression, int cunning, int ambition, int lustForPower, int determination, int resourcefulness) {
        super(name, powerOfSorcery, transgression);
        this.cunning = cunning;
        this.ambition = ambition;
        this.lustForPower = lustForPower;
        this.determination = determination;
        this.resourcefulness = resourcefulness;

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

    public int getDetermination() {
        return determination;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    @Override
    public int calculateSpecificScore() {
        return cunning + ambition + lustForPower + determination + resourcefulness;
    }

    @Override
    public String toString() {
        return "Slytherin{" +
                "cunning=" + cunning +
                ", ambition=" + ambition +
                ", lustForPower=" + lustForPower +
                ", determination=" + determination +
                ", resourcefulness=" + resourcefulness +
                "} " + super.toString();
    }
}
