public class Hogwarts {
    private String name;
    private int powerOfSorcery;
    private int transgression;

    public Hogwarts(String name, int powerOfSorcery, int transgression) {
        this.name = name;
        this.powerOfSorcery = powerOfSorcery;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public int getPowerOfSorcery() {
        return powerOfSorcery;
    }

    public int getTransgression() {
        return transgression;
    }

    @Override
    public String toString() {
        return  name +
                ", powerOfSorcery=" + powerOfSorcery +
                ", transgression=" + transgression +
                ", ";
    }
}
