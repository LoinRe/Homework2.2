//факультет Когтевран
public class Ravenclaw extends Hogwarts {
    //Когтевранцы умны, мудры и полны творчества.
    private int intelligence;
    private int wisdom;
    private int creativity;

    //конструктор
    public Ravenclaw(String name, int magicPower, int transgressionDistance, int intelligence, int wisdom, int creativity) {
        super(name, magicPower, transgressionDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.creativity = creativity;
    }

    //метод вывода описания студентов
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Ум: " + intelligence + ", Мудрость: " + wisdom + ", Творчество: " + creativity);
    }

    //метод сравнение студентов с одного факультета
    public void compareStudents(Ravenclaw anotherStudent) {
        int totalScoreThis = intelligence + wisdom + creativity;
        int totalScoreAnother = anotherStudent.intelligence + anotherStudent.wisdom + anotherStudent.creativity;
        if (totalScoreThis > totalScoreAnother) {
            System.out.println(super.getName() + " лучший когтевранец, чем " + anotherStudent.getName());
        } else if (totalScoreAnother > totalScoreThis) {
            System.out.println(anotherStudent.getName() + " лучший когтевранец, чем " + super.getName());
        } else {
            System.out.println("У студентов с когтеврана одинаковое количество баллов");
        }
    }
}
