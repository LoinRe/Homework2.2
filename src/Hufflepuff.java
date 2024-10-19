//факультет Пуффендуй
public class Hufflepuff extends Hogwarts {
    //Студенты Пуффендуя трудолюбивы, верны, честны.
    private int hardWorking;
    private int loyalty;
    private int honesty;

    //конструктор
    public Hufflepuff(String name, int magicPower, int transgressionDistance, int hardWorking, int loyalty, int honesty) {
        super(name, magicPower, transgressionDistance);
        this.hardWorking = hardWorking;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    //метод вывода описания студентов
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Трудолюбие: " + hardWorking + ", Верность: " + loyalty + ", Честность: " + honesty);
    }

    //метод сравнение студентов с одного факультета
    public void compareStudents(Hufflepuff anotherStudent) {
        int totalScoreThis = hardWorking + loyalty + honesty;
        int totalScoreAnother = anotherStudent.hardWorking + anotherStudent.loyalty + anotherStudent.honesty;
        if (totalScoreThis > totalScoreAnother) {
            System.out.println(super.getName() + " лучший пуффендуец, чем " + anotherStudent.getName());
        } else if (totalScoreAnother > totalScoreThis) {
            System.out.println(anotherStudent.getName() + " лучший пуффендуец, чем " + super.getName());
        } else {
            System.out.println("У студентов с пуффендуя одинаковое количество баллов");
        }
    }
}
