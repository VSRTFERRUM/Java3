import  java.util.Formatter;
public class Main {
   public static Formatter f = new Formatter();

    class Emploee
    {
        String fullname;
        double sallary;
    }
    class Report
    {
        void generateReport( Emploee[] mas)
        {
            for (int i = 0; i<10; i++)
            {
                System.out.println(mas[i].fullname+ " "+String.format("%15s",f.format("%(.2f",Double.toString(mas[i].sallary))));
            }
        }
    }
    public  Emploee[] mas = new Emploee[10];
    public static void main(String[] args)
    {
//        System.out.println(String.format("%15s",f.format("%(.2f",93.0)));

    }
}