public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int courage;

    public Gryffindor(String name, int powerOfSorcery, int transgression, int nobility, int honor, int courage) {
        super(name, powerOfSorcery, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getCourage() {
        return courage;
    }


    @Override
    public int calculateSpecificScore() {
        return nobility + honor + courage;
    }

    @Override
    public String toString() {
        return "Gryffindor{" +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", courage=" + courage +
                "} " + super.toString();
    }
}
