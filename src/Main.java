public class Main {
    public static void main(String[] args) {
        Gryffindor harry = new Gryffindor("Гарри Поттер", 94, 90, 90, 90, 85);
        Gryffindor hermione = new Gryffindor("Гермиона Грейнджер", 89, 60, 80, 90, 85);
        Gryffindor ron = new Gryffindor("Рон Уизли", 80, 45, 70, 85, 65);
        harry.printInfo();
        hermione.printInfo();
        ron.printInfo();

        Slytherin draco = new Slytherin("Драко Малфой", 90, 50, 85, 80, 90);
        Slytherin graham = new Slytherin("Грэхэм Монтегю", 70, 50, 75, 70, 80);
        Slytherin gregory = new Slytherin("Грегори Гойл", 50, 40, 70, 60, 50);
        draco.printInfo();
        graham.printInfo();
        gregory.printInfo();

        Hufflepuff zaharia = new Hufflepuff("Захария Смит",60, 50, 90, 80, 90);
        Hufflepuff cedric = new Hufflepuff("Седрик Диггори",60, 50, 90, 80, 90);
        Hufflepuff justin = new Hufflepuff("Джастин Финч-Флетчли",60, 40, 70, 67, 70);
        zaharia.printInfo();
        cedric.printInfo();
        justin.printInfo();

        Ravenclaw cho = new Ravenclaw("Чжоу Чанг",70, 70, 90, 86, 76);
        Ravenclaw padma = new Ravenclaw("Падма Патил",80, 70, 70, 85, 87);
        Ravenclaw markus = new Ravenclaw("Маркус Белби",75, 65, 80, 70, 75);
        cho.printInfo();
        padma.printInfo();
        markus.printInfo();

        System.out.println("-----------");
        //Сравнение студентов с одного факультета
        hermione.compareStudents(ron);
        draco.compareStudents(gregory);
        cedric.compareStudents(zaharia);
        markus.compareStudents(padma);

        System.out.println("-----------");
        //Сравнение двух любых учеников (статический метод)
//        Hogwarts.compareDifferentStudents(draco, harry);
//        Hogwarts.compareDifferentStudents(padma, ron);

        //Сравнение двух любых учеников (нестатический метод)
        hermione.compareMagicAndTransgression(draco);
        padma.compareMagicAndTransgression(ron);
        markus.compareMagicAndTransgression(cedric);
    }
}