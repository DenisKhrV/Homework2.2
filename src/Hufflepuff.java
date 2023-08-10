public class Hufflepuff extends Hogwarts{
    private int industriousness;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int powerOfSorcery, int transgression, int industriousness, int loyalty, int honesty) {
        super(name, powerOfSorcery, transgression);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    @Override
    public int calculateSpecificScore() {
        return industriousness + loyalty + honesty;
    }

    @Override
    public String toString() {
        return "Hufflepuff{" +
                "industriousness=" + industriousness +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                "} " + super.toString();
    }
}
