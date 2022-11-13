public class Main {
    static class Lerner {
        String name;
        short age;

        Lerner(Lerner le) {
            name = le.name;
            age = le.age;
        }

        Lerner(String name, short age) {
            this.name = name;
            this.age = age;
        }
    }

    static class schoollerner extends Lerner {
        short clas;

        schoollerner(String name, short age, short clas) {
            super(name, age);
            this.clas = clas;
        }
    }

    class Student extends Lerner {
        short curse;

        Student(String name, short age, short curse) {
            super(name, age);
            this.curse = curse;
        }
    }

    public void main(String[] args) {
        Lerner[] mas = new Lerner[2];
        Student st = new Student(" ", (short) 0, (short) 0);
        mas[0] = new schoollerner("1", (short) 13, (short) 7);
        mas[0] = new Student("1", (short) 21, (short) 4);
        for (int i = 0; i < mas.length; i++) {
            if (mas[i].getClass() == mas[0].getClass()) {
                System.out.println(mas[i].name + " is " + mas[i].getClass());
            }

        }
        System.out.println("Второй класс");
        for (int i = 0; i < mas.length; i++) {
            if (mas[i].getClass() != mas[0].getClass()) {
                System.out.println(mas[i].name + " is " + mas[i].getClass());
            }

        }
    }
}