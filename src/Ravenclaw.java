public class Ravenclaw extends Hogwarts{
    private int intelligence;
    private int wisdom;
    private int creation;

    public Ravenclaw(String name, int powerOfSorcery, int transgression, int intelligence, int wisdom, int creation) {
        super(name, powerOfSorcery, transgression);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.creation = creation;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getCreation() {
        return creation;
    }

    @Override
    public String toString() {
        return "Ravenclaw{" +
                "intelligence=" + intelligence +
                ", wisdom=" + wisdom +
                ", creation=" + creation +
                '}';
    }
}
