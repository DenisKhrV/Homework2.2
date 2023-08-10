public class Main {
    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor("Гарри Поттер", 75, 62, 85, 96, 93);
        Gryffindor hermioneGranger = new Gryffindor("Гермиона Грейнджер", 95, 88, 70, 75, 86);
        Gryffindor ronWeasley = new Gryffindor("Рон Уизли", 65, 67, 90, 99, 60);
        Hufflepuff zachariasSmith = new Hufflepuff("Захария Смит", 77, 63, 65, 32, 55);
        Hufflepuff cedricDiggory = new Hufflepuff("Седрик Диггори", 65, 80, 40, 80, 47);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Джастин Финч-Флетчли", 87, 25, 69, 44, 82);
        Ravenclaw zhouChang = new Ravenclaw("Чжоу Чанг", 47, 29, 87, 66, 59, 57);
        Ravenclaw padmaPatil = new Ravenclaw("Падма Патил", 89, 82, 49, 58, 62, 78);
        Ravenclaw marcusBelby = new Ravenclaw("Маркус Белби", 64, 29, 84, 75, 60, 72);
        Slytherin dracoMalfoy = new Slytherin("Драко Малфой", 80, 60, 50, 62, 84, 67, 89);
        Slytherin grahamMontagu = new Slytherin("Грэхэм Монтегю", 70, 68, 56, 80, 60,54,38);
        Slytherin gregoryGoyle = new Slytherin("Грегори Гойл", 61, 40, 74, 55, 75,57,48);

        hermioneGranger.compare(zachariasSmith);
        harryPotter.compare(hermioneGranger);
        printDescription(harryPotter);
        printDescription(zachariasSmith);
        System.out.println(harryPotter);


    }


    public static void printDescription(Gryffindor gryffindor) {
        System.out.println(gryffindor.getName() +
                ": Умение колдовать = " + gryffindor.getPowerOfSorcery() +
                "; Трансгрессия = " + gryffindor.getTransgression() +
                "; Благородство = " + gryffindor.getNobility() +
                "; Честь = " + gryffindor.getHonor() +
                "; Храбрость = " + gryffindor.getCourage());
        System.out.println();
    }

    public static void printDescription(Hufflepuff hufflepuff) {
        System.out.println(hufflepuff.getName() +
                ": Умение колдовать = " + hufflepuff.getPowerOfSorcery() +
                "; Трансгрессия = " + hufflepuff.getTransgression() +
                "; Трудолюбие = " + hufflepuff.getIndustriousness() +
                "; Верность = " + hufflepuff.getLoyalty() +
                "; Честность = " + hufflepuff.getHonesty());
        System.out.println();
    }

    public static void printDescription(Ravenclaw ravenclaw) {
        System.out.println(ravenclaw.getName() +
                ": Умение колдовать = " + ravenclaw.getPowerOfSorcery() +
                "; Трансгрессия = " + ravenclaw.getTransgression() +
                "; Ум = " + ravenclaw.getIntelligence() +
                "; Мудрость = " + ravenclaw.getWisdom() +
                "; Творчество = " + ravenclaw.getCreation() +
                "; Остроумие = " + ravenclaw.getWit());
        System.out.println();
    }
    public static void printDescription(Slytherin slytherin) {
        System.out.println(slytherin.getName() +
                ": Умение колдовать = " + slytherin.getPowerOfSorcery() +
                "; Трансгрессия = " + slytherin.getTransgression() +
                "; Хитрость = " + slytherin.getCunning() +
                "; Амбициозность = " + slytherin.getAmbition() +
                "; Жажда власти = " + slytherin.getLustForPower() +
                "; Решительность = " + slytherin.getDetermination() +
                "; Находчивость = " + slytherin.getResourcefulness());
        System.out.println();
    }
}