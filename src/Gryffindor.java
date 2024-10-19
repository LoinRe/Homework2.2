//факультет Гриффиндор
public class Gryffindor extends Hogwarts {
    //Всем Гриффиндорцам присущи благородство, честь и храбрость. от 0- до 100
    private int nobility;
    private int honor;
    private int bravery;

    //конструктор
    public Gryffindor(String name, int magicPower, int transgressionDistance, int nobility, int honor, int bravery) {
        super(name, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    //метод вывода описания студентов
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Благородство: " + nobility + ", Честь: " + honor + ", Храбрость: " + bravery);
    }

    //метод сравнение студентов с одного факультета
    public void compareStudents(Gryffindor anotherStudent) {
        int totalScoreThis = nobility + honor + bravery;
        int totalScoreAnother = anotherStudent.nobility + anotherStudent.honor + anotherStudent.bravery;
        if (totalScoreThis > totalScoreAnother) {
            System.out.println(super.getName() + " лучший гриффиндорец, чем " + anotherStudent.getName());
        } else if (totalScoreAnother > totalScoreThis) {
            System.out.println(anotherStudent.getName() + " лучший гриффиндорец, чем " + super.getName());
        } else {
            System.out.println("У студентов с гриффиндора одинаковое количество баллов");
        }
    }
}