import java.util.Random;
public class Main {
    public static Random rd= new Random();
    public static void main(String[] args)
    {
        int[] mas = new int[4];
        int ch=0;
        boolean check =true;
        System.out.println("Массив: ");
        for (int i = 0; i<4; i++)
        {
            mas[i]=rd.nextInt(10,99);
            System.out.print(mas[i]+" ");
            if (ch <mas[i])                ch = mas[i];
            else check=false;
        }
        if (check) System.out.println('\n'+"Последовательность строго возрастающая");

    }
}