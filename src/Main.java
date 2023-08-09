public class Main {
    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor("Гарри Поттер", 75, 62, 85, 96, 93);
        Gryffindor hermioneGranger = new Gryffindor("Гермиона Грейнджер", 95, 88, 70, 75, 86);
        Gryffindor ronWeasley = new Gryffindor("Рон Уизли", 65, 67, 90, 99, 60);
        Hufflepuff zachariasSmith = new Hufflepuff("Захария Смит", 77, 63, 65, 32, 55);
        Hufflepuff cedricDiggory = new Hufflepuff("Седрик Диггори", 65, 80, 40, 80, 47);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Джастин Финч-Флетчли", 87, 25, 69, 44, 82);
        Ravenclaw zhouChang = new Ravenclaw("Чжоу Чанг", 47, 29, 87, 66, 59);
        Ravenclaw padmaPatil = new Ravenclaw("Падма Патил", 89, 82, 49, 58, 62);
        Ravenclaw marcusBelby = new Ravenclaw("Маркус Белби", 64, 29, 84, 75, 60);
        Slytherin dracoMalfoy = new Slytherin("Драко Малфой", 80, 60, 50, 62, 84);
        Slytherin grahamMontagu = new Slytherin("Грэхэм Монтегю", 70, 68, 56, 80, 60);
        Slytherin gregoryGoyle = new Slytherin("Грегори Гойл", 61, 40, 74, 55, 75);

        printDescription(harryPotter);
        printDescription(zachariasSmith);
        printDescription(marcusBelby);
        printDescription(dracoMalfoy);
        compareGryffindorStudents(hermioneGranger,ronWeasley);
        compareHufflepuffStudents(cedricDiggory,justinFinchFletchley);
        compareRavenclawStudents(zhouChang,padmaPatil);
        compareSlytherinStudents(grahamMontagu, dracoMalfoy);
        compareHogwartsStudents(harryPotter, gregoryGoyle);

    }

    public static void compareHogwartsStudents(Hogwarts firstStudent, Hogwarts secondStudent) {
        int firstStudentPower = firstStudent.getPowerOfSorcery() + firstStudent.getTransgression();
        int secondStudentPower = secondStudent.getPowerOfSorcery() + secondStudent.getTransgression();
        if (firstStudentPower > secondStudentPower) {
            System.out.println(firstStudent.getName() + " обладает бОльшей мощностью магии, чем " + secondStudent.getName());
        } else {
            System.out.println(secondStudent.getName() + " обладает бОльшей мощностью магии, чем " + firstStudent.getName());
        }
    }

    public static void printDescription(Gryffindor gryffindor) {
        System.out.println(gryffindor.getName() +
                ": Умение колдовать = " + gryffindor.getPowerOfSorcery() +
                "; Трансгрессия = " + gryffindor.getTransgression() +
                "; Благородство = " + gryffindor.getNobility() +
                "; Честь = " + gryffindor.getHonor() +
                "; Храбрость = " + gryffindor.getCourage());
    }

    public static void printDescription(Hufflepuff hufflepuff) {
        System.out.println(hufflepuff.getName() +
                ": Умение колдовать = " + hufflepuff.getPowerOfSorcery() +
                "; Трансгрессия = " + hufflepuff.getTransgression() +
                "; Трудолюбие = " + hufflepuff.getIndustriousness() +
                "; Верность = " + hufflepuff.getLoyalty() +
                "; Честность = " + hufflepuff.getHonesty());
    }

    public static void printDescription(Ravenclaw ravenclaw) {
        System.out.println(ravenclaw.getName() +
                ": Умение колдовать = " + ravenclaw.getPowerOfSorcery() +
                "; Трансгрессия = " + ravenclaw.getTransgression() +
                "; Ум = " + ravenclaw.getIntelligence() +
                "; Мудрость = " + ravenclaw.getWisdom() +
                "; Творчество = " + ravenclaw.getCreation());
    }
    public static void printDescription(Slytherin slytherin) {
        System.out.println(slytherin.getName() +
                ": Умение колдовать = " + slytherin.getPowerOfSorcery() +
                "; Трансгрессия = " + slytherin.getTransgression() +
                "; Хитрость = " + slytherin.getCunning() +
                "; Амбициозность = " + slytherin.getAmbition() +
                "; Жажда власти = " + slytherin.getLustForPower());
    }
    public static void compareGryffindorStudents(Gryffindor firstStudent, Gryffindor secondStudent) {
        int firstStudentPower = firstStudent.getCourage() + firstStudent.getNobility()+firstStudent.getHonor();
        int secondStudentPower = secondStudent.getCourage() + secondStudent.getNobility()+secondStudent.getHonor();
        if (firstStudentPower > secondStudentPower) {
            System.out.println(firstStudent.getName() + " лучший Гриффиндорец, чем " + secondStudent.getName());
        } else {
            System.out.println(secondStudent.getName() + " лучший Гриффиндорец, чем " + firstStudent.getName());
        }
    }
    public static void compareHufflepuffStudents(Hufflepuff firstStudent, Hufflepuff secondStudent) {
        int firstStudentPower = firstStudent.getIndustriousness() + firstStudent.getLoyalty()+firstStudent.getHonesty();
        int secondStudentPower = secondStudent.getIndustriousness() + secondStudent.getLoyalty()+secondStudent.getHonesty();
        if (firstStudentPower > secondStudentPower) {
            System.out.println(firstStudent.getName() + " лучший Пуффендуец, чем " + secondStudent.getName());
        } else {
            System.out.println(secondStudent.getName() + " лучший Пуффендуец, чем " + firstStudent.getName());
        }
    }
    public static void compareRavenclawStudents(Ravenclaw firstStudent, Ravenclaw secondStudent) {
        int firstStudentPower = firstStudent.getCreation() + firstStudent.getWisdom()+firstStudent.getIntelligence();
        int secondStudentPower = secondStudent.getCreation() + secondStudent.getWisdom()+secondStudent.getIntelligence();
        if (firstStudentPower > secondStudentPower) {
            System.out.println(firstStudent.getName() + " лучший Когтевранец, чем " + secondStudent.getName());
        } else {
            System.out.println(secondStudent.getName() + " лучший Когтевранец, чем " + firstStudent.getName());
        }
    }
    public static void compareSlytherinStudents(Slytherin firstStudent, Slytherin secondStudent) {
        int firstStudentPower = firstStudent.getCunning() + firstStudent.getAmbition()+firstStudent.getLustForPower();
        int secondStudentPower = secondStudent.getCunning() + secondStudent.getAmbition()+secondStudent.getLustForPower();
        if (firstStudentPower > secondStudentPower) {
            System.out.println(firstStudent.getName() + " лучший Слизеринец, чем " + secondStudent.getName());
        } else {
            System.out.println(secondStudent.getName() + " лучший Слизеринец, чем " + firstStudent.getName());
        }
    }
}