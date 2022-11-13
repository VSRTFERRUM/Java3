import java.util.Random;
public class Main {
    public static Random rd=new Random();
     static class Reader
    {
        String name;
        int num;
        int[] bd;
        int[] ph;
        Reader(String name)
        {
            this.name=name;
            num=rd.nextInt(1000,10000);
            bd=new int[3];
            bd[0]=rd.nextInt(1,31);
            bd[1]=rd.nextInt(1,12);
            bd[2]=rd.nextInt(1900,2022);
            ph=new int[5];
            ph[0]=rd.nextInt(1,50);
            ph[1]=rd.nextInt(100,999);
            ph[2]=rd.nextInt(100,999);
            ph[3]=rd.nextInt(0,99);
            ph[4]=rd.nextInt(0,99);
        }
        void takeBook(Book [] taken)
        {
            System.out.print(name+" взял "+taken.length+" книг: ");
            for (int i = 0; i< taken.length;i++)
            {
                System.out.print(taken[i].name+" ");
            }
        }
        void returnBook(Book [] taken)
    {
        System.out.print(name+" вернул "+taken.length+" книг: ");
        for (int i = 0; i< taken.length;i++)
        {
            System.out.print(taken[i].name+" ");
        }
    }
    }
    static class Book
    {
        String author;
        String name;
        Book(String author,  String name)
        {
            this.author=author;
            this.name=name;
        }
    }
    public static void main(String[] args)
    {
        Reader rd=new Reader("1");
        Book [] lib= new Book[4];
        lib[0]=new Book("Толстой", "Война и мир");
        lib[1]=new Book("Пушкин", "Евгнений Онегин ");
        lib[2]=new Book("Лем", "Солярис");
        lib[3]=new Book("Пелевин", "Чапаев и Пустота");
        rd.takeBook(lib);
        rd.returnBook(lib);
    }
}