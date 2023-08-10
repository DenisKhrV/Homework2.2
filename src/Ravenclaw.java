public class Ravenclaw extends Hogwarts{
    private int intelligence;
    private int wisdom;
    private int creation;
    private int wit;

    public Ravenclaw(String name, int powerOfSorcery, int transgression, int intelligence, int wisdom, int creation, int wit) {
        super(name, powerOfSorcery, transgression);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.creation = creation;
        this.wit = wit;
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

    public int getWit() {
        return wit;
    }

    @Override
    public int calculateSpecificScore() {
        return intelligence + wisdom + wit + creation;
    }

    @Override
    public String toString() {
        return "Ravenclaw{" +
                "intelligence=" + intelligence +
                ", wisdom=" + wisdom +
                ", creation=" + creation +
                ", wit=" + wit +
                "} " + super.toString();
    }
}
