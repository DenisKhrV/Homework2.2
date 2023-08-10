public abstract class Hogwarts {
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

    private void compareGeneralScore(Hogwarts hogwarts) {
        System.out.println("Сравнение учеников разных факультетов: ");
        int thisScore = this.getPowerOfSorcery() + this.getTransgression();
        int otherScore = hogwarts.getPowerOfSorcery() + hogwarts.getTransgression();

        if (thisScore > otherScore) {
            System.out.println(this.getName() + " сильнее чем " + hogwarts.getName());
        } else if (thisScore < otherScore) {
            System.out.println(hogwarts.getName() + " сильнее чем " + this.getName());
        } else {
            System.out.println(this.getName() + " и " + hogwarts.getName() + " равны по силе");
        }
        System.out.println();
    }

    public abstract int calculateSpecificScore();
    public void compare (Hogwarts hogwarts) {
        if (this.getClass().equals(hogwarts.getClass())) {
            compareSpecificScore(hogwarts);
        }else{
            compareGeneralScore(hogwarts);
        }
    }

    private void compareSpecificScore(Hogwarts hogwarts) {
        System.out.println("Сравнение учеников одного факультета "+ hogwarts.getClass()+": ");
        int thisScore = this.calculateSpecificScore();
        int otherScore = hogwarts.calculateSpecificScore();
        if (thisScore > otherScore) {
            System.out.println(this.getName() + " сильнее чем " + hogwarts.getName());
        } else if (thisScore < otherScore) {
            System.out.println(hogwarts.getName() + " сильнее чем " + this.getName());
        } else {
            System.out.println(this.getName() + " и " + hogwarts.getName() + " равны по силе");
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return  name +
                ", powerOfSorcery=" + powerOfSorcery +
                ", transgression=" + transgression +
                ", ";
    }
}
