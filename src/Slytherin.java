//факультет Слизерин
public class Slytherin extends Hogwarts{
    //Всем ученикам Слизерина присущи хитрость, решительность, амбициозность
    private int cunning;
    private int determination;
    private int ambition;

    //конструктор
    public Slytherin(String name, int magicPower, int transgressionDistance, int cunning, int determination, int ambition){
        super(name, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
    }

    //метод вывода описания студентов
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Хитрость: " + cunning + ", Решительность: " + determination + ", Амбициозность: " + ambition);
    }

    //метод сравнение студентов с одного факультета
    public void compareStudents(Slytherin anotherStudent) {
        int totalScoreThis = cunning + determination + ambition;
        int totalScoreAnother = anotherStudent.cunning + anotherStudent.determination + anotherStudent.ambition;
        if (totalScoreThis > totalScoreAnother) {
            System.out.println(super.getName() + " лучший слизеринец, чем " + anotherStudent.getName());
        } else if (totalScoreAnother > totalScoreThis) {
            System.out.println(anotherStudent.getName() + " лучший слизеринец, чем " + super.getName());
        } else {
            System.out.println("У студентов со слизерина одинаковое количество баллов");
        }
    }
}