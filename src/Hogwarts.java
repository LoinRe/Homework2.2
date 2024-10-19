public class Hogwarts {
    //Абсолютно все ученики школы Хогвартс умеют колдовать с мощностью в сколько-то баллов и могут трансгрессировать на какое-то расстояние.
    private String name;
    private int magicPower;
    private int transgressionDistance;

    //конструктор
    public Hogwarts(String name, int magicPower, int transgressionDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    //геттеры
    public String getName() {
        return name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    //метод вывод описания студентов
    public void printInfo() {
        System.out.println("Студент: " + name + ", магическая сила: " + magicPower + ", расстояние трансгрессии: " + transgressionDistance);
    }

    //статический метод сравнения двух любых учеников (геттеры можно отключить)
//    public static void compareDifferentStudents(Hogwarts student1, Hogwarts student2) {
//        if (student1.magicPower > student2.magicPower) {
//            System.out.println(student1.name + " обладает бОльшей мощностью магии, чем " + student2.name);
//        } else if (student2.magicPower > student1.magicPower) {
//            System.out.println(student2.name + " обладает бОльшей мощностью магии, чем " + student1.name);
//        } else {
//            System.out.println("Магические силы у " + student1.name + " и " + student2.name + " равны");
//        }
//
//        if (student1.transgressionDistance > student2.transgressionDistance) {
//            System.out.println(student1.name + " трансгрессирует на большее расстояние, чем " + student2.name);
//        } else if (student2.transgressionDistance > student1.transgressionDistance) {
//            System.out.println(student2.name + " трансгрессирует на большее расстояние, чем " + student1.name);
//        } else {
//            System.out.println(student1.name + " и " + student2.name + " трансгрессируют на одинаковое расстояние");
//        }
//    }

    //нестатический метод сравнения двух любых учеников (с геттерами)
    public void compareMagicAndTransgression(Hogwarts other) {
        if (this.magicPower > other.getMagicPower()) {
            System.out.println(this.name + " обладает бОльшей мощностью магии, чем " + other.name);
        } else if (other.magicPower > this.getMagicPower()) {
            System.out.println(other.name + " обладает бОльшей мощностью магии, чем " + this.name);
        } else {
            System.out.println("Магические силы у " + this.name + " и " + other.name + " равны");
        }

        if (this.transgressionDistance > other.getTransgressionDistance()) {
            System.out.println(this.name + " трансгрессирует на большее расстояние, чем " + other.name);
        } else if (other.transgressionDistance > this.getTransgressionDistance()) {
            System.out.println(other.name + " трансгрессирует на большее расстояние, чем " + this.name);
        } else {
            System.out.println(this.name + " и " + other.name + "трансгрессируют на одинаковое расстояние.");
        }
    }
}
